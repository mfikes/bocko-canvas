(ns bocko-canvas.core
  (:require bocko.core))

(defn ^:export init
  "Initializes Bocko to render onto the supplied canvas element."
  [canvas-element]
  (let [ctx (.getContext canvas-element "2d")]
    (bocko.core/set-create-canvas
      (fn [color-map raster width height pixel-width pixel-height]
        (add-watch raster :monitor
          (fn [_ _ old new]
            (when-not (= old new)
              (doseq [x (range width)]
                (let [old-col (nth old x)
                      new-col (nth new x)]
                  (when-not (= old-col new-col)
                    (doseq [y (range height)]
                      (let [old-color (nth old-col y)
                            new-color (nth new-col y)]
                        (when-not (= old-color new-color)
                          (let [[r g b] (new-color color-map)]
                            (set! (.-fillStyle ctx) (str "rgb(" r "," g "," b ")"))
                            (.fillRect ctx (* x pixel-width) (* y pixel-height) pixel-width pixel-height)))))))))))))))