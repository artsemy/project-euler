package problems

import munit.FunSuite

class P32_PandigitalProductsTest extends FunSuite:

  test("isPandigital 1,2,3,4,5,6,7,8,9") {
    assertEquals(isPandigital(123, 456, 789), true)
  }

  test("isPandigital 2,2,3,4,5,6,7,8,9") {
    assertEquals(isPandigital(223, 456, 789), false)
  }

  test("pandigitalProducts") {
    assertEquals(pandigitalProducts(), 45228)
  }
