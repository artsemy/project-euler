package problems

/*
  Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
  1634 = 1^4 + 6^4 + 3^4 + 4^4
  8208 = 8^4 + 2^4 + 0^4 + 8^4
  9474 = 9^4 + 4^4 + 7^4 + 4^4
  As 1 = 1^4 is not a sum it is not included.
  The sum of these numbers is 1634 + 8208 + 9474 = 19316.
  
  Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
  
  https://projecteuler.net/problem=30
*/

def digitsAmountBorder(deg: Int): Int =
  (9 * Math.pow(9, deg)).toString.length

def digitFifthPowers(deg: Int): Int =
  val num = for {
    a <- 0 to 9
    b <- 0 to 9
    c <- 0 to 9
    d <- 0 to 9
    e <- 0 to 9
    f <- 0 to 9
    number = a * 100000 + b * 10000 + c * 1000 + d * 100 + e * 10 + f
    if number == Math.pow(a, deg) + Math.pow(b, deg) + Math.pow(c, deg) + Math.pow(d, deg) +
      Math.pow(e, deg) + Math.pow(f, deg)
    _ = println(number)
  } yield number

  num.sum - 1