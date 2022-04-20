package problems

import scala.annotation.tailrec

/*
  Starting with the number 1 and moving to the right in a clockwise direction
  a 5 by 5 spiral is formed as follows:
  21 22 23 24 25
  20  7  8  9 10
  19  6  1  2 11
  18  5  4  3 12
  17 16 15 14 13
  It can be verified that the sum of the numbers on the diagonals is 101.

  What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?

  https://projecteuler.net/problem=28
*/

def numberSpiralDiagonals(n: Int): Int =

  @tailrec
  def loop(n: Int, lastNumber: Int = 1, step: Int = 2, acc: Int = 1): Int =
    if n == 1 then
      acc
    else
      val newAcc = acc + lastNumber * 4 + step * 10
      loop(n - 2, lastNumber + step * 4, step + 2, newAcc)

  loop(n)
