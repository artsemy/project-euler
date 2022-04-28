package problems

import utils.EulerMath._

/*
  The number, 1406357289, is a 0 to 9 pandigital number because
  it is made up of each of the digits 0 to 9 in some order,
  but it also has a rather interesting sub-string divisibility property.
  Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we note the following:
  d2d3d4=406 is divisible by 2
  d3d4d5=063 is divisible by 3
  d4d5d6=635 is divisible by 5
  d5d6d7=357 is divisible by 7
  d6d7d8=572 is divisible by 11
  d7d8d9=728 is divisible by 13
  d8d9d10=289 is divisible by 17

  Find the sum of all 0 to 9 pandigital numbers with this property.

  https://projecteuler.net/problem=43
*/

def subStringDivisibilitySum(): Long =
  val digitsSeq = (0 to 9).permutations.dropWhile(_.head == 0)
  val filtered = digitsSeq.filter(x => x(3) % 2 == 0 && x(5) % 5 == 0).filter(checkAllProperties)
  filtered.map(digitSeqToBigInt(_).toLong).sum

def checkProperty(index: Int, seq: Seq[Int], div: Int): Boolean =
  seq.slice(index, index + 3).mkString.toInt % div == 0

def checkAllProperties(seq: Seq[Int]): Boolean =
  Seq(2, 4, 5, 6, 7).zip(Seq(3, 7, 11, 13, 17)).forall((i, div) => checkProperty(i, seq, div))

def subStringDivisibilitySumV2(): Long =
  val seq = for {
    d1 <- 1 to 9
    d2 <- 0 to 9
    d3 <- 0 to 9
    d4 <- 0 to 8 by 2
    d5 <- (0 to 9).filter(x => (x + d4 + d3) % 3 == 0)
    d6 <- Seq(0, 5)
    d7 <- (0 to 9).filter(x => ((d5 * 10 + d6) * 3 + x) % 7 == 0)
    d8 <- (0 to 9).filter(x => (d6 + x - d7) % 11 == 0)
    d9 <- (0 to 9).filter(x => (d7 * 10 + d8 + 4 * x) % 13 == 0)
    d10 <- (0 to 9).filter(x => (d8 * 10 + d9 + 12 * x) % 17 == 0)
    numberSeq = Seq(d1, d2, d3, d4, d5, d6, d7, d8, d9, d10)
    if isPandigital(numberSeq, 9, 0)
  } yield digitSeqToBigInt(numberSeq).toLong
  seq.sum