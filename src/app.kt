import basic.useValToString
import basic.vars
import math.sum

const val PAKEAGE_NAME = "first kotlin study"
fun main(args: Array<String>) {
    println("study kotlin")
    vars(12, 34, 45, 56)
    useValToString()
    println(PAKEAGE_NAME)
    println(sum(1, 2))
//    println($) 错误
    println(lazyValue)
    println(lazyValue)

}

val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}