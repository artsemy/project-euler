package problems

import utils.EulerMath._

/*
  A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
  a^2 + b^2 = c^2
  For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
  
  There exists exactly one Pythagorean triplet for which a + b + c = 1000.
  Find the product abc.
  
  https://projecteuler.net/problem=9
*/

def specialPythagoreanTripletProduct(sum: Int): Int =
  val a: (Int, Int) => Int = (m, n) => m * m - n * n
  val b: (Int, Int) => Int = (m, n) => 2 * m * n
  val c: (Int, Int) => Int = (m, n) => m * m + n * n
  val dividers = getAllDividers(sum / 2).map(_.toInt) //type
  lazy val pairs = for {
    m <- dividers
    n <- dividers
    if m > n && m * (m + n) == sum / 2
  } yield (m, n)

  if !isEven(sum) || pairs.isEmpty then
    0
  else
    val (m, n) = pairs.head
    a(m, n) * b(m, n) * c(m, n)
