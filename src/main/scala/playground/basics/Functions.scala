package playground.basics

import scala.annotation.tailrec

/**
 * @author sksingh created on 19/03/24
 */
object Functions extends App {

  def aFunction(a: String, b: Int): String = a + " " + b

  println(aFunction("Hello", 3))
  println("======================")

  def parameterlessFunction(): Int = 42

  println(parameterlessFunction())
  println("======================")
  // Forbidden in Scala 3 -> println(parameterlessFunction)

  def aRepeatedFunction(a: String) = (n: Int) => {
    a.repeat(n)
  }

  val aRepeatedValue = aRepeatedFunction("Scala")(3)

  println(aRepeatedValue)
  println("======================")

  // When you need loops, use recursion

  def aRepeatedFunction_v2(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction_v2(aString, n - 1)
  }

  println(aRepeatedFunction_v2("Scala", 4))

  println("======================")

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  def greeting(name: String, age: Int): String = s"Hi, my name is $name and I am $age years old."

  def fib(n: Int): Int = {
    if (n <= 2) 1
    else fib(n - 1) + fib(n - 2)
  }

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(fib(8))
  println(factorial(5))
  println(isPrime(373))
}
