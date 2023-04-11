fun main() {
    greet("Angela Mumo")
    var answer =division(87,5)
    println(answer)
    var result = sum(345,60,12)
    println(result)
    whoAmI("I like editing videos and photos")
    getName("Beatrice", "Nyaruai")
    

}
//1.Create and invoke a function that takes in a name and prints out “Hello ${name}” e.g
//    given “Ada” it will print out “Hello Ada”
fun greet(name:String){
  println("Hello $name")
}

//   2. Create and invoke a function that given 2 numbers returns the remainder of their
//    division
fun division(num3: Int, num4: Int): Int {
    var answer = num3%num4
    return(answer)
}

// 3. Create and invoke function that returns the sum of any given 4 numbers
fun sum(num:Int, num1:Int, num2:Int):Int{
    var result = num + num1 + num2
    return (result)
}
//4. Create and invoke a function that prints out an interesting fact about yourself
fun whoAmI(sentence:String){
    var myself = ("$sentence")
    println(myself)
}
// 5. create and invoke a function that prints out firstname and lastname of a person
fun getName(firstName:String, lastName: String){
   var person = ("$firstName $lastName")
    println(person)
}
