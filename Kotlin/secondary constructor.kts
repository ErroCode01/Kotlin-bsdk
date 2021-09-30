fun main(){
    val details = students("Gibson")
    print(details.id)
}

class students(name:String){ // primary constructor
    var id = 2

    init {
        print("$name")
    }
    constructor(name:String,id:String): this(name) { // secondary constructor
        this.id = id

    }
}