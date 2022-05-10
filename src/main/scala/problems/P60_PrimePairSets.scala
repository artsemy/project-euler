package problems

import utils.EulerMath.*
import scala.annotation.tailrec

/*
  The primes 3, 7, 109, and 673, are quite remarkable. By taking any two primes and concatenating them
  in any order the result will always be prime. For example, taking 7 and 109, both 7109 and 1097 are prime.
  The sum of these four primes, 792, represents the lowest sum for a set of four primes with this property.

  Find the lowest sum for a set of five primes for which any two primes concatenate to produce another prime.

  https://projecteuler.net/problem=60
*/

def primePairSetsSum(size: Int): Int =
  val pr = getPrimes(10000)
  val f1 = for {
    x1 <- pr.to(LazyList)
    s1 = pr.filter(isCompositePrime(_, x1))
    x2 <- s1
    s2 = s1.filter(isCompositePrime(_, x2))
    x3 <- s2
    s3 = s2.filter(isCompositePrime(_, x3))
    x4 <- s3
    s4 = s3.filter(isCompositePrime(_, x4))
    x5 <- s4
  } yield Seq(x1, x2, x3, x4, x5)
  f1.head.sum

def isCompositePrime(x1: Int, x2: Int): Boolean =
  val p1 = concatNumbers(x1, x2)
  val p2 = concatNumbers(x2, x1)
  isPrime(p1.toInt) && isPrime(p2.toInt)

