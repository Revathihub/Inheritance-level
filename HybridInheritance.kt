package com.Inherritance
fun main(args:Array<String>){
    var ch1=Child1()
    ch1.test1()
    ch1.test2()
    var ch2=Child2()
    ch2.test1()
    ch2.test4()
}
open class HybridInheritance{
    fun test1(){
        println("this is Parent class")
    }
}
class Child1:HybridInheritance() {
    fun test2(){
        println("this is First child class")
    }
}
class Child2:HybridInheritance() {
    fun test4(){
        println("this is Second child class")
    }
}


