package com.rahul.myapplication_annotationprocessing.design.strategy

interface PaymentStrategy {
    fun pay(amount: Double): String
}