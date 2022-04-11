package problems

import utils.EulerMath._

object P24_LexicographicPermutations:

  def permutation(digits: Seq[Int], position: Int): Seq[Int] =

    def loop(digits: Seq[Int], reminder: Int, acc: Seq[Int]): Seq[Int] =
      if digits.size == 1 then
        acc :+ digits.head
      else
        val div = fact(digits.length - 1)
        val i = reminder / div
        val rem = reminder % div

    ???
