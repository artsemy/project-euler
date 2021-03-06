package problems

import utils.EulerMath._

/*
  Triangle, square, pentagonal, hexagonal, heptagonal, and octagonal numbers are
  all figurate (polygonal) numbers and are generated by the following formulae:
  Triangle	 	P3,n=n(n+1)/2	 	1, 3, 6, 10, 15, ...
  Square	 	P4,n=n2	 	1, 4, 9, 16, 25, ...
  Pentagonal	 	P5,n=n(3n−1)/2	 	1, 5, 12, 22, 35, ...
  Hexagonal	 	P6,n=n(2n−1)	 	1, 6, 15, 28, 45, ...
  Heptagonal	 	P7,n=n(5n−3)/2	 	1, 7, 18, 34, 55, ...
  Octagonal	 	P8,n=n(3n−2)	 	1, 8, 21, 40, 65, ...
  The ordered set of three 4-digit numbers: 8128, 2882, 8281, has three interesting properties.
  The set is cyclic, in that the last two digits of each number is
  the first two digits of the next number (including the last number with the first).
  Each polygonal type: triangle (P3,127=8128), square (P4,91=8281), and pentagonal (P5,44=2882),
  is represented by a different number in the set.
  This is the only set of 4-digit numbers with this property.

  Find the sum of the only ordered set of six cyclic 4-digit numbers for which each polygonal type:
  triangle, square, pentagonal, hexagonal, heptagonal, and octagonal, is represented by a different number in the set.

  https://projecteuler.net/problem=61
*/

def cyclicalFigurateNumbersSum(size: Int): Int =
  val triangle = triangularFrom().takeWhile(_ < 10000).zipWithIndex.dropWhile((l, i) => l < 1000)
  val square = squareFrom().takeWhile(_ < 10000).zipWithIndex.dropWhile((l, i) => l < 1000)
  val pentagonal = pentagonalFrom().takeWhile(_ < 10000).zipWithIndex.dropWhile((l, i) => l < 1000)
  val hexagonal = hexagonalFrom().takeWhile(_ < 10000).zipWithIndex.dropWhile((l, i) => l < 1000)
  val heptagonal = heptagonalFrom().takeWhile(_ < 10000).zipWithIndex.dropWhile((l, i) => l < 1000)
  val octagonal = octagonalFrom().takeWhile(_ < 10000).zipWithIndex.dropWhile((l, i) => l < 1000)
  val all = triangle +: square +: pentagonal +: hexagonal +: heptagonal +: octagonal +: Nil
  val f = for {
    x1 <- triangle
    seq2 <- all.diff(Seq(triangle))
    x2 <- seq2.filter(x => x._1 / 100 == x1._1 % 100)
    seq3 <- all.diff(Seq(triangle, seq2))
    x3 <- seq3.filter(x => x._1 / 100 == x2._1 % 100)
    seq4 <- all.diff(Seq(triangle, seq2, seq3))
    x4 <- seq4.filter(x => x._1 / 100 == x3._1 % 100)
    seq5 <- all.diff(Seq(triangle, seq2, seq3, seq4))
    x5 <- seq5.filter(x => x._1 / 100 == x4._1 % 100)
    seq6 <- all.diff(Seq(triangle, seq2, seq3, seq4, seq5))
    x6 <- seq6.filter(x => x._1 / 100 == x5._1 % 100 && x._1 % 100 == x1._1 / 100)
  } yield (x1, x2, x3, x4, x5, x6)
  val ((x1, _), (x2, _), (x3, _), (x4, _), (x5, _), (x6, _)) = f.head
  (x1 + x2 + x3 + x4 + x5 + x6).toInt
