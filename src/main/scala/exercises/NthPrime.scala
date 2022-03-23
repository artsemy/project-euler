package exercises

import scala.annotation.tailrec

object NthPrime:

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
