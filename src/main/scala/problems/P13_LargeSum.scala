package problems

import scala.annotation.tailrec

/*
  Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.

  https://projecteuler.net/problem=13
*/

def longNumbersSumFirstDigits(numbers: List[String]): String =
  numbers.map(BigInt(_)).sum.toString().take(10)
  