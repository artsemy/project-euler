package problems

/*
  The sum of the squares of the first ten natural numbers is, 1^2 + ... + 10^2 = 385
  The square of the sum of the first ten natural numbers is, (1 + ... + 10)^2 = 3025
  Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
  3025 - 385 = 2640.

  Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

  https://projecteuler.net/problem=6
*/

object P06_SumSquareDifference:

  def countDifference(number: Int): Int =

    val list = (1 to number).toList

    def countSumOfSquares: Int =
      list.map(x => x * x).sum

    def countSquareOfSum: Int =
      val sum = list.sum
      sum * sum

    countSquareOfSum - countSumOfSquares
