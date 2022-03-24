package problems

import scala.annotation.tailrec

/*
  2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

  What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

  https://projecteuler.net/problem=5
*/

object P05_SmallestMultiple:

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