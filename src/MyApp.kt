fun main(args:Array<String>){
    println("hello world")

    arthematic()
}

/*Arthematic operator*/

fun arthematic(){
    val i = 13
    val j = 2

    println( i + j ) // 15
    println( i - j ) // 11
    println( i * j ) // 26
    println( i / j ) // 6
    println( i.toFloat() / j ) // 6.5
    println( i % j ) // 1
}

/*Relational Operators*/


fun relational()
{
    val i = 13
    val j = 2

    println( i > j ) // 13 > 2 = true
    println( i < j ) // 13 < 2 = false
    println( i >= j ) // 13 >= 2 = true
    println( i <= j ) // 13 <= 2 = false
    println( i == j ) // 13 == 2 = false
    println( i != j ) // 13 != 2 = true
}

/*Logical Operator*/
fun logical(){
    val i = 12
    val result = (i % 2 == 0) && (i % 3 == 0)
    println(result) //true
}