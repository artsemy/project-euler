package problems

import munit.FunSuite

class P15_LatticePathsTest extends FunSuite:

  test("lattice path 2 * 2 grid") {
    assertEquals(latticePaths(2), 6L)
  }

  test("lattice path 20 * 20 grid") {
    assertEquals(latticePaths(20), 137846528820L)
  }
