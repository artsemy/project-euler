package problems2

import scala.annotation.tailrec

/*
  Leonhard Euler was born on 15 April 1707.
  Consider the sequence 1504170715041707n mod 4503599627370517.
  An element of this sequence is defined to be an Eulercoin
  if it is strictly smaller than all previously found Eulercoins.
  For example, the first term is 1504170715041707 which is the first Eulercoin.
  The second term is 3008341430083414 which is greater than 1504170715041707 so is not an Eulercoin.
  However, the third term is 8912517754604 which is small enough to be a new Eulercoin.
  The sum of the first 2 Eulercoins is therefore 1513083232796311.

  Find the sum of all Eulercoins.

  https://projecteuler.net/problem=700
*/

def eulerCoinSum(startNumber: BigInt, divider: BigInt): BigInt =

  @tailrec
  def findNext(lastNumber: BigInt, compareNumber: BigInt): BigInt =
    val maybeCoin = (lastNumber + startNumber) mod divider
    if maybeCoin < compareNumber then
      maybeCoin
    else
      findNext(maybeCoin, compareNumber)

  def nextStep(x1: BigInt, x2: BigInt): BigInt =
    val n = (x1 / x2) + 1
    x2 - (n * x2 - x1)

  @tailrec
  def iter(coin: BigInt, step: BigInt, res: BigInt): BigInt =
    if coin > step then
      iter(coin - step, step, res + coin)
    else if coin < step then
      val newStep = nextStep(coin + step, coin)
      iter(coin - newStep, newStep, res + coin)
    else
      res + coin

  val second = findNext(startNumber, startNumber)
  iter(second, startNumber, startNumber)
