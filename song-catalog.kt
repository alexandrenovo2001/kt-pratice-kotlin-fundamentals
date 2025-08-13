fun main() {
	val brunoSong = Song("We Don't Talk About Bruno", "Encanto Cast", 2022, 1000000)
    
    brunoSong.print()
    
    println(brunoSong.isPopular)
}

class Song(val title: String, val artist: String, val yearPublished: Int, val playCount: Int) {
    
    val isPopular: Boolean
    	get() = playCount >= 1000
    
    fun print () {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
    
}
