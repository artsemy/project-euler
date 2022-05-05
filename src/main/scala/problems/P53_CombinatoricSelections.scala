package problems

import utils.EulerMath._

/*
  There are exactly ten ways of selecting three from five, 12345:
  123, 124, 125, 134, 135, 145, 234, 235, 245, and 345
  In combinatorics, we use the notation, (n, r)
  In general, n! / (r! * (n - r)!), where r <= n, n! = n * (n-1) * ... * 1 , and 0! = 1.
  It is not until , that a value exceeds one-million: (23, 10)

  How many, not necessarily distinct, values of (n, r) for 1 <= n <= 100, are greater than one-million?

  https://projecteuler.net/problem=53
*/

def combinatoricSelectionsAmount(): Int =
  val factorials = (1 to 100).map(BigInt(_)).scanLeft(BigInt(1))(_ * _)
  val res = for {
    n <- 1 to 100
    r <- 1 to n
    if factorials(n) / factorials(r) / factorials(n - r) > 1000000
  } yield n -> r
  res.size
