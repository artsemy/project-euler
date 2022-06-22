package problems

/*
  For a number written in Roman numerals to be considered valid there are basic rules
  which must be followed. Even though the rules allow some numbers to be expressed
  in more than one way there is always a "best" way of writing a particular number.
  For example, it would appear that there are at least six ways of writing the number sixteen:
  IIIIIIIIIIIIIIII
  VIIIIIIIIIII
  VVIIIIII
  XIIIIII
  VVVI
  XVI
  However, according to the rules only XIIIIII and XVI are valid, and the last example
  is considered to be the most efficient, as it uses the least number of numerals.
  The 11K text file, roman.txt (right click and 'Save Link/Target As...'),
  contains one thousand numbers written in valid, but not necessarily minimal,
  Roman numerals; see About... Roman Numerals for the definitive rules for this problem.
  
  Find the number of characters saved by writing each of these in their minimal form.
  Note: You can assume that all the Roman numerals in the file
  contain no more than four consecutive identical units.
  
  https://projecteuler.net/problem=89
*/

def countSavedCharacters(numbers: Seq[String]): Int =
  val res = for {
    number <- numbers
    intValue = fromRoman(number)
    shortRomanValue = toRoman(intValue)
    diff = number.length - shortRomanValue.length
  } yield diff
  res.sum

def toRoman(n: Int): String =
  val pairs = Seq(1000 -> "M", 900 -> "CM", 500 -> "D", 400 -> "CD", 100 -> "C", 90 -> "XC",
    50 -> "L", 40 -> "XL", 10 -> "X", 9 -> "IX", 5 -> "V", 4 -> "IV", 1 -> "I")

  val (_, res) = pairs.foldLeft((n, "")) { case ((aNum, aRom), (num, rom)) =>
    aNum % num -> (aRom + rom * (aNum / num))
  }
  res

def fromRoman(roman: String): Int =
  val pairs = Map("M" -> 1000, "CM" -> 900, "D" -> 500, "CD" -> 400, "C" -> 100, "XC" -> 90,
    "L" -> 50, "XL" -> 40, "X" -> 10, "IX" -> 9, "V" -> 5, "IV" -> 4, "I" -> 1)
  if roman.isEmpty then
    0
  else if pairs.contains(roman.take(2)) then
    pairs(roman.take(2)) + fromRoman(roman.drop(2))
  else
    pairs(roman.head.toString) + fromRoman(roman.tail)