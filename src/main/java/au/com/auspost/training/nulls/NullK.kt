package au.com.auspost.training.nulls

import java.text.SimpleDateFormat
import java.util.Date

data class Person(
    var firstname: String,
    var lastName: String,
    var homeAddress: Address,
    var workAddress: Address?
)

data class Address(
    var line1: String,
    var line2: String?,
    var suburb: String,
    var postcode: Int
)

fun main(args: Array<String>) {

    // Data
    val home = Address("1 madeup St", null, "Richmond", 3121)
    val person: Person? = Person("mark", "ng", home, null)

    // 1. Checking for null
    if (person?.workAddress?.line2 != null) {
        println(person?.workAddress?.line2)
    }

    // 2. If null set an alternative text using elvis operator
    val workAddressLine1 = person?.workAddress?.line2 ?: "unavailable"
    println(workAddressLine1)

    // 3. Using the let.{}
    val deliveryDate: Date? = Date()
    val formatter = SimpleDateFormat("dd/MM/yyyy")
    deliveryDate?.let {
        println(formatter.format(it))
    }
}
