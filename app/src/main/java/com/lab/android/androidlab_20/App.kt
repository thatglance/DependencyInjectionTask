package com.lab.android.androidlab_20

import android.app.Application
import com.lab.android.androidlab_20.start.coffeeModule
import org.koin.core.context.startKoin
import timber.log.Timber

class App: Application (){

    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(coffeeModule)
        }

        Timber.plant(Timber.DebugTree())
    }

}