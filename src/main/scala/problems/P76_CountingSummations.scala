package problems

import scala.annotation.tailrec

/*
  It is possible to write five as a sum in exactly six different ways:
  4 + 1
  3 + 2
  3 + 1 + 1
  2 + 2 + 1
  2 + 1 + 1 + 1
  1 + 1 + 1 + 1 + 1
  
  How many different ways can one hundred be written as a sum of at least two positive integers?
  
  https://projecteuler.net/problem=76
*/

def countingSummations(n: Int): BigInt =
  coinSums((n - 1) to 1 by -1, n)