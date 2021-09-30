fun main() {
    var who = millionaire()
    who.names = "Gibson"
    print(who.names)
}
class millionaire(){
    lateinit var names:String
}
main()