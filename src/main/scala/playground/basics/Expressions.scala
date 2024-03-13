package playground.basics

/**
 * @author sksingh created on 13/03/24
 */
object Expressions {

  def main(args: Array[String]): Unit = {

    val x = 1 + 2 // Expression
    println(x)

    println(2 + 3 * 4)

    // Instructions (DO) vs Expressions (Value)

    // If expression
    val aCondition: Boolean = true

    val aConditionValue = if(aCondition) 5 else 3 // If Expression
    println(aConditionValue)

    var aVariable = 0

    val aWeirdValue: Unit = (aVariable = 3) // Unit === void

    println(aWeirdValue)

    val aCodeBlock = {
      val x = 2
      val y = x + 1

      if (y > 2) "hello" else "goodBye"
    }

    println(aCodeBlock)
  }
}
