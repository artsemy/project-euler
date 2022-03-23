package exercises

import scala.annotation.tailrec

object LargestPalindromeProduct:

  def largest(digitNumber: Int): Int =

    val min = 10 * (digitNumber - 1)
    val max = Math.pow(10, digitNumber).toInt - 1

    def isPalindrome(n: Int): Boolean =
      val str = n.toString
      str == str.reverse

    def isNDigitProduct(n: Int): Boolean =
      (min to max).exists(x => n % x == 0 && n / x >= min && n /x <= max)

    @tailrec
    def loop(n: Int): Int =
      if isPalindrome(n) && isNDigitProduct(n) then
        n
      else
        loop(n - 1)

    loop(max * max)
