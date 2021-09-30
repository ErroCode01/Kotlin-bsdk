class user(var a:String,var b:Int){

}
fun main(){
    var user1 = user("Gibson",22)
    var user2 = user("Gibson",22)

    if(user1 == user2){
        print("Equal")
    }
    else{
        print("Fuck Off")
    }
}
main() // when we dont use data class we get "Fuck Off" as result