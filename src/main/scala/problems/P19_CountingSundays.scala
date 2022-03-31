package problems

import scala.annotation.tailrec

/*
  You are given the following information, but you may prefer to do some research for yourself.
  1 Jan 1900 was a Monday.
  Thirty days has September,
  April, June and November.
  All the rest have thirty-one,
  Saving February alone,
  Which has twenty-eight, rain or shine.
  And on leap years, twenty-nine.
  A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

  How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

  https://projecteuler.net/problem=19
*/

object P19_CountingSundays:

  def countSunday(century: Int): Int =

    def janSeq: Seq[Int] = 1 to 31

    def febSeq(year: Int): Seq[Int] =
      if year % 4 == 0 && year % 100 != 0 || year % 400 == 0 then
        1 to 29
      else
        1 to 28

    def marToDecSeq: Seq[Int] =
      (1 to 31) ++ (1 to 30) ++ (1 to 31) ++ (1 to 30) ++ (1 to 31) ++
        (1 to 31) ++ (1 to 30) ++ (1 to 31) ++ (1 to 30) ++ (1 to 31)

    def yearDatesSeq(year: Int): Seq[Int] =
      janSeq ++ febSeq(year) ++ marToDecSeq

    def shiftLength(prev: Int): Int =
      Math.floorMod(prev - 2, 7)

    def sundaysNumber(prev: Int, s: Seq[Int]): Int =
      (shiftLength(prev) until s.length by 7).count(x => s(x) == 1)

    @tailrec
    def loop(prev: Int, year: Int, res: Int): Int =
      val allDates = yearDatesSeq(year)
      val nextYearPrev = (allDates.length % 7 + prev) % 7
      if year < ((century - 1) * 100 + 1) then
        loop(nextYearPrev, year + 1, res)
      else if year < (century * 100 + 1) then
        val sund = sundaysNumber(prev, allDates)
        loop(nextYearPrev, year + 1, res + sund)
      else
        res

    loop(5, 1900, 0)
