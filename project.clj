(defproject bocko-canvas "1.0.0"
  :description "Render Bocko into a canvas element"
  :url "https://github.com/mfikes/bocko-canvas"
  :license {:name "Eclipse"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths  ["src"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.293" :scope "provided"]
                 [bocko "1.0.0"]]
  :plugins [[lein-cljsbuild "1.1.4"]])
