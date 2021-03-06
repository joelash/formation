(defproject com.ben-allred/formation "0.3.0"
  :description "A validation and conforming library for nested data structures"
  :url "https://github.com/skuttleman/formation"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/cljc"]
  :test-paths ["test/cljc"]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.9.946"]]
  :plugins [[lein-cljsbuild "1.1.6"]
            [com.jakemccrary/lein-test-refresh "0.22.0"]
            [cider/cider-nrepl "0.16.0"]]
  :hooks [leiningen.cljsbuild]

  :profiles {:dev {:clean-targets ^{:protect false :replace true} ["resources/public/js"
                                                                   :target-path]}}

  :cljsbuild {:builds {:build {:source-paths ["src/cljc"]
                               :compiler     {:output-to     "resources/public/js/formation.js"
                                              :optimizations :advanced
                                              :pretty-print  false}}}})
