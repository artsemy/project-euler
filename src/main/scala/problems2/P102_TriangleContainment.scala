package problems2

/*
  Three distinct points are plotted at random on a Cartesian plane, for which -1000 ≤ x, y ≤ 1000,
  such that a triangle is formed.
  Consider the following two triangles:
  A(-340,495), B(-153,-910), C(835,-947)
  X(-175,41), Y(-421,-714), Z(574,-645)
  It can be verified that triangle ABC contains the origin, whereas triangle XYZ does not.

  Using triangles.txt (right click and 'Save Link/Target As...'),
  a 27K text file containing the co-ordinates of one thousand "random" triangles,
  find the number of triangles for which the interior contains the origin.
  NOTE: The first two examples in the file represent the triangles in the example given above.

  https://projecteuler.net/problem=102
*/

def countContainsOrigin(triangles: Seq[((Int, Int), (Int, Int), (Int, Int))]): Int =
  triangles.count((a, b, c) => containsOrigin(a, b, c))

def containsOrigin(a: (Int, Int), b: (Int, Int), c: (Int, Int)): Boolean =
  a == (0, 0) || b == (0, 0) || c == (0, 0) ||
    Seq(xPositiveCrossCount(a, b), xPositiveCrossCount(a, c), xPositiveCrossCount(b, c))
      .filterNot(_.isEmpty).map(_.get.sign).groupBy(x => x).size > 1

def xPositiveCrossCount(a: (Int, Int), b: (Int, Int)): Option[Double] =
  val (x1, y1) = a
  val (x2, y2) = b
  if y1 == y2 then
    parallelOx(a, b)
  else if x1 == x2 then
    parallelOy(a, b)
  else
    nonParallel(a, b)

private def parallelOx(a: (Int, Int), b: (Int, Int)): Option[Double] =
  None

private def parallelOy(a: (Int, Int), b: (Int, Int)): Option[Double] =
  val (x1, y1) = a
  val (x2, y2) = b
  if y1 * y2 <= 0 then
    Some(x1)
  else
    None

private def nonParallel(a: (Int, Int), b: (Int, Int)): Option[Double] =
  val (x1, y1) = a
  val (x2, y2) = b
  val x = x1 + (-1.0) * y1 * (x2 - x1) / (y2 - y1)
  if x <= (x1 max x2) && x >= (x1 min x2) then
    Some(x)
  else
    None