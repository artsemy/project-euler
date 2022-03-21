package exercises

object SumSquareDifference:

  def countDifference(number: Int): Int =

    val list = (1 to number).toList

    def countSumOfSquares: Int =
      list.map(x => x * x).sum

    def countSquareOfSum: Int =
      val sum = list.sum
      sum * sum

    countSquareOfSum - countSumOfSquares
