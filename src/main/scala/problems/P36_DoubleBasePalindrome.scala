package problems

import utils.EulerMath._

/*
  The decimal number, 585 = 10010010012 (binary), is palindromic in both bases.

  Find the sum of all numbers, less than one million, which are palindromic in base 10 and base 2.
  (Please note that the palindromic number, in either base, may not include leading zeros.)

  https://projecteuler.net/problem=36
*/

def doubleBasePalindrome(upperBorder: Int): Int =
  (1 until upperBorder by 2).filter(x => isPalindrome(x) && isPalindrome(x.toBinaryString)).sum
