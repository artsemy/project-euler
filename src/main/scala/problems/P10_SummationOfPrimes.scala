package problems

import scala.annotation.tailrec
import utils.EulerMath._

/*
  The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

  Find the sum of all the primes below two million.

  https://projecteuler.net/problem=10
*/

def sumOfPrimes(border: Int): Long =
  getPrimes(border - 1).map(_.toLong).sum
