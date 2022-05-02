package problems

import utils.EulerMath.*
import scala.annotation.tailrec

/*
  The first two consecutive numbers to have two distinct prime factors are:
  14 = 2 × 7
  15 = 3 × 5
  The first three consecutive numbers to have three distinct prime factors are:
  644 = 2² × 7 × 23
  645 = 3 × 5 × 43
  646 = 2 × 17 × 19.
  
  Find the first four consecutive integers to have four distinct prime factors each.
  What is the first of these numbers?
  
  https://projecteuler.net/problem=47
*/

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
