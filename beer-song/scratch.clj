(defn repeat-str [n strng]
  (->> (repeat n strng)
       (clojure.string/join "")))

(ns clojure.string-repeat-test
  (:require [clojure.string-repeat :refer :all]
            [clojure.test :refer :all]))

(deftest simple-test
  (is (= (repeat-str 4 "a") "aaaa"))
  (is (= (repeat-str 3 "hello ") "hello hello hello "))
  (is (= (repeat-str 2 "abc") "abcabc")))
; (ns rock-paper-scissors)

; (defn repeat-str [n strng]
;   (->> (repeat n strng)
;        (clojure.string/join "")))


; (defn rps
;   "passes in both player's move as args"
;   [p1 p2]

;   (let [
;         rock "scissor"
;         paper "rock"
;         scissor "paper"
;         ]
;     winning-map)

;   (->> get winning-map p1
;        (if (= p2)
;          "Player 2 wins"
;          "Player 1 wins")))
