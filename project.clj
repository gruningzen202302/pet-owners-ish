(defproject pet-owners "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [com.datomic/datomic-free "0.9.5697"]
                 [expectations "2.1.10"]
                 [lein-autoexpect "1.0"]]
  :repl-options {:init-ns pet-owners.core})
