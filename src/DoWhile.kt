fun main() {
    var index = 5
    do
    {
        println("Condition is false but I will be printed")
        index++
    }
    while(index < 5)
}

/**Explanation - Here the condition is checked at the end. Thus, body of the
 * loop is executed once. When the execution reaches the end, it checks the
 * condition - if the condition evaluates to true, body of the loop is executed again otherwise loop exits.

 */