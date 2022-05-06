package problems

import scala.annotation.tailrec
import utils.EulerMath._

/*
  A palindromic number reads the same both ways.
  The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

  Find the largest palindrome made from the product of two 3-digit numbers.

  https://projecteuler.net/problem=4
*/

def largest(digitNumber: Int): BigInt =
  val max = maxNDigitNumber(digitNumber)

  def isNDigitProduct(n: BigInt): Boolean =
    (n / max to max).exists(x => n % x == 0 && n / x <= max)

  @tailrec
  def loop(n: BigInt): BigInt =
    if isPalindrome(n) && isNDigitProduct(n) then
      n
    else
      loop(n - 1)

  loop(max * max)

def largestV2(digitNumber: Int): BigInt =
  val min = minNDigitNumber(digitNumber)
  val max = maxNDigitNumber(digitNumber)

//  first - find start interval (99, 99) -> (99, 98) -> ... -> (99, 85) =>
//  when found saving 'up' 'low' and 'number'
//  then search max inside (98, 98) -> (98, 97) -> ... -> / (98, 85) or (98, 90) / => (97, 97)
//  if upBorder == saveLow return 'number'

  @tailrec
  def loop(upBorder: BigInt, lowBorder: BigInt, saveUp: BigInt, saveLow: BigInt, maxRes: BigInt): BigInt =
    val pr = upBorder * lowBorder
    if isPalindrome(pr) && upBorder > saveLow then
      loop(upBorder - 1, upBorder - 1, upBorder, lowBorder, maxRes max pr)
    else if lowBorder > saveLow then
      loop(upBorder, lowBorder - 1, saveUp, saveLow, maxRes)
    else if lowBorder == saveLow then
      loop(upBorder - 1, upBorder - 1, saveUp, saveLow, maxRes)
    else
      maxRes

  loop(max, max, max, min, 0)
