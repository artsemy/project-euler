package problems

import utils.EulerMath._

/*
  The fraction 49/98 is a curious fraction, as an inexperienced mathematician
  in attempting to simplify it may incorrectly believe that 49/98 = 4/8, which is correct,
  is obtained by cancelling the 9s.
  We shall consider fractions like, 30/50 = 3/5, to be trivial examples.
  There are exactly four non-trivial examples of this type of fraction, less than one in value,
  and containing two digits in the numerator and denominator.

  If the product of these four fractions is given in its lowest common terms,
  find the value of the denominator.

  https://projecteuler.net/problem=33
*/

def digitCancellingFractions(): Int =
  val pairs = for {
    x <- 10 to 99
    y <- (x + 1) to 99
  } yield (x, y)
  val filtered = pairs.filter(isSpecialPair).filter((x, y) => x % 10 != 0)
  val (num, den) = simplifyPairsProduct(filtered)
  den

def isSpecialPair(pair: (Int, Int)): Boolean =
  val (x1, x2) = pair
  val digits1 = stringToDigitSeq(x1.toString)
  val digits2 = stringToDigitSeq(x2.toString)
  val intersect = digits1.intersect(digits2)
  val y1 = digits1.diff(intersect).mkString.toIntOption.getOrElse(0)
  val y2 = digits2.diff(intersect).mkString.toIntOption.getOrElse(0)

  intersect.nonEmpty && y1.toDouble / y2 == x1.toDouble / x2

def simplifyPairsProduct(seq: Seq[(Int, Int)]): (Int, Int) =
  val (num, den) = seq.foldLeft(1, 1)((a, b) => (a._1 * b._1, a._2 * b._2))
  val div = getPrimeDividersSeq(num).intersect(getPrimeDividersSeq(den)).product.toInt
  (num / div, den / div)
