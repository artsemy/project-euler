package problems

import scala.annotation.tailrec

/*
  Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.

  https://projecteuler.net/problem=13
*/

object P13_LargeSum:

  def sum(numbers: List[String]): String =

    val digitSumList =
      numbers.map(n => n.map(d => d - 48).toList)
        .reduce((l1, l2) => l1.zip(l2)
        .map {case (x1, x2) => x1 + x2})

    @tailrec
    def loop(list: List[Int], add: Int, res: List[Int]): List[Int] =
      if list.isEmpty then
        add :: res
      else
        val head = list.head + add
        loop(list.tail, head / 10, (head % 10) :: res)

    loop(digitSumList.reverse, 0, Nil).mkString.take(10)
