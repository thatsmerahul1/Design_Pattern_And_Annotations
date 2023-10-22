package com.rahul.myapplication_annotationprocessing.design

class Runner {
}

fun main(){
    val customSingleton = CustomSingleton
    val customSingleton2 = CustomSingleton
    println(customSingleton.hashCode())
    println(customSingleton2.hashCode())
}