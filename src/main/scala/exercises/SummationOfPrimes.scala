package exercises

import scala.annotation.tailrec

object SummationOfPrimes:

  def sum(border: Int): Long =

    @tailrec
    def loop(primes: List[Long], startList: List[Int]): Long =
      if startList.isEmpty then
        primes.sum
      else
        val prime = startList.head
        loop(prime :: primes, startList.filter(_ % prime != 0))

    loop(Nil, (2 until border).toList)
