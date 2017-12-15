package basic

/**
 * 使用关键字vararg,定义可变参数。
 */
fun vars(vararg v: Int) {
    for (vt in v) {
        println(vt)
    }
}

/**
 * lambda表达式
 */
fun lambdaSteament() {
    //这是什么用法？lambda表达式 + 函数最后一个参数是函数的特殊用法
    var array = Array<Int>(10) { index -> index }
}


/**
 * 字符串里面引用变量, 字符串模版
 */
fun useValToString() {
    val name = "suyanlong"
    println("hello world: $name")
    var array = Array<Int>(10) { index -> index }
    array[1] = 100;
    for (value in array) {
        println(value)
    }

    val arrayString = arrayOf("12", "12312")
    for (str in arrayString) {
        println("arrayString index value = $str")
    }
}

/**
 * is 判断一个实例是否属于某一个类型
 * 使用类型检查和自动类型转换
 */
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
// 在这个分支中，`obj`自动转换到`String`
        return obj.length
    }
// 在类型检查分支之外，`obj`仍然是`Any`类型
    return null
}

/**
 * when表达式
 */
fun cases(obj: Any) {
    when (obj) {
        1 -> print("One")
        "Hello" -> print("Greeting")
        is Long -> print("Long")
        !is String -> print("Not a string")
        else -> print("Unknown")
    }
}
