fun main()
{
    val result = add(3, 4)
    println(result)
    printMessage(5) //prints Hello CheezyCode 5 times
    printMessage() //prints Hello CheezyCode once - it uses default value
    val address = getAddress(street = "123,A Street", city = "Noida")

    // Sequence can be changed
    val address2 = getAddress(city = "Noida", street = "123,A Street")
}


/**
 * Unit Data Type
When a function does not return any value - the return data type, in this case, is Unit.
You can explicitly define a function with a return type as Unit but Kotlin is smart enough to inference.

 */

fun printMessageUnit(msg : String) : Unit
{
    println("Hi ! $msg")
}



/**
 * Function Overloading
You can define multiple functions with the same name but either the parameter count should be
different or the type of the parameters need to be different.
This concept is known as function overloading.*/


fun add(a: Int, b: Int) = a + b

// count is different
fun add(a: Int, b: Int, c: Int) = a + b + c

// type is different
 fun add(a: Double, b: Double) = a + b


/**
 * Default Value
There are scenarios when you want to pass a default value to the arguments.
One way to achieve this is to pass the value every time or you can use the
concept of the default values.
 */

fun printMessage(count: Int = 1)
{
    println("Hello CheezyCode")
}


/**Named Arguments
When there are multiple parameters say 10 or more -
passing values while calling the method becomes problematic.
Developers need to remember the sequence of parameters.
The concept of Named Arguments in Kotlin can be used here by passing values with names.*/
fun getAddress(street: String, city: String ) : String
{
    val address = "$street $city"
    return address
}