package au.com.auspost.training.switchstatement

import java.util.Calendar

fun check(value: Any) = value is Double

fun getStringValue(value: Boolean): String {
    return if (true) "TRUE" else "FALSE"
}

fun main(args: Array<String>) {

    // 1. display day of week
    val result = getStringValue(true)
    println(result)

    // 2. display day of week
    var day = Calendar.getInstance().get((Calendar.DAY_OF_WEEK))

    var today = when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Unknown"
    }
    println("Today is $today")

    // 3. display type of day
    today = when (day) {
        1, 7 -> "Weekend"
        in 2..6 -> "Weekday"
        else -> "Unknown"
    }
    println("Today is a $today")

    // 4. Any boolean expression
    val x: Any = "abc"
    when (x) {
        is Int -> print("x is an Integer")
        is String -> print("x is a String")
        is IntArray -> print("x is an IntArray")
        check(x) -> print("x is a Double")
    }
}
