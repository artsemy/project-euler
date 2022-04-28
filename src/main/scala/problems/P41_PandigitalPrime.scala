package problems

import utils.EulerMath.*

/*
  We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once.
  For example, 2143 is a 4-digit pandigital and is also prime.

  What is the largest n-digit pandigital prime that exists?

  https://projecteuler.net/problem=41
*/

def maxPandigitalPrime(): Int =
  val panPrimes = for {
    len <- 7 to 2 by -1 // Divisibility rule 3 and 9
    panSeq <- (len to 1 by -1).permutations
    if isPrime(digitSeqToBigInt(panSeq).toInt)
  } yield digitSeqToBigInt(panSeq).toInt
  panPrimes.head
