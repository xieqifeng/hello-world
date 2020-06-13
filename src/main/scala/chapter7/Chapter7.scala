package chapter7

object Chapter7 {
  def main(args: Array[String]): Unit = {
    def makeRowSeq(row: Int) =
      for (col <- 1 to 10) yield {
        val prod = (row * col).toString
        val padding = " " * (4 - prod.length)
        padding + prod
      }
//    println(makeRowSeq(2).mkString)
    def multiTable()={
      val tableSeq= for (row<-1 to 10) yield  makeRowSeq(row).mkString
      tableSeq.mkString("\n")
    }
    println(multiTable())
  }
}
