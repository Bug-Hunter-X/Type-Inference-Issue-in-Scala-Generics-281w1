```scala
class MyClass[T](val value: T) {
  def getValue: T = value
}

object Main extends App {
  val myInt: MyClass[Int] = new MyClass(10) // Explicit type annotation
  val myString: MyClass[String] = new MyClass("Hello") // Explicit type annotation

  println(myInt.getValue) //Prints 10
  println(myString.getValue) //Prints Hello
}
```