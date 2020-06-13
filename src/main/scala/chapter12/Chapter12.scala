package chapter12

object Chapter12 {
}

trait Philosophical {

  def philosophize() = {
    println("I consume memory,therefore I am!")
  }
}

class Animal

class Frog extends Animal with Philosophical {
  override def toString: String = "green"

  override def philosophize(): Unit = println("It ain't easy being " + toString + "!")
}

abstract class IntQueue {
  def get(): Int

  def put(x: Int)
}

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]

  def get() = buf.remove(0)

  def put(x: Int) = {
    buf += x
  }
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int) = {
    super.put(2 * x)
  }
}

trait Incrementing extends IntQueue {
  abstract override def put(x: Int) = {
    super.put(x + 1)
  }
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int): Unit = if (x >= 0) super.put(x)
}
