package chapter8

import scala.io.Source

object demo82 {
  def processFile(filename: String, width: Int): Unit = {
    def processLine(line: String) = {
      if (line.length > width)
        println(filename + ":" + line.trim)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)
  }
}
