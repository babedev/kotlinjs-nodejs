package com.babedev.playground

fun greet() = "Hello"

@JsName("sayHello")
fun greet(text: String) {
    console.log(text)
}