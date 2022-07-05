package problems2

import scala.annotation.tailrec

/*
  The Fibonacci sequence is defined by the recurrence relation:
  Fn = F_n−1 + F_n−2, where F_1 = 1 and F_2 = 1.
  It turns out that F_541, which contains 113 digits, is the first Fibonacci number
  for which the last nine digits are 1-9 pandigital
  (contain all the digits 1 to 9, but not necessarily in order).
  And F_2749, which contains 575 digits, is the first Fibonacci number
  for which the first nine digits are 1-9 pandigital.

  Given that Fk is the first Fibonacci number for which the first nine digits AND
  the last nine digits are 1-9 pandigital, find k.

  https://projecteuler.net/problem=104
*/

def pandigitalFibonacciEnds(): BigInt =

  def check(i: BigInt): Boolean =
    val number = i.toString()
    val checkLine = "123456789"
    number.length > 8 && number.take(9).sorted == checkLine && number.takeRight(9).sorted == checkLine
    if number.length < 9 then
      false
    else
      number.take(9).sorted == checkLine && number.takeRight(9).sorted == checkLine

  @tailrec
  def iter(i: BigInt, f1: BigInt, f2: BigInt): BigInt =
    if check(f1) then
      i
    else
      iter(i + 1, f2, f1 + f2)

  iter(1, 1, 1)