package playground.basics

import scala.annotation.tailrec

/**
 * @author sksingh created on 19/03/24
 */
object Recursion extends App {

  def factorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factorialHelper(x - 1, x * accumulator) // tail recursion
    }

    factorialHelper(n, 1)
  }

  // println(factorial(5000))

  def repeat(aString: String, n: Int): String = {
    @tailrec
    def repeatHelper(aString: String, tmpString: String, n: Int): String = {
      if (n <= 1) tmpString
      else repeatHelper(aString, aString + tmpString, n - 1)
    }

    repeatHelper(aString, aString, n)
  }

  println(repeat("Scala", 4))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeUtil(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t < 2) true
      else isPrimeUtil(t - 1, n % t != 0)
    }

    isPrimeUtil(n / 2, true)
  }

  def fibonacci(n: Int): Int = {
    @tailrec
    def fibonacciHelper(i: Int, first: Int, second: Int): Int = {
      if (i >= n ) second
      else fibonacciHelper(i + 1, second, first + second)
    }

    if (n <= 2) 1
    else fibonacciHelper(2, 1, 1)
  }

  println(fibonacci(8))
}
