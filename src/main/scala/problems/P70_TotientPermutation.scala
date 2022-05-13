package problems

import utils.EulerMath._

/*
  Euler's Totient function, φ(n) [sometimes called the phi function],
  is used to determine the number of positive numbers less than or equal to n which are relatively prime to n.
  For example, as 1, 2, 4, 5, 7, and 8, are all less than nine and relatively prime to nine, φ(9)=6.
  The number 1 is considered to be relatively prime to every positive number, so φ(1)=1.
  Interestingly, φ(87109)=79180, and it can be seen that 87109 is a permutation of 79180.
  
  Find the value of n, 1 < n < 107,
  for which φ(n) is a permutation of n and the ratio n/φ(n) produces a minimum.
  
  https://projecteuler.net/problem=70
*/

def totientPermutation(border: Int): Int =
  val prime = getPrimes(3600) //how 3600???
  val res = for {
    x <- prime.reverse
    y <- prime.reverse
    number = x * y
    if number <= border
    fi = (x - 1) * (y - 1)
    if isPermutation(number, fi)
    nFi = 1.0 * number / fi
  } yield (number, nFi)
  val (n, _) = res.minBy((_, d) => d)
  n
