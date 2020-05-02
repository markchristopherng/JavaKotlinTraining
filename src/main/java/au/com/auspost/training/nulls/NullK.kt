package au.com.auspost.training.nulls

import java.text.SimpleDateFormat
import java.util.*

data class PersonK(
    var firstname: String,
    var lastName: String,
    var homeAddress: AddressK,
    var workAddress: AddressK?
)

data class AddressK(
    var line1: String,
    var line2: String?,
    var suburb: String,
    var postcode: Int
)

fun main(args: Array<String>) {

    // Data
    val home = AddressK("1 madeup St", null, "Richmond", 3121)
    val personK: PersonK? = PersonK("mark", "ng", home, null)

    // 1. Checking for null
    if (personK?.workAddress?.line2 != null) {
        println(personK?.workAddress?.line2)
    }

    // 2. If null set an alternative text using elvis operator
    val workAddressLine1 = personK?.workAddress?.line2 ?: "unavailable"
    println(workAddressLine1)

    // 3. Using the let.{}
    val deliveryDate: Date? = Date()
    val formatter = SimpleDateFormat("dd/MM/yyyy")
    deliveryDate?.let {
        println(formatter.format(it))
    }
}
