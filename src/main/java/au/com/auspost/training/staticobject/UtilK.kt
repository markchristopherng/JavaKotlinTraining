package au.com.auspost.training.staticobject

import java.text.SimpleDateFormat
import java.util.Date

class UtilK {

    companion object {

        private const val YEAR_FORMAT = "yyyy"

        fun toYear(date: Date): String {
            return SimpleDateFormat(YEAR_FORMAT).format(date)
        }

        fun toMonth(date: Date): String {
            return SimpleDateFormat("MM").format(date)
        }
    }
}

fun main(args: Array<String>) {

    val year = UtilK.toYear(Date())
    println("year = $year")

    val month = UtilK.toMonth(Date())
    println("month = $month")
}
