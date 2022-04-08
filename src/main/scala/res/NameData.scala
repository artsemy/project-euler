package res

import scala.io.Source

object NameData:

  def getNamesFromFile: Seq[String] =
    val fileName = "src/main/resources/names.txt"
    val source = Source.fromFile(fileName)
    val names = source.getLines().next().split(",").map(s => s.tail.init)
    source.close()
    names.toSeq
