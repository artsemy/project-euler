package problems

import utils.EulerMath._

/*
  The cube, 41063625 (3453), can be permuted to produce two other cubes:
  56623104 (3843) and 66430125 (4053). In fact, 41063625 is the smallest cube which
  has exactly three permutations of its digits which are also cube.

  Find the smallest cube for which exactly five permutations of its digits are cube.

  https://projecteuler.net/problem=62
*/

def cubicPermutationsMin(size: Int): BigInt =
  val cubes = (1 to 10000).map(powFrom(_)(3))
  val grouped = cubes.map(BigIntToDigitSeq).groupBy(_.sorted)
  grouped
    .filter{ case (key, vec) => vec.size == size }
    .flatMap{ case (key, vec) => vec }
    .map(digitSeqToBigInt)
    .min
