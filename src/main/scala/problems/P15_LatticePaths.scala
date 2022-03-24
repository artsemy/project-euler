package problems

/*
  Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
  there are exactly 6 routes to the bottom right corner.

  How many such routes are there through a 20×20 grid?

  https://projecteuler.net/problem=15
*/

object P15_LatticePaths:

  def path(n: Int): Long =

    def loop(row: Int, column: Int): Long =
      if row == n || column == n then
        1
      else
        loop(row, column + 1) + loop(row + 1, column)

    loop(0, 0)
