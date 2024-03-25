package playground.basics

object PassBy extends App {

  def calledByValue(x: Long): Unit = {
    println("By value: " + x)
    println("By value: " + x)
  }

  // Example of pass by name.
  // Lazy expression execution.
  // Delays the execution of the expression pass as argument till it is used in the method.
  // For e.g. below method will be executed like:
  // def calledByName(x: => Long): Unit = {
  //   println("By name: " + System.nanoTime())
  //   println("By name: " + System.nanoTime())
  // }
  def calledByName(x: => Long): Unit = {
    println("By name: " + x)
    println("By name: " + x)
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  // Another example of pass by name & delayed execution

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  // printFirst(infinite(), 34) // This will blow up the stack
  printFirst(34, infinite()) // This will print 34. The second argument ( method call ) will be not executed at all.
}
