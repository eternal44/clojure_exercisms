(ns beer-song
  (:require [clojure.string :as s]))

(def template "%s bottles of beer on the wall, %s bottles of beer.\nTake one down and pass it around, %s bottles of beer on the wall.\n")

(defn verse
  [verse-number]

  (cond
    (= verse-number 2)
    "2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n"
    (= verse-number 1)
    "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n"
    (zero? verse-number)
    "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
    :else
  (format template verse-number verse-number (dec verse-number))))

(defn sing
  ([starting-verse]
  (sing starting-verse 0))

  ([starting-verse ending-verse]
  (clojure.string/join "\n" (map verse (reverse (range ending-verse (inc starting-verse)))))))

