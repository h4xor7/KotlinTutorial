fun main() {
    val songs = arrayOf("Hello", "Final Countdown", "Highway To Hell")

    //elements are stored at index starting from 0
    println(songs[0])
    //check if array contains particular element
    println(songs.contains("Hello")) // --> true

    //index of a particular element
    println(songs.indexOf("Highway To Hell")) // --> 2


    // Looping through the array i.e. Traversing the array

    for(song in songs) {
        println(song)
    }

    //with index
    for( (index, song) in songs.withIndex()){
        println(index.toString() + " - " + song)
    }
}