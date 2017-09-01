(defproject blog "0.1.0-SNAPSHOT"
  :dependencies [
    [org.clojure/clojure       "1.9.0-alpha19"]
    [ring/ring-core            "1.6.2"]
    [org.immutant/web          "2.1.8"]
    ;; [javax.servlet/servlet-api "2.5"]
    [compojure                 "1.6.0"]
  ]
  :main blog.server
  )

