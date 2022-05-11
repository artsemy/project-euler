package problems

import utils.EulerMath.*
import scala.annotation.tailrec

/*
  The 5-digit number, 16807=75, is also a fifth power.
  Similarly, the 9-digit number, 134217728=89, is a ninth power.

  How many n-digit positive integers exist which are also an nth power?

  https://projecteuler.net/problem=63
*/

def powerfulDigitCounts(): Int =

  @tailrec
  def loop(number: Int, pow: Int = 1, acc: Int = 0): Int =
    if numberLength(powFrom(number)(pow)) == pow then
      loop(number, pow + 1, acc + 1)
    else
      acc

  (1 to 9).map(loop(_)).sum

