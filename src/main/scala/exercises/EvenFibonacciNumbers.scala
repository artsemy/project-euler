package exercises

import scala.annotation.tailrec

object EvenFibonacciNumbers:

  def countSum(upperBorder: Int): Int =

    def check(i: Int): Int =
      if i % 2 == 0 then
        i
      else
        0

    @tailrec
    def fib(f1: Int, f2: Int, acc: Int): Int =
      if f2 > upperBorder then
        acc
      else
        fib(f2, f1 + f2, acc + check(f2))

    fib(1, 2, 0)
