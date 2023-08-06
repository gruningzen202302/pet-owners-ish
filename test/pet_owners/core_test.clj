(ns pet-owners.core-test
  (:require [expectations :refer :all]
            [datomic.api :as d]
            [pet-owners.core :refer :all]))

(defn create-empty-in-memory-db []
  (let [uri "datomic.mem://pet-owners-test-db"]
    (d/delete-database uri)
    (d/create-database uri)
    (let [conn (d/connect uri) schema (load-file "")]
      (d/transact conn schema)
      conn)))

