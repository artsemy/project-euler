package problems

import munit.FunSuite

class P32_PandigitalProductsTest extends FunSuite:

  test("pandigitalProducts") {
    assertEquals(pandigitalProducts(), 45228)
  }
