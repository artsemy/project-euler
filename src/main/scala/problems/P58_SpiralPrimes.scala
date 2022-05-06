package problems

import utils.EulerMath.*
import scala.annotation.tailrec

def spiralDiagLengthPrimesRatio(rat: Int): Int =

  @tailrec
  def loop(start: Int, step: Int, primeCount: Int): Int =
    val newPrimeCount = primeCount + (start to start + 3 * step by step).count(isPrime)
    if  100.0 * newPrimeCount / (step * 2 + 1) < rat then
      step + 1
    else
      loop(start + 4 * step + 2 , step + 2, newPrimeCount)

  loop(3, 2, 0)
