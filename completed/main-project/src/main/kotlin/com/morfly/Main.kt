package com.morfly


@Function(name = "functionWithoutArgs")
interface FunctionWithoutArgs

@Function(name = "myAmazingFunction")
interface MyAmazingFunction {
    val arg1: String?
    val arg2: List<Int?>?
    val arg3: List<Map<String, *>?>
}


fun main() {
    // Calling first generated function.
    functionWithoutArgs()

    // Calling second generated function.
    myAmazingFunction(
        arg1 = "sample value",
        arg2 = listOf(0, 1, null),
        arg3 = listOf(mapOf("sample key" to 0))
    )
}