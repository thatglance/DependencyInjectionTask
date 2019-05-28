package com.lab.android.androidlab_20.start

import timber.log.Timber

class MainPresenter(private val order: Order) {

    fun makeCoffee() {
        Timber.i(order.execute())
    }
}