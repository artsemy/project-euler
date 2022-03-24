package exercises

object SpecialPythagoreanTriplet:

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
