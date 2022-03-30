package problems

import scala.annotation.tailrec

/*
  2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

  What is the sum of the digits of the number 2^1000?

  https://projecteuler.net/problem=16
*/

object P16_PowerDigitSum:

  def pDigitSum(number: Int, deg: Int): Int =

    val digitsList = number.toString.map(_ - 48).reverse

    @tailrec
    def multiply(digitsList: Seq[Int], res: Seq[Int], add: Int = 0): Seq[Int] =
      if digitsList.isEmpty then
        if add == 0 then
          res
        else
          res :+ add
      else
        val m = digitsList.head * number + add
        multiply(digitsList.tail, res :+ (m % 10), m / 10)

    @tailrec
    def loop(digitsList: Seq[Int], n: Int): Int =
      if n == 1 then
        digitsList.sum
      else
        val newDigitsList = multiply(digitsList, Nil)
        loop(newDigitsList, n - 1)

    if deg == 0 then 
      1
    else
      loop(digitsList, deg)
