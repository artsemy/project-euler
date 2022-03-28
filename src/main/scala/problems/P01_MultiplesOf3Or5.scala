package problems

/*
  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
  The sum of these multiples is 23.

  Find the sum of all the multiples of 3 or 5 below 1000.

  https://projecteuler.net/problem=1
*/

object P01_MultiplesOf3Or5:

  def countSumV1(upperBorder: Int, divider1: Int, divider2: Int): Int =

    def multiplesNumber(divider: Int): Int = (upperBorder - 1) / divider

    def countRangeSum(upperValue: Int): Int = (1 to upperValue).sum

    def countMultipleSum(divider: Int): Int =
      val n = multiplesNumber(divider)
      countRangeSum(n) * divider

    countMultipleSum(divider1) + countMultipleSum(divider2) - countMultipleSum(divider1 * divider2)

  def countSumV2(upperBorder: Int, divider1: Int, divider2: Int): Int =
    (1 until upperBorder).filter(x => x % divider1 == 0 || x % divider2 == 0)
      .sum
    