package Kotlin
 import jtpoint.Employee
 import jtpoint.TStudent

class First {
}

fun sum(x:Int,y:Int):Int=x + y

fun main(){
    val t=20
    val i=if(t>40) true else false

    println("The sum is "+sum(20,30))

    var msg:String ="How are you?"
    var age=20
    println("Hell0 kotlin - "+msg)
    var tEmp = Employee("Sanmat", 28, true, "Blr")
    var mStd = TStudent(18, "Aniket", 400f)

    println("Name is "+tEmp.name)
}