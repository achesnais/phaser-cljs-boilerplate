(defproject phaser-cljs-boilerplate "0.1.0-SNAPSHOT"
  :description "A boilerplate for writing games in clojurescript using phaser.io."
  :url "https://github.com/achesnais/phaser-cljs-boilerplate"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.122"]]
  :plugins [[lein-cljsbuild "1.1.0"]
            [lein-figwheel "0.4.1"]]
  :cljsbuild
  {:builds [{:id "main"
             :source-paths ["src/"]
             :figwheel true
             :compiler {:main "game.core"
                        :asset-path "js/out"
                        :output-to "resources/public/js/game.js"
                        :output-dir "resources/public/js/out"}}]}
  :figwheel
  {:http-server-root "public"
   :server-pot 3449
   :server-ip "0.0.0.0"
   :nrepl-port 7888})
