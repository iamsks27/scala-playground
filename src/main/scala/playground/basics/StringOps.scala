package playground.basics

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "_"))

  val aNumberString = "2"
  val aNumber = aNumberString.toInt

  // +: = prepend
  // :+ = append
  println('a' +: aNumberString :+ 'z')

  println('a' + aNumberString + 'z')

  val name = "David"
  val age = 25

  // S - interpolator strings
  val greeting = s"Hello, I am $name & I'm $age years old"
  val anotherGreeting = s"Hello, I am $name and I will be turning ${age + 1} years old"

  println(anotherGreeting)

  // F - interpolator strings
  val speed = 1f
  // 2.2f - two characters total, minimum
  val myth = f"$name can eat $speed%2.2f burgers per minute"

  println(myth)

  // raw - interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}
