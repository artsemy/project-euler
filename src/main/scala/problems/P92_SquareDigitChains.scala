package problems

import utils.EulerMath.*

import scala.annotation.tailrec

def squareDigitChainsCount(upperBorder: Int): Int =
  (1 until upperBorder).map(lastNumberInChain).count(_ == 89)

@tailrec
def lastNumberInChain(start: Int): Int =
  if start == 89 || start == 1 then
    start
  else
    lastNumberInChain(bigIntToDigitSeq(start).map(x => x * x).sum)
