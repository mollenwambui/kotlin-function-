fun main() {
    greeting("Mollen")
     modulus(20 ,3)
     sum(20 ,45 ,10 , 19)
   interestingfacts()
}
/*invoking a function that takes in a name and prints it out*/
fun greeting(name:String) {
    var name = "Mollen"
    println("hello "+name)
}
/*invoking a function that given two numbers returns the remainder of the division*/
  fun modulus(a:Int,b:Int){
      var modulus = a%b
      println(modulus)

  }
/*invoking a function that gives the sum of four numbers*/
   fun sum(a:Int,b:Int,c:Int,d:Int){
       var sum= a+b+c+d
       println(sum)
   }
/*invoking a function that prints a fun fact about myself*/
   fun interestingfacts(){
       var fact="i love writing scripts"
       println(fact)
   }