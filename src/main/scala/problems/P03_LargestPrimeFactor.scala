package problems

import scala.annotation.tailrec

/*
  The prime factors of 13195 are 5, 7, 13 and 29.

  What is the largest prime factor of the number 600851475143 ?

  https://projecteuler.net/problem=3
*/

object P03_LargestPrimeFactor:

  def largestPrime(n: Long): Long =

    @tailrec
    def isPrime(n: Long, div: Long = 2L): Boolean =
      n == 1 || div == n || n % div != 0 && isPrime(n, div + 1L)

    @tailrec
    def findDiv(div: Long, number: Long): Long =
      if number % div == 0 then
        div
      else
        findDiv(div + 1, number)

    def findMaxDiv(n: Long, curr: Long): Long =
      val div = findDiv(2L, n)
      if isPrime(div) then
        div max curr
      else
        curr

    @tailrec
    def loop(n: Long, res: Long): Long =
      if res >= n then
        res
      else
        val div = findMaxDiv(n, res)
        loop(n / div, div)

    loop(n, 1)
