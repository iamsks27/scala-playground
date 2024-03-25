package playground.oop

object OOBasics extends App {

  val person = Person("John", 26)

  println(person.x)
  person.greet("Daniel")
  person.greet()
}

// constructor
class Person(name: String, val age: Int = 0) {
  // Anything inside the class is class body

  // Field
  val x = 2

  // Expression
  println(1 + 3)

  // Method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")
  def greet(): Unit = println(s"Hi, I'm $name")
  
  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}

// Class parameters are NOT FIELDS
// To access class FIELDS, prefix with val keyboard