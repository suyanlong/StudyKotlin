const val PAKEAGE_NAME = "first kotlin study"
fun main(args: Array<String>) {
    println("study kotlin")
    vars(12, 34, 45, 56)
    useValToString()
    println(PAKEAGE_NAME)
//    println($) 错误
}

/**
 * 使用关键字vararg,定义可变参数。
 */
fun vars(vararg v: Int) {
    for (vt in v) {
        println(vt)
    }
}

/**
 * 字符串里面引用变量
 */

fun useValToString() {
    val name = "suyanlong"
    println("hello world: $name")
}

