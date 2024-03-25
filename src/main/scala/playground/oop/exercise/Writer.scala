package playground.oop.exercise

class Writer(firstName: String, surName: String, year: Int) {

  def fullName(): String = s"$firstName $surName"

  def age(): Int = year
}
