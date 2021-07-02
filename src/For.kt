fun main()
{
    for(i in 1..5)

    {
        println("Hello saurabh")
    }

    stepInLoop()
    decrementingLoop()
}


fun stepInLoop(){
    for(i in 1..5 step 2)
    {
        println("Hello saurabh ${i}")
    }
}

fun decrementingLoop(){

    for(i in 5 downTo 1)
    {
        println("Hello saurabh ${i}")
    }
}
