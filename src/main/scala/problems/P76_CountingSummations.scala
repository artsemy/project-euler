package problems

import scala.annotation.tailrec

def countingSummations(n: Int): BigInt =
  @tailrec
  def loop(i: Int, acc: Seq[BigInt]): BigInt =
    println(acc)
    if acc.length < n then
      val s = (1 to i).map(x => BigInt(i))
      loop(i + 1, acc :++ s)
    else
      acc.take(n - 1).sum

  loop(1, Seq(1))

def countingSummationsV2(n: Int): BigInt =

  @tailrec
  def loop(i: Int, acc: BigInt): BigInt =
    if i == 2 then
      acc + 1
    else
      loop(i - 1, acc + i / 2)

  loop(n, 0)