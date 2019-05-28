package com.lab.android.androidlab_20.start

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.lab.android.androidlab_20.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.core.KoinComponent
import org.koin.core.inject

class MainActivity : AppCompatActivity(), KoinComponent {

    private val presenter: MainPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener { presenter.makeCoffee() }

    }
}
