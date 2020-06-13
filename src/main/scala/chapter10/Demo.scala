package chapter10

object Demo {
  def main(args: Array[String]): Unit = {
    println(Element.elem(Array("hello")) above
      Element.elem(Array("world!")))
    println(Element.elem(Array("one", "two")) beside
      Element.elem(Array("one!")))


  }
}


abstract class Element {

  import Element.elem

  def contents: Array[String]

  def height: Int = contents.length

  def width: Int = if (height == 0) 0 else contents(0).length

  def above(that: Element): Element = {
    val this1 = this widen that.width
    val that1 = that widen this.width
    assert(this1.width == that1.width)
    elem(this.contents ++ that.contents)
  }

  def beside(that: Element): Element = {
    //    val contents = new Array[String](this.contents.length)
    //    for (i <- 0 until this.contents.length)
    //      contents(i) = this.contents(i) + that.contents(i)
    val this1 = this heighten that.height
    val that1 = that heighten this.height
    elem(
      for (
        (line1, line2) <- this1.contents zip that1.contents
      ) yield line1 + line2
    )
  }

  def widen(w: Int): Element =
    if (w <= width) this
    else {
      val left = elem(' ', (w - width) / 2, height)
      val right = elem(' ', w - width - left.width, height)
      left beside this beside right
    } ensuring (w < _.width)

  def heighten(h: Int): Element =
    if (h <= height) this
    else {
      val top = elem(' ', width, (h - height) / 2)
      val bot = elem(' ', width, h - height - top.height)
      top above this above bot
    }

  override def toString: String = contents mkString "\n"
}

object Element {

  private class ArrayElement(val contents: Array[String]) extends Element

  private class LineElement(s: String) extends Element {
    override def height: Int = 1

    override def width: Int = s.length

    override def contents: Array[String] = Array(s)
  }

  private class UniformElement(ch: Char, override val width: Int, override val height: Int) extends Element {
    private val line = ch.toString * width

    def contents: Array[String] = Array.fill(height)(line)
  }

  def elem(contents: Array[String]): Element = new ArrayElement(contents)

  def elem(chr: Char, width: Int, height: Int): Element = new UniformElement(chr, width, height)

  def elem(line: String): Element = new LineElement(line)
}