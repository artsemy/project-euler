package problems

/*
  It is possible to show that the square root of two can be expressed as an infinite continued fraction.
  1 + 1 / (2 + 1 / (2 + 1 / ...) )
  By expanding this for the first four iterations, we get:
  (3, 2), (7, 5), (17, 12), (41, 29)
  The next three expansions are ... , the eighth expansion (1393, 985),
  is the first example where the number of digits in the numerator exceeds the number of digits in the denominator.

  In the first one-thousand expansions, how many fractions contain a numerator with more digits than the denominator?

  https://projecteuler.net/problem=57
*/

def squareRootConvergents(steps: Int): Int =
  expansions().take(steps).count((x1, x2) => isNumeratorLonger(x1, x2))

def expansions(x1: BigInt = 3, x2: BigInt = 2): LazyList[(BigInt, BigInt)] =
  (x1, x2) #:: expansions(x2 * 2 + x1, x2 + x1)

def isNumeratorLonger(numerator: BigInt, denominator: BigInt): Boolean =
  numerator.toString.length > denominator.toString.length