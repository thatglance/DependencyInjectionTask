package com.lab.android.androidlab_20.start


class Order(private val coffee: Coffee) {

    fun execute(): String = "[ORDER] Your ${coffee.coffeeOfTheDay} is ready!"
}