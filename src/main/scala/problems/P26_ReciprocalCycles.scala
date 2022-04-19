package problems

import utils.EulerMath.*

import scala.annotation.tailrec

/*
  A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions
  with denominators 2 to 10 are given:
  1/2	= 	0.5
  1/3	= 	0.(3)
  1/4	= 	0.25
  1/5	= 	0.2
  1/6	= 	0.1(6)
  1/7	= 	0.(142857)
  1/8	= 	0.125
  1/9	= 	0.(1)
  1/10	= 	0.1
  Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle.
  It can be seen that 1/7 has a 6-digit recurring cycle.

  Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.

  https://projecteuler.net/problem=26
*/

def longestReciprocalCycle(upperBorder: Int): Int =

  @tailrec
  def countCycle(s: String, len: Int, min: Int = 0): Int =
    if len == 0 then
      min
    else if s.take(len) == s.slice(len, len + len) then
      countCycle(s, len - 1, len)
    else
      countCycle(s, len - 1, min)

  val numberCycleLength = for {
    prime <- getPrimes(upperBorder - 1)
    div = BigInt("1" + "0" * prime * 2) / prime
    cycle = countCycle(div.toString(), prime - 1)
  } yield (prime, cycle)
  val (number, cycleLength) = numberCycleLength.maxBy((x, y) => y)
  number