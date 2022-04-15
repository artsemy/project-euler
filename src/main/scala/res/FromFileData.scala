package res

import scala.io.Source

object FromFileData:
  
  def readLines(filePath: String): Seq[String] =
    val source = Source.fromFile(filePath)
    val seq = (for {
      line <- source.getLines()
    } yield line).toSeq
    source.close()
    seq

  def p08NumberFromFile: String =
    val lines = readLines("src/main/resources/p08_1000_digit_number.txt")
    lines.mkString

  def p11GridFromFile: List[List[Int]] =
    val lines = readLines("src/main/resources/p11_grid.txt")
    lines.map(l => l.split(" ").map(_.toInt).toList).toList
    
  def p13LongNumbers: List[String] =
    val lines = readLines("src/main/resources/p13_50digits_numbers.txt")
    lines.toList
    
  def p18Triangle: List[List[Int]] =
    val lines = readLines("src/main/resources/p18_triangle.txt")
    lines.map(l => l.split(" ").map(_.toInt).toList).toList

  def p22NamesFromFile: Seq[String] =
    val lines = readLines("src/main/resources/p22_names.txt")
    lines.head.split(",").toSeq.map(s => s.tail.init)
