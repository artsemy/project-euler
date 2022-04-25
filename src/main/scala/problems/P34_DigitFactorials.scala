package problems

import utils.EulerMath._

/*
  145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.

  Find the sum of all numbers which are equal to the sum of the factorial of their digits.
  Note: As 1! = 1 and 2! = 2 are not sums they are not included.

  https://projecteuler.net/problem=34
*/

def digitFactorialsSum(): Int =
  val factSeq = (0 to 9).map(fact(_).toInt)
  val numbers = for {
    x1 <- 0 to 9
    x2 <- 0 to 9
    x3 <- 0 to 9
    x4 <- 0 to 9
    x5 <- 0 to 9
    x6 <- 0 to 9
    x7 <- 0 to 9
    maybe = x1 * 1000000 + x2 * 100000 + x3 * 10000 + x4 * 1000 + x5 * 100 + x6 * 10 + x7
    factSum = stringToDigitSeq(maybe.toString).map(factSeq).sum
    if maybe == factSum
  } yield maybe
  numbers.sum - 3
