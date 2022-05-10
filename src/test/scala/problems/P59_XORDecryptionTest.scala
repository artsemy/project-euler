package problems

import munit.FunSuite
import res.FromFileData._

class P59_XORDecryptionTest extends FunSuite:

  val seq: Seq[Int] = p59Bytes

  test("xorDecryption") {
    assertEquals(xorDecryption(seq), 129448)
  }
