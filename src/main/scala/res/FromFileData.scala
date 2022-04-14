package res

import scala.io.Source

object FromFileData:

  def p08NumberFromFile: String =
    val fileName = "src/main/resources/p08_1000_digit_number.txt"
    val source = Source.fromFile(fileName)
    val number = (for {
      line <- source.getLines()
    } yield line).toSeq
    source.close()
    number.mkString

  def p11GridFromFile: List[List[Int]] =
    val fileName = "src/main/resources/p11_grid.txt"
    val source = Source.fromFile(fileName)
    val grid = for {
      line <- source.getLines().toList
      seq = line.split(" ").map(_.toInt).toList
    } yield seq
    source.close()
    grid

  def p22NamesFromFile: Seq[String] =
    val fileName = "src/main/resources/p22_names.txt"
    val source = Source.fromFile(fileName)
    val names = source.getLines().next().split(",").map(s => s.tail.init)
    source.close()
    names.toSeq
