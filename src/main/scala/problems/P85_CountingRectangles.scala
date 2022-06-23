package problems

/*
  By counting carefully it can be seen that a rectangular grid measuring 3 by 2
  contains eighteen rectangles

  Although there exists no rectangular grid that contains exactly two million rectangles,
  find the area of the grid with the nearest solution.

  https://projecteuler.net/problem=85
*/

def countRectangles(n: Int, m: Int): Int =
  val res = for {
    i <- 1 to n
    j <- 1 to m
  } yield i * j
  res.sum

def countRectanglesV2(n: Int, m: Int): Int =
  (n + 1) * (m + 1) * n * m / 4

def findAreaWithNumberOfRectangles(near: Int): Int =
  val res = for {
    n <- 1 to 100
    m <- 1 to 100
  } yield (Math.abs(near - countRectanglesV2(n, m)), n, m)
  val (_, y, z) = res.minBy(x => x._1)
  y * z
