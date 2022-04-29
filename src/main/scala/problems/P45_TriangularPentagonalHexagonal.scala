package problems

import utils.EulerMath._

/*
  Triangle, pentagonal, and hexagonal numbers are generated by the following formulae:
  Triangle	 	T_n=n(n+1)/2	 	1, 3, 6, 10, 15, ...
  Pentagonal	 	P_n=n(3n−1)/2	 	1, 5, 12, 22, 35, ...
  Hexagonal	 	H_n=n(2n−1)	 	1, 6, 15, 28, 45, ...
  It can be verified that T_285 = P_165 = H_143 = 40755.

  Find the next triangle number that is also pentagonal and hexagonal.

  https://projecteuler.net/problem=45
*/

def triangularPentagonalHexagonalSecond(): Long =
  pentagonalFrom().filter(isHexagonal).dropWhile(_ <= 40755L).head
