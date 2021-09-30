data class user(var a:String,var b:Int){

}
fun main(){
    val user1 = user("Gibson",22)
    val user2 = user("Gibson",22)

    user1.b = 1000
    print(user1)

    if(user1 == user2){
        print("Equal")
    }
    else{
        print("Piss Off")
    }

    // we can use the copy method

     var userG = user1.copy(a = "Millionaire")//we can override names
    print(userG)
}
main() // but as we add data class we got our ans