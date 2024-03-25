package playground.oop.exercise

object Exercise extends App {

  private val author = Writer("Charles", "Dickens", 1812)
  private val novel = Novel("Great Expectations", 1861, author)

  println(novel.authorAge())
  println(novel.isWrittenBy(author))

  val counter = Counter()
  println(counter.inc.count)
  println(counter.inc.inc.count)

  println(counter.inc(5).count)
  println(counter.dec(5).count)
}
