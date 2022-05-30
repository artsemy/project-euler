package problems

import scala.annotation.tailrec

/*
In the 5 by 5 matrix below, the minimal path sum from the top left to the bottom right,
by only moving to the right and down, is indicated in bold red and is equal to 2427.
131, 673, 234, 103, 18
201, 96, 342, 965, 150
630, 803,746, 422, 111
537, 699, 497, 121, 956
805, 732, 524, 37, 331

Find the minimal path sum from the top left to the bottom right by only moving right and
down in matrix.txt (right click and "Save Link/Target As..."), a 31K text file
containing an 80 by 80 matrix.
*/

def pathSumTwoWays(matr: Seq[Seq[Int]]): Int =

  val matrix = matr.map(_.toArray).toArray

  for {
    i <- 1 until matrix.length
    _ = matrix(0)(i) += matrix(0)(i - 1)
    _ = matrix(i)(0) += matrix(i - 1)(0)
  } yield ()

  for {
    i <- 1 until matrix.length
    j <- 1 until matrix.length
    _ = matrix(i)(j) += (matrix(i - 1)(j) min matrix(i)(j - 1))
  } yield ()

  matrix.last.last
