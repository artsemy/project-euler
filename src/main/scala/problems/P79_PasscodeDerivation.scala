package problems

import utils.EulerMath.*
import scala.annotation.tailrec

/*
  A common security method used for online banking is to ask the user for three random characters
  from a passcode. For example, if the passcode was 531278, they may ask for the 2nd, 3rd,
  and 5th characters; the expected reply would be: 317.
  The text file, keylog.txt, contains fifty successful login attempts.

  Given that the three characters are always asked for in order,
  analyse the file so as to determine the shortest possible secret passcode of unknown length.

  https://projecteuler.net/problem=79
*/

def passcodeDerivation(seq: Seq[Int]): String =

  val attemptsThreeDigits = seq.map(x => bigIntToDigitSeq(x))

  def allDigits: Seq[Int] =
    seq.flatMap(x => bigIntToDigitSeq(x)).distinct

  def findComb: Seq[Int] =
    val pass = allDigits.toList.permutations.toSeq
    pass.filter(isGood).head

  def isGood(list: List[Int]): Boolean =
    attemptsThreeDigits.forall(seq => isOrdered(seq, list))

  def isOrdered(seq: Seq[Int], fullPass: List[Int]): Boolean =
    @tailrec
    def iter(seq: Seq[Int], lastIndex: Int): Boolean =
      seq.isEmpty ||
        (!(fullPass.indexOf(seq.head) < lastIndex) && iter(seq.tail, fullPass.indexOf(seq.head)))

    iter(seq, -1)

  findComb.mkString
