package problems

import utils.EulerMath._

/*
  The prime factors of 13195 are 5, 7, 13 and 29.

  What is the largest prime factor of the number 600851475143 ?

  https://projecteuler.net/problem=3
*/

def largestPrimeFactor(n: Long): Long = getPrimeDividersSeq(n).last
