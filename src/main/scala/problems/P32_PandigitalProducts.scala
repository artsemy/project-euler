package problems

import utils.EulerMath._

/*
  We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once;
  for example, the 5-digit number, 15234, is 1 through 5 pandigital.
  The product 7254 is unusual, as the identity, 39 × 186 = 7254,
  containing multiplicand, multiplier, and product is 1 through 9 pandigital.

  Find the sum of all products whose multiplicand/multiplier/product identity
  can be written asa 1 through 9 pandigital.
  HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum.

  https://projecteuler.net/problem=32
*/

def isPandigital(a: Int, b: Int, c: Int): Boolean =
  val d1 = stringToDigitSeq(a.toString + b.toString + c.toString).toSet
  d1 == (1 to 9).toSet

def pandigitalProducts(): Int =
  val seq = for {
    x <- (1 until 10000).toSet
    y <- (1 until 10000 / x).toSet
    pr = x * y
    if isPandigital(x, y, pr)
  } yield pr
  seq.sum
