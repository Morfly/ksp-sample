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
    myAmazingFunction(
        arg1 = "String",
        arg2 = emptyList<String>(),
        arg3 = emptyList()
    )
}