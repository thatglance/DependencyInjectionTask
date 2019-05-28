package com.lab.android.androidlab_20.start

import org.koin.core.parameter.parametersOf
import org.koin.dsl.module

val coffeeModule = module {
    factory<Coffee> { (coffeeType: String) -> CupOfCoffee(coffeeType) }
    factory { Order(get { parametersOf(americano) }) }
    single { MainPresenter(get()) }
}
