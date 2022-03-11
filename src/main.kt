fun main(){
    people("Alla","Abass" ,"Ahamed","Mohammed")
    country("harare","mumbai","dodoma","jakarta")
    person("Shamami","Hamadi","Rasha")


}
fun people(a:String,b:String,c:String,d:String){
    var names = arrayOf("Alla","Abass","Ahmed","Mohamed")
    println(names.contentToString())
}
fun country(a:String,b:String,c:String,d:String){
    var names = arrayOf(a,b,c,d)
    println(names.contentToString())
}
fun sum() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 48, 43, 90, 31, 3, 73, 11, 158, 62)
    var sum = numbers[1]+numbers[4]
    println(sum)
    println(numbers[12])
    println(numbers.sortedArray().contentToString())

}
fun person(a: String,b: String,c: String) {
    var names= arrayOf(a,b,c)
    println(names.contentToString())
}


