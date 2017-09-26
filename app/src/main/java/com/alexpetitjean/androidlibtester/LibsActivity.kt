package com.alexpetitjean.androidlibtester

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.alexpetitjean.androidlibtester.androidtimessquare.AndroidTimesSquareActivity
import kotlinx.android.synthetic.main.activity_libs.*

class LibsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_libs)

        androidTimesSquareButton.setOnClickListener {
            startActivity(AndroidTimesSquareActivity.newIntent(this))
        }
    }
}
