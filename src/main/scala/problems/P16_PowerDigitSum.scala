package problems

import scala.annotation.tailrec
import utils.EulerMath._

/*
  2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

  What is the sum of the digits of the number 2^1000?

  https://projecteuler.net/problem=16
*/

def pDigitSum(number: Int, deg: Int): Int =
  bigIntToDigitSeq(powFrom(number)(deg)).sum
