package problems

import scala.annotation.tailrec

/*
  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

  What is the 10 001st prime number?

  https://projecteuler.net/problem=7
*/

object P07_NthPrime:

  def findPrime(n: Int): Int =

    def isPrime(n: Int): Boolean = (2 until n).forall(n % _ != 0)

    @tailrec
    def loop(currNumber: Int, primeCount: Int): Int =
      if primeCount == n then
        currNumber - 1
      else if isPrime(currNumber) then
        loop(currNumber + 1, primeCount + 1)
      else
        loop(currNumber + 1, primeCount)

    loop(2, 0)
