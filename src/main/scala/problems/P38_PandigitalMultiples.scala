package problems

import utils.EulerMath.*
import scala.annotation.tailrec

/*
  Take the number 192 and multiply it by each of 1, 2, and 3:
  192 × 1 = 192
  192 × 2 = 384
  192 × 3 = 576
  By concatenating each product we get the 1 to 9 pandigital, 192384576.
  We will call 192384576 the concatenated product of 192 and (1,2,3)
  The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5,
  giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).
  
  What is the largest 1 to 9 pandigital 9-digit number that can be formed
  as the concatenated product of an integer with (1,2, ... , n) where n > 1?
  
  https://projecteuler.net/problem=38
*/

def pandigitalMultiplesMax(): Int =

  val pans = for {
    x <- 1 to 10000
    pan = countPandigit(x, 9)
    if pan > 0
  } yield pan
  pans.max

def countPandigit(number: Int, digitsNumber: Int): Int =

  @tailrec
  def loop(multi: Int, digits: Seq[Int]): Int =
    val s = digits ++ stringToDigitSeq((number * multi).toString)
    if s.length < digitsNumber then
      loop(multi + 1, s)
    else if s.length == digitsNumber && isPandigital(s, digitsNumber) then
      digitSeqToBigInt(s).toInt
    else
      -1

  loop(1, Seq())