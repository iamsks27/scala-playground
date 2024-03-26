package playground.oop.exercise

object ValueFunctionExercises {

  private def selectDigits(text: String): String = {
    text.filter(c => c.isDigit)
    // text.filter(_.isDigit) => place holder syntax and is used if the variable is used only once.
  }

  private def secret(text: String): String = text.map(_ => '*')

  private def isValidUsernameCharacter(c: Char): Boolean =
    c.isLetterOrDigit
      || c == '-'
      || c == '_'

  private def isValidUserName(username: String): Boolean = username.forall(isValidUsernameCharacter)

  def main(args: Array[String]): Unit = {
    //    val digits = selectDigits("hello4world-80")
    //    val digits_v2 = selectDigits("helloWorld")
    //
    //
    //    println(digits)
    //    println(digits_v2)
    //    println(secret("helloWorld"))
    //    println(isValidUsernameCharacter('a'))
    //    println(isValidUsernameCharacter('A'))
    //    println(isValidUsernameCharacter('3'))
    //    println(isValidUsernameCharacter('&'))

    println(isValidUserName("John"))
    println(isValidUserName("*John*"))
  }

}
