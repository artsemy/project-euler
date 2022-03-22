package exercises

import scala.annotation.tailrec

object LargestPrimeFactor:

  def largestPrime(n: Long): Long =

    @tailrec
    def isPrime(n: Long, div: Long = 2L): Boolean =
      n == 1 || div == n || n % div != 0 && isPrime(n, div + 1L)

    def maxDiv(x: Long, y: Long): Long =
      if x > y then
        x
      else
        y

    @tailrec
    def firstDiv(div: Long, number: Long): Long =
      if number % div == 0 then
        div
      else
        firstDiv(div + 1, number)

    def findDiv(n: Long, curr: Long): Long =
      val div = firstDiv(2L, n)
      if isPrime(div) then
        maxDiv(div, curr)
      else curr

    @tailrec
    def loop(n: Long, res: Long): Long =
      if res > n then
        res
      else
        val div = findDiv(n, res)
        loop(n / div, div)

    loop(n, 1)
