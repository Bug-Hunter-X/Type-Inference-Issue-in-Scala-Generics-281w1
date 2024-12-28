```scala
class MyClass[T](val value: T) {
  def getValue: T = value
}

object Main extends App {
  val myInt = new MyClass(10)
  val myString = new MyClass("Hello")

  println(myInt.getValue)
  println(myString.getValue)
}
```