package exercises

import scala.annotation.tailrec

object LargestProductInASeries:

  def largest(str: String, n: Int): Long =

    def product(str: String): Long =
      str.map(c => c.toString.toLong).product

    @tailrec
    def loop(str: String, max: Long): Long =
      if str.length < n then
        max
      else
        val compareMax = product(str.take(n))
        loop(str.tail, Math.max(max, compareMax))

    loop(str, 0)
