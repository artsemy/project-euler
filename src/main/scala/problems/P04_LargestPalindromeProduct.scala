package problems

import scala.annotation.tailrec
import utils.EulerMath.{getAllDividers, getPrimeDividersSeq, isPalindrome}

/*
  A palindromic number reads the same both ways.
  The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

  Find the largest palindrome made from the product of two 3-digit numbers.

  https://projecteuler.net/problem=4
*/

def largest(digitNumber: Int): Int =
  val min = Math.pow(10, digitNumber - 1).toInt
  val max = Math.pow(10, digitNumber).toInt - 1

  def isNDigitProduct(n: Int): Boolean =
    val left = (1.0 * n / max).ceil.toInt
    val right = Math.sqrt(n).toInt
    (left to right).exists(x => n % x == 0)

  @tailrec
  def loop(n: Int): Int =
    if isPalindrome(n) && isNDigitProduct(n) then
      n
    else
      loop(n - 1)

  loop(max * max)

def largestV2(digitNumber: Int): Int =
  val min = Math.pow(10, digitNumber - 1).toInt
  val max = Math.pow(10, digitNumber).toInt - 1

  @tailrec
  def loop(upBorder: Int, lowBorder: Int, saveUp: Int, saveLow: Int, max: Int): Int =
    val pr = upBorder * lowBorder
    if isPalindrome(pr) then
      loop(upBorder, lowBorder + 1, upBorder, lowBorder, Math.max(pr, max))
    else if lowBorder > upBorder && saveUp > saveLow then
      loop(upBorder - 1, saveLow, upBorder - 1, saveLow, max)
    else if saveUp > saveLow then
      loop(upBorder, lowBorder + 1, saveUp, saveLow, max)
    else
      max

  loop(max, min, max, min, 0)

def largestV3(digitNumber: Int): Int =
  val min = Math.pow(10, digitNumber - 1).toInt
  val max = Math.pow(10, digitNumber).toInt - 1

  (for {
    number <- (max * max to 1 by -1).to(LazyList)
    if isPalindrome(number)
    left = (1.0 * number / max).ceil.toInt
    right = Math.sqrt(number).toInt
    div1 <- (left to right).to(LazyList)
    if number % div1 == 0
  } yield number).head