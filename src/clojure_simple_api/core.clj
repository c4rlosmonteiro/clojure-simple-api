(ns clojure-simple-api.core
  (:require [ring.adapter.jetty :refer [run-jetty]])
  (:require [compojure.core :refer :all]
            [compojure.route :as route])
  ;(:use ring.adapter.jetty)
  (:gen-class))

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello World"})

(defroutes
  (GET "/" [] "<h1>Hello World</h1>")
  (route/not-found "<h1>Page not found</h1>"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (run-jetty handler {:port 3000}))
