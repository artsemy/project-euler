package problems

/*
  Each character on a computer is assigned a unique code and the preferred standard is
  ASCII (American Standard Code for Information Interchange). For example, uppercase A = 65, asterisk (*) = 42,
  and lowercase k = 107.
  A modern encryption method is to take a text file, convert the bytes to ASCII,
  then XOR each byte with a given value, taken from a secret key. The advantage with the XOR function is
  that using the same encryption key on the cipher text, restores the plain text; for example, 65 XOR 42 = 107,
  then 107 XOR 42 = 65.
  For unbreakable encryption, the key is the same length as the plain text message,
  and the key is made up of random bytes. The user would keep the encrypted message
  and the encryption key in different locations, and without both "halves", it is impossible to decrypt the message.
  Unfortunately, this method is impractical for most users, so the modified method is to use a password as a key.
  If the password is shorter than the message, which is likely, the key is repeated cyclically throughout the message.
  The balance for this method is using a sufficiently long password key for security, but short enough to be memorable.

  Your task has been made easy, as the encryption key consists of three lower case characters.
  Using p059_cipher.txt (right click and 'Save Link/Target As...'), a file containing the encrypted ASCII codes,
  and the knowledge that the plain text must contain common English words, decrypt the message
  and find the sum of the ASCII values in the original text.

  https://projecteuler.net/problem=59
*/

def xorDecryption(seq: Seq[Int]): Int =
  val s1 = (seq.indices by 3).map(seq(_))
  val s2 = (1 until seq.length by 3).map(seq(_))
  val s3 = (2 until seq.length by 3).map(seq(_))
  val codes = for {
    a <- 97 to 122
    b <- 97 to 122
    c <- 97 to 122
    b1 = s1.map(x => (x ^ a).toChar)
    b2 = s2.map(x => (x ^ b).toChar)
    b3 = s3.map(x => (x ^ c).toChar)
    text = (b1 zip b2 zip b3).flatMap{ case ((c1, c2), c3) => Seq(c1, c2, c3).mkString }.mkString
    if text.contains("Euler")
  } yield text
  codes.head.map(_.toInt).sum
