package problems

/*
  If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
  The sum of these multiples is 23.

  Find the sum of all the multiples of 3 or 5 below 1000.

  https://projecteuler.net/problem=1
*/

def multiplesSumV1(upperBorder: Int, divider1: Int, divider2: Int): Int =

  def multiplesSum(divider: Int): Int =
    val n = multiplesAmount(divider)
    rangeSum(n) * divider

  def multiplesAmount(divider: Int): Int = (upperBorder - 1) / divider

  def rangeSum(upperValue: Int): Int = (1 to upperValue).sum

  multiplesSum(divider1) + multiplesSum(divider2) - multiplesSum(divider1 * divider2)

def multiplesSumV2(upperBorder: Int, divider1: Int, divider2: Int): Int =
  (1 until upperBorder).filter(x => x % divider1 == 0 || x % divider2 == 0)
    .sum
