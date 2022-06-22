package problems

import java.math.{BigDecimal, MathContext, RoundingMode}
import utils.EulerMath.*

/*
  It is well known that if the square root of a natural number is not an integer,
  then it is irrational. The decimal expansion of such square roots is infinite without
  any repeating pattern at all.
  The square root of two is 1.41421356237309504880...,
  and the digital sum of the first one hundred decimal digits is 475.

  For the first one hundred natural numbers,
  find the total of the digital sums of the first one hundred decimal digits for
  all the irrational square roots.

  https://projecteuler.net/problem=80
*/

def squareRootDigitsSum(border: Int, amount: Int): Int =
  val sq = (1 to 10).map(x => x * x)
  val res = for {
    number <- 1 to border
    if !sq.contains(number)
    sqr = BigDecimal(number).sqrt(MathContext(amount, RoundingMode.DOWN))
    sum = decimalDigitsSum(sqr)
  } yield sum
  res.sum

def decimalDigitsSum(number: BigDecimal): Int =
  number
    .toString
    .replace('.', '0')
    .map(x => x.toString.toInt)
    .sum
