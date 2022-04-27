package problems

import utils.EulerMath._

/*
  An irrational decimal fraction is created by concatenating the positive integers:
  0.123456789101112131415161718192021...
  It can be seen that the 12th digit of the fractional part is 1.
  If d_n represents the n-th digit of the fractional part, find the value of the following expression.

  d_1 × d_10 × d_100 × d_1000 × d_10000 × d_100000 × d_1000000

  https://projecteuler.net/problem=40
*/

val forChampernownesSeq = stringToDigitSeq((0 to 200000).mkString)

def champernownesConstant(index: Int): Int =
  forChampernownesSeq(index)

def champernownesConstantMulti(indexes: Seq[Int]): Int =
  indexes.map(champernownesConstant).product
