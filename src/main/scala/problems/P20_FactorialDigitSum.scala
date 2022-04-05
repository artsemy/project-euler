package problems

import scala.annotation.tailrec

/*
  n! means n × (n − 1) × ... × 3 × 2 × 1
  For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
  and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

  Find the sum of the digits in the number 100!

  https://projecteuler.net/problem=20
*/

object P20_FactorialDigitSum:

  @tailrec
  def multiplyDigitSeq(i: Int, input: Seq[Int], add: Int = 0, acc: Seq[Int] = Seq()): Seq[Int] =
    if input.length == 1 then
      val head = (input.head * i + add).toString.map(_ - 48)
      head ++ acc
    else
      val digitMulti = input.last * i + add
      multiplyDigitSeq(i, input.init, digitMulti / 10, digitMulti % 10 +: acc)

  @tailrec
  def factDigitSeq(n: Int, i: Int = 1, acc: Seq[Int] = Seq(1)): Seq[Int] =
    if i > n then
      acc
    else
      val multiAcc = multiplyDigitSeq(i, acc)
      factDigitSeq(n, i + 1, multiAcc)

  def factorDigitSum(n: Int): Int =
    val multi = factDigitSeq(n)
    multi.sum
