package problems

import utils.EulerMath._

/*
  The first ten terms in the sequence of convergents for 'e' are:
  (2/1, 3/1, 8/3, 11/4, ...)
  The sum of digits in the numerator of the 10th convergent (1457, 536) is 1 + 4 + 5 + 7 = 17.

  Find the sum of digits in the numerator of the 100th convergent of the continued fraction for 'e'.

  https://projecteuler.net/problem=65
*/

def convergentsOfE(): LazyList[(BigInt, BigInt)] =
  type Pair = (BigInt, BigInt)
  def convergents(x1: Pair = (0, 0), x2: Pair = (2, 1), x3: Pair = (3, 1), n: Int = 2): LazyList[Pair] =
    val nx1 = (x2._1 + n * x3._1, x2._2 + n * x3._2)
    val nx2 = (nx1._1 + x3._1, nx1._2 + x3._2)
    val nx3 = (nx1._1 + nx2._1, nx1._2 + nx2._2)
    x1 #:: x2 #:: x3 #:: convergents(nx1, nx2, nx3, n + 2)

  convergents()

def sumOfDigitsNumeratorOfConvergentOfE(index: Int): Int =
  val (num, den) = convergentsOfE()(index)
  BigIntToDigitSeq(num).sum