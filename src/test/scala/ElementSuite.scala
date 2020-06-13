import chapter10.Element.elem
import org.scalatest.FunSuite

class ElementSuite extends FunSuite {
  test("elem result should have passed width") {
    val ele = elem('x', 2, 3)
    assert(ele.width == 2)
  }

  test("one") {
    val width = 3
    assert(width == 2)
  }

  test("two") {
    assert(List(1, 2, 3).contains(4))
  }

  test("three"){
    assertThrows[IllegalArgumentException]{
      elem('x',-2,3)
    }
  }
}


