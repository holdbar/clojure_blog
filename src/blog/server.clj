(ns blog.server
  (:require
    [immutant.web :as web]))


(def app
  (fn [req]
    { :status 200
      :body "OK"}))


(defn -main [& args]
  (web/run #'app { :port 8080 }))
