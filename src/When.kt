fun main(args:Array<String>){
    val animal = "Dog"

    when(animal)
    {
        "Cat" -> println("Animal is Cat")
        "Dog" -> println("Animal is Dog")
        "Horse" -> println("Animal is Horse")
        else -> println("Animal Not Found")
    }
}