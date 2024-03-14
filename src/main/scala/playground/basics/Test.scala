package playground.basics

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

// Defining an entry point for your application
// You can have multiple entry points & choose among them at run time. 
@main def hello(color: Color): Unit = {
  println("Hello, Scala")
  println(foo)
  println(bar)

  println(s"The color is ${color.toString}")
}
