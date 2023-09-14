;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname merge-sort) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))


;; merge sort

;;(listof Number) -> (listof Number)
;; produces sorted list on ascending order using merge sort

(check-expect (merge-sort empty) empty)
(check-expect (merge-sort (list 2)) (list 2))
(check-expect (merge-sort (list 1 2)) (list 1 2))
(check-expect (merge-sort (list 4 3)) (list 3 4))
(check-expect (merge-sort (list 6 5 3 1 8 7 2 4)) (list 1 2 3 4 5 6 7 8))


(define (merge-sort lon)
  (cond [(empty? lon) empty]
        [(empty? (rest lon)) lon]
        [else
         (merge (merge-sort (take lon (quotient (length lon) 2)))
                (merge-sort (drop lon (quotient (length lon) 2))))]))



;;(listof Number) Natural -> (listof Number)
;;Produce new list with first n elements of lon
(check-expect (take empty 0) empty)
(check-expect (take (list 1 2 3 4) 0) empty)
(check-expect (take (list 1 2 3 4 5 6 7 8) 4) (list 1 2 3 4))

(define (take lon n)
  (cond [(= n 0) empty]
        [else
         (cons (first lon) (take (rest lon) (sub1 n)))]))

;;(listof Number) Natural -> (listof Number)
;;Produce new list with last n elements of lon
(check-expect (drop empty 0) empty)
(check-expect (drop (list 1 2 3 4) 0) (list 1 2 3 4))
(check-expect (drop (list 1 2 3 4 5 6 7 8) 4) (list 5 6 7 8))

(define (drop lon n)
  (cond [(= n 0) lon]
        [else
         (drop (rest lon) (sub1 n))]))

;; (listof Number) (listof Number) -> (listof Number)
;; merge two lists into a single list with ascending order
(check-expect (merge empty empty) empty)
(check-expect (merge (list 1) empty) (list 1))
(check-expect (merge empty (list 2)) (list 2))
(check-expect (merge (list 1 2 3 4) (list 5 6 7 8)) (list 1 2 3 4 5 6 7 8))

(define (merge lon1 lon2)
  (cond [(empty? lon1) lon2]
        [(empty? lon2) lon1]
        [else
         (if (<= (first lon1) (first lon2))
             (cons (first lon1) (merge (rest lon1) lon2))
             (cons (first lon2) (merge lon1 (rest lon2))))]))