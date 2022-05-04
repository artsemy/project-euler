package problems

import utils.EulerMath._

/*
  By replacing the 1st digit of the 2-digit number *3, it turns out that six of the nine possible values:
  13, 23, 43, 53, 73, and 83, are all prime.
  By replacing the 3rd and 4th digits of 56**3 with the same digit, this 5-digit number is the first example
  having seven primes among the ten generated numbers, yielding the family:
  56003, 56113, 56333, 56443, 56663, 56773, and 56993. Consequently 56003, being the first member of this family,
  is the smallest prime with this property.

  Find the smallest prime which, by replacing part of the number (not necessarily adjacent digits)
  with the same digit, is part of an eight prime value family.

  https://projecteuler.net/problem=51
*/

def primeDigitReplacementsMin(amount: Int): Int =
  val primes = getPrimes(1000000)
  val primesSet = primes.toSet
  primes.dropWhile(x => !(hasSameDigits(x) && primeCompanionsSameLength(x, primesSet).size == amount)).head

def hasSameDigits(n: Int): Boolean =
  val sNumber = n.toString
  sNumber != sNumber.distinct

def primeCompanionsSameLength(n: Int, primesSet: Set[Int]): Set[Int] =
  val sNumber = n.toString
  val repeatedDigit = sNumber.diff(sNumber.distinct).head
  val comp = (0 to 9).map(x => sNumber.replaceAll(repeatedDigit.toString, x.toString)).filterNot(_.startsWith("0"))
  comp.map(_.toInt).filter(primesSet.contains).toSet