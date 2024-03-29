package problems

import utils.EulerMath.*
import scala.annotation.tailrec

/*
  The first known prime found to exceed one million digits was discovered in 1999,
  and is a Mersenne prime of the form 2^6972593−1; it contains exactly 2,098,960 digits.
  Subsequently other Mersenne primes, of the form 2p−1, have been found which contain more digits.
  However, in 2004 there was found a massive non-Mersenne prime which contains 2,357,207 digits:
  28433×2^7830457+1.

  Find the last ten digits of this prime number.

  https://projecteuler.net/problem=97
*/

def largeNonMersennePrimeLastDigits(length: Int): BigInt =
  val divider = powFrom(10)(length)
  val pow = 7830457
  val a = 28433

  @tailrec
  def loop(iter: Int, acc: BigInt): BigInt =
    if iter == pow then
      (a * acc + 1) % divider
    else
      loop(iter + 1, (2 * acc) % divider)

  loop(1, 2)
