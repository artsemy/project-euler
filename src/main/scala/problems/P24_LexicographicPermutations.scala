package problems

import utils.EulerMath.*

import scala.annotation.tailrec

/*
  A permutation is an ordered arrangement of objects.
  For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
  If all of the permutations are listed numerically or alphabetically, we call it lexicographic order.
  The lexicographic permutations of 0, 1 and 2 are:
  012   021   102   120   201   210

  What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?

  https://projecteuler.net/problem=24
*/

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
