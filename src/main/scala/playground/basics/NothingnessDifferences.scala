package playground.basics

/**
 * @author sksingh created on 16/03/24
 */
object NothingnessDifferences {

  // 1 - the null reference
  val anAbsentString: String = null

  // 2 - Null = replacement for all REFERENCE types
  class Person

  val theNullReference: Null = null
  val noString: String = theNullReference
  val noPerson: Person = theNullReference

  val noList: List[Int] = theNullReference

  // 3 - Nil = the empty list
  val onEmptyList: List[Int] = Nil
  println(onEmptyList.length)

  // 4 - None is a subtype of Option
  val anAbsentInt: Option[Int] = None
  println(anAbsentInt.isEmpty)

  // 5 - Unit
  def aUnitReturningMethod(): Unit = println("I'm starting a get the difference")

  aUnitReturningMethod()

  // 6 - Nothing = no value at all = replacement for ANY type
  val nothingInt: Int = throw new RuntimeException("No int") // returns nothing


  def main(args: Array[String]): Unit = {
  }
}
