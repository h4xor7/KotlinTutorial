/**Function Type
Since functions are just like other values, there is a type that is associated with
the functions. That type is known as Function Type. Let's look at some examples -

1. (Double, Double) -> Double

(i)   This is how we define a function type. If a variable has this data type then
     it can take any function which takes 2 doubles as input parameters and returns the output as Double.

(ii)   Function signature contains 2 things - What is the type of input parameter
       and what is the return type of the function. So when you define a function type
       you need to mention these 2 things.

(iii)  Before the arrow (->) you define the types of input parameters i.e. Double, Double in
       this case and the return type of the function is written after the
        arrow (->) which is also Double in this case.*/


fun main()
{
    val fn: (Double, Double) -> Double = ::add //add function is defined  in Function  File
    println( fn( 2.0, 3.0) )
    val gn: (Double, Double) -> Double = ::power
    println( gn( 2.0, 3.0) )
}


fun power(a: Double, b:Double): Double
{
    return Math.pow(a,b)
}