package problems

import utils.EulerMath._

/*
  The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
  
  Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
  
  https://projecteuler.net/problem=48
*/

def selfPowersSum(n: Int): String =
  val p = (1 to n).map(i => powFrom(i)(i)).sum.toString()
  p.subSequence(p.length - 10, p.length).toString
