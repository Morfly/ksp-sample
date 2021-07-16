package com.morfly


@Function(name = "functionWithoutArgs")
interface FunctionWithoutArgs

@Function(name = "myAmazingFunction")
interface MyAmazingFunction {
    val arg1: String
    val arg2: List<*>
    val arg3: List<Map<String, *>>
}


fun main() {
    functionWithoutArgs()
    myAmazingFunction(
        arg1 = "value",
        arg2 = listOf(1, 2.0, "3"),
        arg3 = listOf(mapOf("key1" to "value1"))
    )
}