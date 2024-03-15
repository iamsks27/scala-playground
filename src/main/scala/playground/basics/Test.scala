package playground.basics

import scala.annotation.tailrec
import scala.util.CommandLineParser


/**
 * @author sksingh created on 14/03/24
 */

def foo = 42

def bar = "hello"

enum Color {
  case RED, GREEN, BLUE
}

given CommandLineParser.FromString[Color] with
  override def fromString(s: String): Color = Color.valueOf(s)


@tailrec
def loop(i: Int = 0): Unit = {
  if (i > 10) return

  println(i)
  loop(i + 1)
}

// Scala thinking patterns:
// 1 - Immutability
// 2 - Repetition => Recursion
// 3 - Instruction => Expression
// 4 - Pattern matching
// 5 - Functions as values

def concatenateN(n: Int, s: String): String =
  if (n <= 0) s
  else s + concatenateN(n - 1, s)

// Defining a interface
trait Human {
  def statement(): String
}

// Similar to defining a record in Java
case class Person(name: String, favLang: String) extends Human {

  override def statement(): String = s"Hi, I'm $name & I love $favLang"
}

// Creating a new Person instance
val john: Human = Person("John", "Scala")

// Pattern matching
val johnSays = john match {
  case Person(name, favLang) => s"$name likes $favLang"
}

// Defining a function as values
val aFunction = (x: Int) => x + 1


// Defining an entry point for your application
// You can have multiple entry points & choose among them at run time.
@main def hello(color: Color): Unit = {
  println("Hello, Scala")
  println(foo)
  println(bar)

  println(s"The color is ${color.toString}")

  loop()
  println(concatenateN(0, "Hello"))
}