fun main() {
    school()

    println(stmt("Mary",20))

    var len= identity("Coding is fun")
    println(len)

    accept("anita")
    accept("ada")

}
//Given a string “akirachix”. Write a function that prints out a string composed
//of the first, third and fourth characters of the string
fun school(){
    var character="akirachix"
    println(character[0].toString()+character[2]+character[3])

}

//2. Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provided name and age respectively.
fun stmt(name:String, age:Int):String{
    return "Hi, my name is $name and I am $age years old"
}



//3. Write a function that takes in a String and returns its length
fun identity(ident:String):Int{
    return ident.length

}

//4. Write a function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is”

fun accept(accepts:String){
    if (accepts.equals("anita")) {
        println("That's me")
    }
    else{
        println("I don't know who that is")
    }
}