package problems2

import scala.annotation.tailrec

/*
  Some positive integers n have the property that the sum [ n + reverse(n) ]
  consists entirely of odd (decimal) digits. For instance, 36 + 63 = 99 and
  409 + 904 = 1313. We will call such numbers reversible; so 36, 63, 409,
  and 904 are reversible. Leading zeroes are not allowed in either n or reverse(n).
  There are 120 reversible numbers below one-thousand.

  How many reversible numbers are there below one-billion (109)?

  https://projecteuler.net/problem=145
*/

@tailrec
def oddsOnly(n: BigInt): Boolean =
    if n == 0 then
      true
    else if (n % 10) % 2 == 1 then
      oddsOnly(n / 10)
    else
      false

def isReversed(n: BigInt): Boolean =
  if n % 10 == 0 then
    false
  else
    val rev = BigInt(n.toString.reverse)
    val sum = n + rev
    oddsOnly(sum)

def reversibleNumbersBelowBillion(border: Int): Int =
  (1 to border).count(isReversed)
