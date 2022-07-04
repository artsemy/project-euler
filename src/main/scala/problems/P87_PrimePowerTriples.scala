package problems

import utils.EulerMath.getPrimes
import scala.math.{cbrt, sqrt}

/*
  The smallest number expressible as the sum of a prime square,
  prime cube, and prime fourth power is 28. In fact, there are exactly four numbers
  below fifty that can be expressed in such a way:
  28 = 2^2 + 2^3 + 2^4
  33 = 3^2 + 2^3 + 2^4
  49 = 5^2 + 2^3 + 2^4
  47 = 2^2 + 3^3 + 2^4
  
  How many numbers below fifty million can be expressed as the sum of a prime square,
  prime cube, and prime fourth power?
  
  https://projecteuler.net/problem=87
*/

def countPrimePowerTriples(sumBorder: Int): Int =
  val m1 = sqrt(sumBorder).toInt
  val m2 = cbrt(sumBorder).toInt
  val m3 = sqrt(sqrt(sumBorder)).toInt
  val res = for {
    i1 <- getPrimes(m1).map(x => BigInt(x).pow(2))
    i2 <- getPrimes(m2).map(x => BigInt(x).pow(3))
    i3 <- getPrimes(m3).map(x => BigInt(x).pow(4))
    sum = i1 + i2 + i3
    if sum <= sumBorder
  } yield sum
  res.toSet.size
