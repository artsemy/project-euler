package problems

/*
  It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits,
  but in a different order.
  
  Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.
  
  https://projecteuler.net/problem=52
*/

def permutedMultiples(): Int =
  val res = for {
    i <- (1 to 1000000).to(LazyList)
    mult = (2 to 6).map(_ * i)
    if mult.forall(m => isPermutation(i, m))
  } yield i
  res.head

def isPermutation(x: Int, y: Int): Boolean =
  x.toString.sorted == y.toString.sorted