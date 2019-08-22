(defproject uwcpdx/stepwise "0.5.9-SNAPSHOT"
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.3.1"]
                                  [org.clojure/clojure "1.10.1"]
                                  [org.clojure/spec.alpha "0.2.176"]
                                  [pjstadig/humane-test-output "0.9.0"]
                                  [org.slf4j/slf4j-simple "1.7.28"]
                                  [com.gfredericks/test.chuck "0.2.10"]
                                  ; TODO pending jdk 9 compat https://github.com/pallet/alembic/pull/16
                                  #_[alembic "0.3.2"]
                                  [org.clojure/test.check "0.10.0"]]
                   :injections   [(require 'pjstadig.humane-test-output)
                                  (pjstadig.humane-test-output/activate!)]
                   :main         stepwise.dev-repl}}
  :deploy-repositories {"clojars" {:url           "https://clojars.org/repo"
                                   :username      :env/CLOJARS_USERNAME
                                   :password      :env/CLOJARS_PASSWORD
                                   :sign-releases false}}
  :dependencies [[uwcpdx/bean-dip "0.7.6"]
                 [org.clojure/tools.logging "0.5.0"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/core.async "0.4.500"]
                 [com.amazonaws/aws-java-sdk-iam "1.11.616"]
                 [com.amazonaws/aws-java-sdk-sts "1.11.616"]
                 [com.amazonaws/aws-java-sdk-stepfunctions "1.11.616"]])

