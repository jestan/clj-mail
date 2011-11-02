(defproject org.clojars.hms/clj-mail "0.1.5"
  :description "Send and receive emails from Clojure."
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [javax.mail/mail "1.4.3"]]
  :dev-dependencies [[swank-clojure "1.3.2"]]

  :repositories {"releases" "http://192.168.0.7:8080/archiva/repository/internal/"
                 "snapshots" "http://192.168.0.7:8080/archiva/repository/snapshots/"})
