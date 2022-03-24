package problems

/*
  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
  The sum of these multiples is 23.

  Find the sum of all the multiples of 3 or 5 below 1000.

  https://projecteuler.net/problem=1
*/

object P01_MultiplesOf3Or5:

  def countSum(upperBorder: Int): Int =
    val d1 = (upperBorder - 1) / 3
    val d2 = (upperBorder - 1) / 5
    val d3 = (upperBorder - 1) / 15
    (1 + d1) * d1 / 2 * 3 + (1 + d2) * d2 / 2 * 5 - (1 + d3) * d3 / 2 * 15
