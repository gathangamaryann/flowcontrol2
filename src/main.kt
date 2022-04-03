fun main(){
    number()
    println(identity(arrayOf("mary","jackyline","jane","david","ian")))
    robot(2)
    robot(13)
    robot(22)
    sound()


}

fun number(){
    for (odd in 1..100){
        if (odd%2!==0){
            println(odd)

        }
    }
}
fun identity(names:Array<String>):Int{
    var name=0
    names.forEach { m->
        if (m.length>5){
            name++
        }
    }
    return name

}
fun robot(age :Int){
    if (age<=6) {
        println("a glass of milk")
    }
    else if (age>6 && age <=15) {
        println("fanta")
    }
    else{
        println("cocacola")
    }
}
fun sound(){
    for (vec in 1..100){
        if (vec%3==0){
            println("Fizz")

        }
        if (vec%5==0){
            println("Buzz")
        }
        else if(vec%3==0 && vec%5==0){

        }
        println("FizzBuzz")

    }
}




