package exercises

object MultiplesOf3Or5:

  def countSum(upperBorder: Int): Int =
    (1 until upperBorder).filter(x => x % 3 == 0 || x % 5 == 0).sum
