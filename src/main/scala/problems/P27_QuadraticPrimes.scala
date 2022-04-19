package problems

import utils.EulerMath.*
import scala.annotation.tailrec

/*
  Euler discovered the remarkable quadratic formula: n^2 + n + 41
  It turns out that the formula will produce 40 primes for the consecutive n = [0, 39] integer values.
  However, when n = 40 is divisible by 41, and certainly when n = 41 is clearly divisible by 41.
  The incredible formula n^2 - 79*n + 1601 was discovered, which produces 80 primes for the consecutive values.
  The product of the coefficients, −79 and 1601, is −126479.
  Considering quadratics of the form: n^2 + a*n + b, where |a| < 1000 and |b| <= 1000

  Find the product of the coefficients, 'a' and 'b', for the quadratic expression that produces
  the maximum number of primes for consecutive values of 'n', starting with n = 0.

  https://projecteuler.net/problem=27
*/

def quadraticPrimesCoeffProduct(aBorder: Int, bBorder: Int): Int =
  val primes = getPrimes(2 * aBorder * aBorder + bBorder).toSet

  @tailrec
  def consecutiveLength(a: Int, b: Int, i: Int = 0): Int =
    val p = i * i + a * i + b
    if primes.contains(p) then
      consecutiveLength(a, b, i + 1)
    else
      i

  val seq = for {
    a <- (1 - aBorder) until aBorder
    b <- -bBorder to bBorder
    n = consecutiveLength(a, b)
  } yield ((a, b), n)
  val ((a, b), x) = seq.maxBy(_._2)
  a * b
