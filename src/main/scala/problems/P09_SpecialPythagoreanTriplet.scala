package problems

/*
  A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
  a^2 + b^2 = c^2
  For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
  
  There exists exactly one Pythagorean triplet for which a + b + c = 1000.
  Find the product abc.
  
  https://projecteuler.net/problem=9
*/

object P09_SpecialPythagoreanTriplet:

  def product(sum: Int): Int =
    val list = for {
      x <- (1 to (sum - 2)).toList
      y <- ((x + 1) to (sum - 1)).toList
      z <- ((y + 1) to sum).toList
      if x * x + y * y == z * z && x + y + z == sum
    } yield x * y * z
    if list.isEmpty then
      0
    else
      list.head
