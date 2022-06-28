package problems2

import munit.FunSuite
import res.FromFileData.p102Triangles

class P102_TriangleContainmentTest extends FunSuite:

  val triangles: Seq[((Int, Int), (Int, Int), (Int, Int))] = p102Triangles

  test("count containing") {
    assertEquals(countContainsOrigin(triangles), 228)
  }

  test("contains origin yes") {
    assertEquals(containsOrigin((-340,495), (-153,-910), (835,-947)), true)
  }

  test("contains origin no") {
    assertEquals(containsOrigin((-175,41), (-421,-714), (574,-645)), false)
  }

