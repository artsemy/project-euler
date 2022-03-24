package exercises

import munit.FunSuite
import exercises.LatticePaths._

class LatticePathsTest extends FunSuite:

  test("lattice path 2 * 2 grid") {
    val act = path(2)
    assertEquals(act, 6L)
  }

  test("lattice path 20 * 20 grid") { // 6 min
    val act = path(20)
    assertEquals(act, 137846528820L)
  }
