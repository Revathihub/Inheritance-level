package com.Inherritance
fun main(args:Array<String>){
    var gch=GrandChild()
    gch.test1()
    gch.test2()
    gch.test3()
}
open class Parent{
    fun test1(){
        println("this is Parent class")
    }
}
open class Child: HybridInheritance() {
    fun test2(){
        println("this is child class")
    }
}
class GrandChild:Child() {
    fun test3(){
        println("this is Grandchild class")
    }
}
