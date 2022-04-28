package utils

import scala.annotation.tailrec

object EulerMath:

  def isPrime(n: Int): Boolean =
    (2 to Math.sqrt(n).ceil.toInt).forall(n % _ != 0)

  def isPalindrome(n: Int): Boolean =
    isPalindrome(n.toString)
    
  def isPalindrome(s: String): Boolean =
    s == s.reverse

  def isEven(n: Int): Boolean = n % 2 == 0

  def getPrimes(upperBorder: Int, lowerBorder: Int = 2): Seq[Int] =

    @tailrec
    def loop(acc: Seq[Int], initSeq: Seq[Int]): Seq[Int] =
      val k = initSeq.head
      if k * k > upperBorder then
        acc ++ initSeq
      else
        loop(acc :+ k, initSeq.filterNot(_ % k == 0))

    if upperBorder < lowerBorder then
      Seq()
    else
      loop(Seq(), lowerBorder to upperBorder)

  def getPrimeDividersSeq(n: Long): Seq[Long] =

    @tailrec
    def loop(n: Long, div: Long, acc: Seq[Long]): Seq[Long] =
      if div == n then
        acc :+ div
      else if n % div == 0 then
        loop(n / div, 2, acc :+ div)
      else
        loop(n, div + 1, acc)

    if n < 2 then
      Seq()
    else
      loop(n, 2, Seq())

  def getAllCombinations(seq: Seq[Int]): Seq[Seq[Int]] =
    (0 to seq.length).flatMap(l => seq.combinations(l))

  def getAllDividers(n: Long): Seq[Long] =
    if n == 0 then
      Seq()
    else
      val primeDividers = getPrimeDividersSeq(n)
      val indexComb = getAllCombinations(primeDividers.indices)
      indexComb.map(seq => seq.map(i => primeDividers(i)).product).distinct

  def compareNumberAndDividersSum(x: Int, f: (Int, Int) => Boolean): Boolean =
    f(x, getAllDividers(x).init.sum.toInt) //type

  def isPerfectNumber(n: Int): Boolean =
    compareNumberAndDividersSum(n, (x, y) => x == y)

  def isDeficientNumber(n: Int): Boolean =
    compareNumberAndDividersSum(n, (x, y) => x > y)

  def isAbundantNumber(n: Int): Boolean =
    compareNumberAndDividersSum(n, (x, y) => x < y)
    
  def stringToDigitSeq(s: String): Seq[Int] = s.map(_ - 48)
  
  def BigIntToDigitSeq(n: BigInt): Seq[Int] = stringToDigitSeq(n.toString())
  
  def digitSeqToBigInt(digits: Seq[Int]): BigInt = BigInt(digits.mkString)
    
  def fact(n: Int): BigInt = (1 to n).map(BigInt(_)).product

  def fibFrom(f1: BigInt = 0, f2: BigInt = 1): LazyList[BigInt] = f1 #:: fibFrom(f2, f1 + f2)
  
  def powFrom(n: Int, lastNumber: BigInt = BigInt(1)): LazyList[BigInt] = lastNumber #:: powFrom(n, lastNumber * n)

  def isPandigital(numbersSeq: Seq[Int], upperBorder: Int, lowerBorder: Int = 1): Boolean =
    val digitSeq = numbersSeq.flatMap(x => stringToDigitSeq(x.toString))
    digitSeq.length == upperBorder - lowerBorder + 1 && digitSeq.toSet == (lowerBorder to upperBorder).toSet

  def isTriangularNumber(number: Int): Boolean =
    val n = Math.sqrt(number * 2).toInt
    number == n * (n + 1) / 2

  def wordValue(word: String): Int = word.map(_ - 64).sum