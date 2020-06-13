package chapter13

abstract class Fruit(
                      val name: String,
                      val color: String
                    )

object Fruits {

  object Apple extends Fruit("apple", "red")

  object Orange extends Fruit("orange", "orange")

  object Pear extends Fruit("pear", "yellowish")

  val menu = List(Apple, Orange, Pear)
}

object Chapter13 {
  def showFruit(fruit: Fruit) = {
    import fruit._
    println(name + "s are " + color)
  }
}

import java.util.regex

class AStarB {
  val pat = regex.Pattern.compile("a*b")
}

class Rocket {

  import Rocket.fuel

  private def canGoHomeAgain = fuel > 20
}

object Rocket {
  private def fuel = 10

  def chooseStrategy(rocket: Rocket) = {
    if (rocket.canGoHomeAgain)
      goHome()
    else
      pickAStar()
  }

  def goHome() = {}

  def pickAStar() = {}
}

