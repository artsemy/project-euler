package problems

import scala.annotation.tailrec

/*
  2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

  What is the sum of the digits of the number 2^1000?

  https://projecteuler.net/problem=16
*/

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
  def loop(acc: Seq[Int], n: Int): Seq[Int] =
    if n == 1 then
      acc
    else
      val newDigitsList = multiply(acc, Nil)
      loop(newDigitsList, n - 1)

  if deg == 0 then 
    1
  else
    loop(digitsList, deg).sum
