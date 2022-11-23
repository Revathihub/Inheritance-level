fun main(args:Array<String>){
    var ch=Child()
    ch.test1()
    ch.test2()
}
open class Parent{
    fun test1(){
        println("this is Parent class")
    }
}
class Child: Parent() {
    fun test2(){
        println("this is child class")
    }
}
