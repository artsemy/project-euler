package problems

import utils.EulerMath.*

import scala.annotation.tailrec

def distinctPrimesFactorsFirst(numbersAmount: Int, dividersAmount: Int): Int =

  @tailrec
  def loop(n: Int, counter: Int): Int =
    if counter == numbersAmount then
      n - numbersAmount
    else if !isPrime(n) && getPrimeDividersSeq(n).distinct.length == dividersAmount then
      loop(n + 1, counter + 1)
    else
      loop(n + 1, 0)

  loop(2, 0)
