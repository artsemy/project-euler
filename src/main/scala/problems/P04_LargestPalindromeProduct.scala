package problems

import scala.annotation.tailrec

/*
  A palindromic number reads the same both ways.
  The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

  Find the largest palindrome made from the product of two 3-digit numbers.

  https://projecteuler.net/problem=4
*/

object P04_LargestPalindromeProduct:

  def largest(digitNumber: Int): Int =

    val min =
      if digitNumber == 1 then
        1
      else
        10 * (digitNumber - 1)
    val max = Math.pow(10, digitNumber).toInt - 1

    def isPalindrome(n: Int): Boolean =
      val str = n.toString
      str == str.reverse

    def isNDigitProduct(n: Int): Boolean =
      (min to max).exists(x => n % x == 0 && n / x >= min && n / x <= max)

    @tailrec
    def loop(n: Int): Int =
      if isPalindrome(n) && isNDigitProduct(n) then
        n
      else
        loop(n - 1)

    loop(max * max)
