package problems

import scala.annotation.tailrec

/*
  The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

  Find the sum of all the primes below two million.

  https://projecteuler.net/problem=10
*/

object P10_SummationOfPrimes:

  def primes(border: Int): List[Int] =

    @tailrec
    def loop(primes: List[Int], startList: List[Int]): List[Int] =
      if Math.pow(primes.head, 2) > border then
        primes.reverse ::: startList
      else
        val prime = startList.head
        loop(prime :: primes, startList.filter(_ % prime != 0))

    loop(List(2), (3 until border by 2).toList)

  def sum(border: Int): Long =
    primes(border).map(_.toLong).sum
