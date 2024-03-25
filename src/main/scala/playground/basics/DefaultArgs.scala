package playground.basics

import scala.annotation.tailrec

object DefaultArgs extends App {

  @tailrec
  private def trFac(n: Int, acc: Int): Int = {
    if (n <= 1) acc
    else trFac(n - 1, n * acc)
  }

  private def trFac_v2(n: Int, acc: Int): Int = {
    @tailrec
    def trFacHelper(i: Int, acc: Int): Int = {
      if (i > n) acc
      else trFacHelper(i + 1, i * acc)
    }

    if (n <= 1) 1
    else trFacHelper(2, 1)
  }

  // Default argument value for accumulator
  @tailrec
  private def trFac_v3(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFac_v3(n - 1, n * acc)

  // println(trFac(5, 1))
  // println(trFac_v2(1, 1))
  // println(trFac_v2(2, 1))
  // println(trFac_v2(5, 1))

  println(trFac_v3(5))
}
