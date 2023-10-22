package com.rahul.myapplication_annotationprocessing.design.prototype

data class User(val firstName:String, val lastName:String, val age:Int, val addresses: MutableList<String>):Prototype {
    override fun clone(): Prototype {
        val addressList = addresses.toMutableList()
        return copy(addresses = addressList)
    }
}

fun main() {
    val user = User("Rahul", "Maurya", 30, mutableListOf("Address 1", "Address 2"))
    val user2 = user.clone()

    println(user.hashCode())
    println(user2)
    println(user === user2)
}