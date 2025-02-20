```scala
class MyClass[T](val value: T) {
  def myMethod(x: T): T = {
    value match {
      case _: Int => x + value.asInstanceOf[Int] //Error prone implicit conversion
      case _: String => x + value.asInstanceOf[String]
      case _ => x
    }
  }
}

val myIntInstance = new MyClass(5)
val result1 = myIntInstance.myMethod(3) // Correct

val myStringInstance = new MyClass("hello")
val result2 = myStringInstance.myMethod(" world") // Correct

val myBooleanInstance = new MyClass(true)
val result3 = myBooleanInstance.myMethod(false) //Error: Type mismatch
```