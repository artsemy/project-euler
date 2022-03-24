package problems

import scala.annotation.tailrec

/*
  The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

  Find the sum of all the primes below two million.

  https://projecteuler.net/problem=10
*/

object P10_SummationOfPrimes:

  def sum(border: Int): Long =

    @tailrec
    def loop(primes: List[Long], startList: List[Int]): Long =
      if startList.isEmpty then
        primes.sum
      else
        val prime = startList.head
        loop(prime :: primes, startList.filter(_ % prime != 0))

    loop(Nil, (2 until border).toList)
