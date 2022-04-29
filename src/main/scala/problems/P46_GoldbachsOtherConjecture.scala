package problems

import utils.EulerMath._

/*
  It was proposed by Christian Goldbach that every odd composite number can be written as
  the sum of a prime and twice a square.
  9 = 7 + 2×12
  15 = 7 + 2×22
  21 = 3 + 2×32
  25 = 7 + 2×32
  27 = 19 + 2×22
  33 = 31 + 2×12
  It turns out that the conjecture was false.
  
  What is the smallest odd composite that cannot be written as the sum of a prime and twice a square?
  
  https://projecteuler.net/problem=46
*/

def goldbachsOtherConjecture(): Int =
  val twiceSquareSet = (1 to 54).map(x => x * x * 2).toSet
  val primesSet = getPrimes(6000).toSet

  val res = for {
    i <- (3 to 6000 by 2).to(LazyList)
    if !primesSet.contains(i) && !isTwiceSquareAndPrimeSum(i, primesSet, twiceSquareSet)
  } yield i

  res.head

def isTwiceSquareAndPrimeSum(i: Int, primesSet: Set[Int], twiceSquareSet: Set[Int]): Boolean =
  primesSet.exists(prime => twiceSquareSet.exists(twice => i == prime + twice))