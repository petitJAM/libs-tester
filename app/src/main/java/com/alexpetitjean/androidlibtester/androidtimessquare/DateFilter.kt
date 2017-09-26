package com.alexpetitjean.androidlibtester.androidtimessquare

import com.squareup.timessquare.CalendarPickerView
import org.joda.time.DateTime
import java.util.*

class DateFilter : CalendarPickerView.DateSelectableFilter {

    private val badDates: List<DateTime>

    init {
        val threeDays = DateTime.now().plusDays(3)
        val sevenDays = DateTime.now().plusDays(7)
        val tenDays = DateTime.now().plusDays(10)
        val threeWeeks = DateTime.now().plusWeeks(3)
        badDates = listOf(threeDays, sevenDays, tenDays, threeWeeks)
    }

    override fun isDateSelectable(date: Date): Boolean {
        val dt = DateTime(date.time)
        return badDates.none {
            dt.year() == it.year() && dt.dayOfYear() == it.dayOfYear()
        }
    }
}
