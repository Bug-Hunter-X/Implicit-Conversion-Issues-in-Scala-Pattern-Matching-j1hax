```scala
sealed trait MyType
case class IntType(value: Int) extends MyType
case class StringType(value: String) extends MyType
case class BooleanType(value: Boolean) extends MyType

class MyClass[T <: MyType](val value: T) {
  def myMethod(x: T): T = (value, x) match {
    case (IntType(v1), IntType(v2)) => IntType(v1 + v2)
    case (StringType(v1), StringType(v2)) => StringType(v1 + v2)
    case (BooleanType(v1), BooleanType(v2)) => BooleanType(v1 || v2)
    case _ => x
  }
}

val myIntInstance = new MyClass(IntType(5))
val result1 = myIntInstance.myMethod(IntType(3))

val myStringInstance = new MyClass(StringType("hello"))
val result2 = myStringInstance.myMethod(StringType(" world"))

val myBooleanInstance = new MyClass(BooleanType(true))
val result3 = myBooleanInstance.myMethod(BooleanType(false))
```