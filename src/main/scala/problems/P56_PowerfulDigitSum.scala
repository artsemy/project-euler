package problems

import utils.EulerMath._

/*
  A googol (10^100) is a massive number: one followed by one-hundred zeros;
  100^100 is almost unimaginably large: one followed by two-hundred zeros. Despite their size,
  the sum of the digits in each number is only 1.

  Considering natural numbers of the form, ab, where a, b < 100, what is the maximum digital sum?

  https://projecteuler.net/problem=56
*/

def powerfulDigitSum(): Int =
  val res = for {
    a <- 1 until 100
    b <- 1 until 100
    x = powFrom(a)(b)
  } yield BigIntToDigitSeq(x).sum
  res.max