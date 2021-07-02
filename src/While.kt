fun main()
{
    val num = 2
    var index = 1

    while(index < 11)
    {
        println(num * index)
        index = index + 1
    }
}

/**
 *  Explanation - This loop will run 10 times. Here are the steps -

1. Condition is checked, if it is true, a block of code is executed.
2. Inside this block of code or body of the loop, the index variable is incremented by 1.
3. Then control again reaches the while loop condition, it again checks if the condition still holds true, if yes then the block of code is executed again.
4. Once the index value reaches 11 (as it is incremented every time), the condition is checked again, and this time it is false loop exits.*/