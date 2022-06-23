package problems2

import scala.annotation.tailrec

/*
  Working from left-to-right if no digit is exceeded by the digit to its left it is called
  an increasing number; for example, 134468.
  Similarly if no digit is exceeded by the digit to its right it is called
  a decreasing number; for example, 66420.
  We shall call a positive integer that is neither increasing nor decreasing
  a "bouncy" number; for example, 155349.
  Clearly there cannot be any bouncy numbers below one-hundred,
  but just over half of the numbers below one-thousand (525) are bouncy.
  In fact, the least number for which the proportion of bouncy numbers first reaches 50% is 538.
  Surprisingly, bouncy numbers become more and more common
  and by the time we reach 21780 the proportion of bouncy numbers is equal to 90%.

  Find the least number for which the proportion of bouncy numbers is exactly 99%.

  https://projecteuler.net/problem=112
*/

def isIncreasingNumber(n: Int): Boolean =
  @tailrec
  def iter(last: Int, numberLeft: Int): Boolean =
    val k = numberLeft % 10
    numberLeft == 0 || (k <= last && iter(k, numberLeft / 10))

  iter(n % 10, n / 10)

def isDecreasingNumber(n: Int): Boolean =
  @tailrec
  def iter(last: Int, numberLeft: Int): Boolean =
    val k = numberLeft % 10
    numberLeft == 0 || (k >= last && iter(k, numberLeft / 10))

  iter(n % 10, n / 10)

def numberOfProportion(proportion: Int): Int =
  @tailrec
  def iter(number: Int, bounced: Int, unBounced: Int): Int =
    if unBounced * proportion == bounced then
      number
    else if isIncreasingNumber(number) || isDecreasingNumber(number) then
      iter(number + 1, bounced, unBounced + 1)
    else
      iter(number + 1, bounced + 1, unBounced)

  iter(21780, 19602, 2178)