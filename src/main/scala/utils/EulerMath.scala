package utils

import scala.annotation.tailrec

object EulerMath:

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

  def getPrimeDividersSeq(n: Int): Seq[Int] =

    @tailrec
    def loop(n: Int, div: Int, acc: Seq[Int]): Seq[Int] =
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

  //need sorting sorted
  def getAllCombinations(seq: Seq[Int]): Seq[Seq[Int]] =
    def loop(initSeq: Seq[Int], acc: Seq[Int]): Seq[Seq[Int]] =
      if initSeq.isEmpty then
        Seq(acc)
      else
        loop(initSeq.init, acc) :++ loop(initSeq.init, initSeq.last +: acc)

    loop(seq, Seq())


  //need remove sorting
  def getAllDividers(n: Int): Seq[Int] =
    if n == 0 then
      Seq()
    else
      val primeDividers = getPrimeDividersSeq(n)
      val indexComb = getAllCombinations(primeDividers.indices)
      indexComb.map(seq => seq.map(i => primeDividers(i)).product).distinct.sorted

  def compareNumberAndDividersSum(x: Int, f: (Int, Int) => Boolean): Boolean =
    f(x, getAllDividers(x).init.sum)

  def isPerfectNumber(n: Int): Boolean =
    compareNumberAndDividersSum(n, (x, y) => x == y)

  def isDeficientNumber(n: Int): Boolean =
    compareNumberAndDividersSum(n, (x, y) => x > y)

  def isAbundantNumber(n: Int): Boolean =
    compareNumberAndDividersSum(n, (x, y) => x < y)
    
  def fact(n: Int): Int =

    @tailrec
    def loop(k: Int, res: Int): Int =
      if k == 1 then
        res
      else loop(k-1, res * k)
      
    loop(n, 1)

  def fibFrom(f1: BigDecimal, f2: BigDecimal): LazyList[BigDecimal] = f1 #:: fibFrom(f2, f1 + f2)