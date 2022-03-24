package exercises

object LatticePaths:

  def path(n: Int): Long =

    def loop(row: Int, column: Int): Long =
      if row == n then
        1
      else if column == n then
        loop(row + 1, column)
      else
        loop(row, column + 1) + loop(row + 1, column)

    loop(0, 0)
