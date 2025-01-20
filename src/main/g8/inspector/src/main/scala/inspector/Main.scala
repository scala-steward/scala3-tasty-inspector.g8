package inspector

import scala.quoted._

@main def run =
  val tastyFile = "lib/target/scala-3.6.3/classes/lib/Greetings.tasty"
  val tastyContents = Inspector.showCodeOf(tastyFile)
  println(tastyContents)
