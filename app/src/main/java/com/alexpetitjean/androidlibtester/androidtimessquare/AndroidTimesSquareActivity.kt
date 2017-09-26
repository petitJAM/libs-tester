package com.alexpetitjean.androidlibtester.androidtimessquare

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alexpetitjean.androidlibtester.R
import kotlinx.android.synthetic.main.activity_android_times_square.*
import org.joda.time.DateTime

class AndroidTimesSquareActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, AndroidTimesSquareActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_times_square)

        val nextYear = DateTime.now().plusYears(1).toDate()
        val today = DateTime.now().toDate()
        calendarPickerView.init(today, nextYear)
    }
}
