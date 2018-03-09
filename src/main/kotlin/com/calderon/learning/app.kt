package com.calderon.learning

fun main(args: Array<String>) : Unit {
    var name: String?
    name = null
    print(max(name?.toInt(), name?.toInt()))

}

fun max(a: Int?, b: Int?) = if(a == null || b == null) a else if (a > b) a else b

fun test(name: String) : Unit {
    print("Arg: ${name}")
}