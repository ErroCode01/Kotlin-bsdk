fun main(){
    var info = person("Gibson",20)
    println(info.name)
}
class person( var nameof:String,var ageof:Int) {
    var name:String = nameof
   get() {
       return field.toUpperCase()
   }
    var age:Int = ageof
}
main()

