package com.rahul.myapplication_annotationprocessing.design.strategy

class PaymentContext(private var paymentStrategy: PaymentStrategy) {
    fun setPaymentStrategy(strategy: PaymentStrategy) {
        this.paymentStrategy = strategy
    }

    fun executePayment(amount: Double):String {
        return paymentStrategy.pay(amount)
    }
}

class CreditCardPayment: PaymentStrategy {
    override fun pay(amount: Double): String {
        return "CreditCardPayment for $amount is done."
    }
}

class UPIPayment: PaymentStrategy {
    override fun pay(amount: Double): String {
        return "UPIPayment for $amount is done."
    }
}

fun main() {
    val creditCardPayment = CreditCardPayment()
    val upiPayment = UPIPayment()
    val paymentContext = PaymentContext(upiPayment)
    paymentContext.setPaymentStrategy(creditCardPayment)
    println(paymentContext.executePayment(50.0))
}