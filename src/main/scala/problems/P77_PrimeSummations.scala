package problems

import utils.EulerMath._

/*
  It is possible to write ten as the sum of primes in exactly five different ways:
  7 + 3
  5 + 5
  5 + 3 + 2
  3 + 3 + 2 + 2
  2 + 2 + 2 + 2 + 2
  
  What is the first value which can be written as the sum of primes
  in over five thousand different ways?
*/

def primeSummations(border: Int): Int =
  val res = for {
    i <- (2 to Int.MaxValue).to(LazyList)
    pr = getPrimes(i)
    comb = coinSums(pr, i)
    if comb >= border
  } yield i
  res.head

