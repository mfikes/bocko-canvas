# Bocko Canvas

Using a ClojureScript REPL, you can render [Bocko](https://github.com/mfikes/bocko) into a canvas element.

[![Clojars Project](http://clojars.org/bocko-canvas/latest-version.svg)](http://clojars.org/bocko-canvas)

# Usage

```
lein new bocko my-project
```

Then find a short README.md at the top-level of the generated project, explaining how to get up and running.

# Detailed Usage

In the REPL:

```clojure
(require 'bocko-canvas.core)
(bocko-canvas.core/init (.getElementById js/document "canvas"))
(require '[bocko.core :refer [color plot scrn hlin vlin clear *color*]])
```

Now you can use Bocko, plotting into your canvas.

```
cljs.user=> (color :pink)
nil
cljs.user=> (plot 3 4)
nil
```

# Examples

Try some of the examples from the [Bocko](https://github.com/mfikes/bocko#examples) page.

# Threading Concerns

See [Bocko iOS](https://github.com/mfikes/bocko-ios#threading-concerns).

# License

Distributed under the Eclipse Public License, which is also used by Clojure.
