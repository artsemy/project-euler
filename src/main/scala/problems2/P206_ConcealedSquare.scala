package problems2

import utils.EulerMath.*
import scala.annotation.tailrec

/*
  Find the unique positive integer whose square has the form 1_2_3_4_5_6_7_8_9_0,
  where each “_” is a single digit.
  
  https://projecteuler.net/problem=206
*/

def concealedSquare(): BigInt =

  @tailrec
  def loop(i: BigInt): BigInt =
    val squared = i * i
    if isMasked(squared) then
      i
    else
      loop(i + 1)

  loop(BigInt("1111111111"))

def isMasked(i:  BigInt): Boolean =
  val seq = BigIntToDigitSeq(i)
  seq.length == 19 && seq.last == 0 && (1 to 8).forall(x => seq(2 * x) == x + 1) && seq.head == 1