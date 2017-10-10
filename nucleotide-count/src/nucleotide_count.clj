(ns nucleotide-count)

(Gdefn count
  [dna-type dna-strand]
  (count(filter #{dna-type} dna-strand)))

(defn nucleotide-counts
  [dna-strand])
