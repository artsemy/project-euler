package exercises

object MultiplesOf3Or5:

  def countSum(upperBorder: Int): Int =
    val d1 = (upperBorder - 1) / 3
    val d2 = (upperBorder - 1) / 5
    val d3 = (upperBorder - 1) / 15
    (1 + d1) * d1 / 2 * 3 + (1 + d2) * d2 / 2 * 5 - (1 + d3) * d3 / 2 * 15
