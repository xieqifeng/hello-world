import scala.io.Source

object demo81 {
  def processFile(filename: String, width: Int): Unit = {
    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(filename, width, line)
  }

  private def processLine(filename: String, width: Int, line: String) = {
    if (line.length > width)
      println(filename + ":" + line.trim)
  }

}

class FindLongLines {
  def main(args: Array[String]): Unit = {
    val width = args(0).toInt
//    println(args.drop(1).mkString(","))
    for (arg <- args.drop(1))
      demo81.processFile(arg, width)

  }
}
