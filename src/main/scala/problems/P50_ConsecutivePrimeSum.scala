package problems

import utils.EulerMath.*
import scala.annotation.tailrec

/*
  The prime 41, can be written as the sum of six consecutive primes:
  41 = 2 + 3 + 5 + 7 + 11 + 13
  This is the longest sum of consecutive primes that adds to a prime below one-hundred.
  The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms,
  and is equal to 953.

  Which prime, below one-million, can be written as the sum of the most consecutive primes?

  https://projecteuler.net/problem=50
*/

def consecutivePrimeSum(upperBorder: Int): Int =
  val primes = getPrimes(upperBorder)
  val primesSet = primes.toSet
  val length = primes.scanLeft(0)(_ + _).takeWhile(_ <= upperBorder).size - 1

  @tailrec
  def loop(startIndex: Int, length: Int): Int =
    val sum = primes.slice(startIndex, startIndex + length).sum
    if primesSet.contains(sum) then
      sum
    else if sum < upperBorder then
      loop(startIndex + 1, length)
    else
      loop(0, length - 1)

  loop(0, length)