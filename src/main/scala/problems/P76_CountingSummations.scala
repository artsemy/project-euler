package problems

import scala.annotation.tailrec

def countingSummations(n: Int): BigInt =
  coinSums((n - 1) to 1 by -1, n)