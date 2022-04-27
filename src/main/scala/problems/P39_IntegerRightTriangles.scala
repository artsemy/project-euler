package problems

/*
  If p is the perimeter of a right angle triangle with integral length sides, {a,b,c},
  there are exactly three solutions for p = 120.
  {20,48,52}, {24,45,51}, {30,40,50}

  For which value of p ≤ 1000, is the number of solutions maximised?

  https://projecteuler.net/problem=39
*/

def integerRightTriangles(maxPerimeter: Int): Int =
  val border = maxPerimeter / 2
  val perims = for {
    a <- 1 to border
    b <- a to border
    c <- b to border
    if c*c == a*a + b*b
  } yield a + b + c
  val (key, _) = perims.groupBy(x => x).maxBy((k, seq) => seq.length)
  key
