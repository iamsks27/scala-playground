package playground.oop.exercise

class Novel(firstName: String, yor: Int, author: Writer) {

  def authorAge(): Int = yor - author.age()

  def isWrittenBy(author: Writer): Boolean = this.author == author

  def copy(newYor: Int): Novel = Novel(firstName, newYor, author)
}
