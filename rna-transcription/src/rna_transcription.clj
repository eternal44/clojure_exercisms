(ns rna-transcription
  (:require [clojure.string :as s]))

(defn to-rna
  [dna]
  (def dna-to-rna {"G" "C"
                   "C" "G"
                   "T" "A"
                   "A" "U"})

  (assert (nil?(re-seq #"[^GCTA]" dna)))
  (s/replace dna #"G|C|T|A" dna-to-rna)
)
