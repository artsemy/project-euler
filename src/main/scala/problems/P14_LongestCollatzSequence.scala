package problems

import scala.annotation.tailrec

/*
  The following iterative sequence is defined for the set of positive integers:
  n → n/2 (n is even)
  n → 3n + 1 (n is odd)
  Using the rule above and starting with 13, we generate the following sequence:
  13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
  It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
  Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
  
  Which starting number, under one million, produces the longest chain?
  
  https://projecteuler.net/problem=14
*/

def longestCollatzSeq(max: Int): Int =

  @tailrec
  def collatzSeqLength(elem: Long, index: Int = 0): Int =
    if elem == 1 then
      index
    else if elem % 2 == 0 then
      collatzSeqLength(elem / 2, index + 1)
    else
      collatzSeqLength(elem * 3 + 1, index + 1)

  val (maxVal, count) = (1 until max).map(x => x -> collatzSeqLength(x)).maxBy(_._2)
  maxVal
