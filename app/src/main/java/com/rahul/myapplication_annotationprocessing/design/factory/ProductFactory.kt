package com.rahul.myapplication_annotationprocessing.design.factory

object ProductFactory {
    fun getProduct(type:String): Product? {
        return when (type) {
            "A" -> {
                ProductA() as ProductA
            }

            "B" -> {
                ProductB() as ProductB
            }

            else -> {
                ProductOthers()
            }
        }
    }
}

class ProductA: Product {
    override fun create(): String {
        return "ProductA"
    }
}

class ProductB: Product {
    override fun create(): String {
        return "ProductB"
    }
}

class ProductOthers: Product {
    override fun create(): String {
        return "Product Others"
    }
}

fun main() {
    val product = ProductFactory.getProduct("A")
    println(product?.create()?.javaClass?.annotations)

    val product1 = ProductFactory.getProduct("B")
    println(product1?.create())

    val productOthers = ProductFactory.getProduct("z")
    println(productOthers?.create())
}