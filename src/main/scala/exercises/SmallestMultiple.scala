package exercises

import scala.annotation.tailrec

object SmallestMultiple:

  def findMultiple(border: Int): Int =

    val list = (1 to border).toList

    def isPrime(n: Int): Boolean =
      (2 until n).forall(x => n % x != 0)

    val primeList = list.filter(isPrime)

    @tailrec
    def loop(primeList: List[Int], acc: Int): Int =
      if primeList.isEmpty then
        acc
      else
        loop(primeList.tail, acc * maxPow(primeList.head, 1))

    @tailrec
    def maxPow(i: Int, acc: Int): Int =
      if acc > border then
        acc / i
      else
        maxPow(i, acc * i)

    loop(primeList.tail, 1)