 open class human(){ //open keyword is used to inherit
    fun thinks(){
        print("They use AI to do so")
    }
}
class ALIENS:human(){// used inheritance

}
fun main(){
    var detailsabouthuman = ALIENS()
    detailsabouthuman.thinks()
}
main()