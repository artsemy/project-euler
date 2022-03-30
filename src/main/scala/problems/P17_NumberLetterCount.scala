package problems

/*
  If the numbers 1 to 5 are written out in words: one, two, three, four, five,
  then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

  If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

  NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters
  and 115 (one hundred and fifteen) contains 20 letters.
  The use of "and" when writing out numbers is in compliance with British usage.

  https://projecteuler.net/problem=17
*/

object P17_NumberLetterCount:

  val initMap: Map[Int, Int] = Map(1 -> "one".length, 2 -> "two".length, 3 -> "three".length,
    4 -> "four".length, 5 -> "five".length, 6 -> "six".length, 7 -> "seven".length, 8 -> "eight".length,
    9 -> "nine".length, 10 -> "ten".length, 11 -> "eleven".length, 12 -> "twelve".length, 13 -> "thirteen".length,
    14 -> "fourteen".length, 15 -> "fifteen".length, 16 -> "sixteen".length, 17 -> "seventeen".length,
    18 -> "eighteen".length, 19 -> "nineteen".length, 20 -> "twenty".length, 30 -> "thirty".length,
    40 -> "forty".length, 50 -> "fifty".length, 60 -> "sixty".length, 70 -> "seventy".length,
    80 -> "eighty".length, 90 -> "ninety".length, 100 -> "hundred".length, 1000 -> "thousand".length,
    -1 -> "and".length).withDefaultValue(0)

  def count(n: Int): Int =

    def countThousandthPart(n: Int, sum: Int): Int =
      val t = n / 1000
      countLetters(n % 1000, sum + initMap(t) + initMap(1000))

    def countHundredthPart(n: Int, sum: Int): Int =
      val h = n / 100
      val and =
        if n % 100 == 0 then
          0
        else
          initMap(-1)
      countLetters(n % 100, sum + initMap(h) + initMap(100) + and)

    def countTenthPart(n: Int, sum: Int): Int =
      if n < 20 then
        initMap(n) + sum
      else
        val t = n / 10
        countLetters(n % 10, sum + initMap(t * 10))

    def countDigitPart(n: Int, sum: Int): Int =
      initMap(n) + sum

    def countLetters(n: Int, sum: Int = 0): Int =
      if n > 999 then
        countThousandthPart(n, sum)
      else if n > 99 then
        countHundredthPart(n, sum)
      else if n > 9 then
        countTenthPart(n, sum)
      else
        countDigitPart(n, sum)

    (1 to n).map(countLetters(_)).sum
