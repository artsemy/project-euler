package problems

import scala.annotation.tailrec
import utils.EulerMath._

/*
  2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

  What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

  https://projecteuler.net/problem=5
*/

def findMultiple(border: Int): Int =
  getPrimes(border)
    .foldLeft(BigInt(1))((acc, prime) => powFrom(prime).dropWhile(_ <= border).head / prime * acc).toInt

def findMultipleV2(border: Int): Int =
  val initSeq = (border to 2 by -1).map(getPrimeDividersSeq(_))
  val resSeq = initSeq.foldLeft(Seq(1L))((x, y) => (x concat y) diff (x intersect y))
  resSeq.product.toInt