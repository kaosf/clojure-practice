;(!= 0 0)
;(/= 0 0)
(defn ne [x y] (not (= x y)))
(defn ne [x y] ((complement =) x y))

(defn isnum [x] (= (type x) java.lang.Long))

(defn f [c] (tree-seq sequential? #(recude concat '() c)))

(f '((1 2) (3 (4 5))))

(tree-seq )


(flatten '(1 2 (3 4) [5] 6 7 {8 9}))
;-> (1 2 3 4 5 6 7 {8 9})
(flatten '(1 2 (3 4) [5] 6 7 (8 (9))))
;-> (1 2 3 4 5 6 7 8 9)

(rest (tree-seq sequential? seq '(1 2 (3 4) [5] 6 7 (8 (9)))))
;-> (1 2 (3 4) 3 4 [5] 5 6 7 (8 (9)) 8 (9) 9)
(tree-seq sequential? seq '(1 2 (3 4) [5] 6 7 (8 (9))))
;-> ((1 2 (3 4) [5] 6 7 (8 (9))) 1 2 (3 4) 3 4 [5] 5 6 7 (8 (9)) 8 (9) 9)

(filter #(complement sequential?) (rest (tree-seq sequential? seq '(1 2 (3 4) [5] 6 7 (8 (9))))))
;-> (1 2 3 4 5 6 7 8 9)
