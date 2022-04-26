package problems

import utils.EulerMath.*
import scala.annotation.tailrec

/*
  The number 3797 has an interesting property. Being prime itself, it is possible
  to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7.
  Similarly we can work from right to left: 3797, 379, 37, and 3.
  
  Find the sum of the only eleven primes that are both truncatable from left to right and right to left.
  NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
  
  https://projecteuler.net/problem=37
*/

val primesForTruncatable = getPrimes(1000000).toSet

def truncatablePrimesSum(): Int =
  primesForTruncatable.filter(isFullTruncatable).filter(_ > 10).sum

def isFullTruncatable(n: Int): Boolean =
  isLeftTruncable(n) && isRightTruncable(n)

@tailrec
def isLeftTruncable(n: Int): Boolean =
  primesForTruncatable.contains(n) && (n < 10 || isLeftTruncable(n.toString.tail.toInt))

@tailrec
def isRightTruncable(n: Int): Boolean =
  primesForTruncatable.contains(n) && (n < 10 || isRightTruncable(n / 10))