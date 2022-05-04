package problems

import utils.EulerMath._

/*
  The arithmetic sequence, 1487, 4817, 8147, in which each of the terms increases by 3330, is unusual in two ways:
  (i) each of the three terms are prime, and, (ii) each of the 4-digit numbers are permutations of one another.
  There are no arithmetic sequences made up of three 1-, 2-, or 3-digit primes, exhibiting this property,
  but there is one other 4-digit increasing sequence.

  What 12-digit number do you form by concatenating the three terms in this sequence?

  https://projecteuler.net/problem=49
*/

def primePermutationsLine(): String =
  val primes= getPrimes(10000)
  val matr = for {
    prime <- primes
    permutations = getPrimePermutations(prime, primes.toSet)
    if permutations.nonEmpty
  } yield prime +: permutations
  matr.filter(_.size == 3)(1).mkString

def getPrimePermutations(prime: Int, primes: Set[Int]): Seq[Int] =
  val stepElems = (1 to 3).map(i => prime + 3330 * i)
  val permElems = prime.toString.permutations.map(_.toInt).toSet
  stepElems.filter(primes.contains).filter(permElems.contains)
