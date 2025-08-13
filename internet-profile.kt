fun main() {    
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    
    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
       // Fill in code 
       println("Name: $name")
       println("Age: $age")
       
        if (referrer == null) {
            println("Likes ${hobby}. Doesn't have a referrer.")
        } else {
            println("Likes ${hobby}. Has a referrer named ${referrer!!.name}, who likes to ${referrer?.hobby}.")
        }
    }
}
