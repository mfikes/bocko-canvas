(defproject bocko-canvas "0.1.0"
  :description "Render Bocko into a canvas element"
  :url "https://github.com/mfikes/bocko-canvas"
  :license {:name "Eclipse"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths  ["src"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3030" :scope "provided"]
                 [bocko "0.3.0"]]
  :plugins [[lein-cljsbuild "1.0.6"]])
