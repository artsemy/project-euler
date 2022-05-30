package problems

import scala.annotation.tailrec
import utils.EulerMath._

/*
  Comparing two numbers written in index form like 211 and 37 is not difficult,
  as any calculator would confirm that 211 = 2048 < 37 = 2187.
  However, confirming that 632382518061 > 519432525806 would be much more difficult,
  as both numbers contain over three million digits.

  Using base_exp.txt (right click and 'Save Link/Target As...'), a 22K text file
  containing one thousand lines with a base/exponent pair on each line,
  determine which line number has the greatest numerical value.
  NOTE: The first two lines in the file represent the numbers in the example given above.

  https://projecteuler.net/problem=99
*/

def largestExponential(pairs: Seq[(Int, Int)]): Int =
  val p = pairs.map { case (x, y) => (x.toDouble, y) }
  val max = p.max(compareExponents)
  p.indexOf(max) + 1

@tailrec
def compareExponents(x1: (Double, Int), x2: (Double, Int)): Int =
  val (n1, e1) = x1
  val (n2, e2) = x2
  //  println(s"$n1^$e1, $n2^$e2")
  if e1 <= 0 then
    1.0 compare n2
  else if e2 <= 0 then
    n1 compare 1
  else if n1 < n2 then
    compareExponents((n1, e1 - e2), (n2 / n1, e2))
  else if n2 < n1 then
    compareExponents((n1 / n2, e1), (n2, e2 - e1))
  else
    e1 compare e2

def largestExponentialV2(pairs: Seq[(Int, Int)]): Int =

  def compare(x1: (Int, Int), x2: (Int, Int)): Int =
    val (n1, e1) = x1
    val (n2, e2) = x2
    (e1 * Math.log(n1)) compare (e2 * Math.log(n2))

  val max = pairs.max(compare)
  pairs.indexOf(max) + 1