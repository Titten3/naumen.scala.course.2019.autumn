package example

object main extends App {
  val messeges = Array("Hello", "Hola", "Guten tag")
  val myName = "Pavel Zaryvnykh"

  def greetingMessages(name:String) = {
    messeges.foreach(msg => println(s"$msg scala! $name"))
  }

  def greetingMessagesReverse(name:String) = {
    val nameReverse = name.reverse
    messeges.foreach(msg => println(s"$msg scala! $nameReverse"))
  }

  greetingMessages(myName)
  greetingMessagesReverse(myName)
}
