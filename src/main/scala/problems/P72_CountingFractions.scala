package problems

import utils.EulerMath.*
import scala.annotation.tailrec

/*
  Consider the fraction, n/d, where n and d are positive integers.
  If n<d and HCF(n,d)=1, it is called a reduced proper fraction.
  If we list the set of reduced proper fractions for d ≤ 8 in ascending order of size, we get:
  1/8, 1/7, 1/6, 1/5, 1/4, 2/7, 1/3, 3/8, 2/5, 3/7, 1/2, 4/7, 3/5, 5/8, 2/3, 5/7, 3/4, 4/5, 5/6, 6/7, 7/8
  It can be seen that there are 21 elements in this set.
  
  How many elements would be contained in the set of reduced proper fractions for d ≤ 1,000,000?
  
  https://projecteuler.net/problem=72
*/

def countingFractions(border: Int): BigInt =
  val pr = getPrimes(border).toSet
  (2 to border).map(x => fi(x, pr)).sum

def fi(n: Int, primes: Set[Int]): BigInt =
  if primes.contains(n) then
    n - 1
  else
    val seq = getPrimeDividersSeq(n).distinct
    n * seq.map(_ - 1).product / seq.product

def countingFractionsV2(border: Int): BigInt =
  var counter: BigInt = 0
  val p = for {
    x <- 1 until border
    y <- (x + 1) to border
    if gcd(x, y) == 1
    _ = counter += 1
  } yield ()
  counter
  