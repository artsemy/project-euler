package problems

import utils.EulerMath.*

import scala.annotation.tailrec

object P24_LexicographicPermutations:

  def permutation(digits: Seq[Int], position: Int): Seq[Int] =

    @tailrec
    def loop(digits: Seq[Int], reminder: Int, acc: Seq[Int]): Seq[Int] =
      if digits.size == 1 then
        acc :+ digits.head
      else
        val div = fact(digits.length - 1)
        val i = reminder / div
        val rem = reminder % div
        loop(digits.filterNot(_ == digits(i)), rem, acc :+ digits(i))

    loop(digits, position - 1, Seq())
    
  def permutationV2(digits: Seq[Int], position: Int): Seq[Int] =
    digits.permutations.toSeq(position - 1)
