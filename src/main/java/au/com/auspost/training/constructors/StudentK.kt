package au.com.auspost.training.constructors

import java.util.Date

class StudentK(var firstName: String, var lastName: String, var age: Int) {

    constructor(firstName: String) : this(firstName, "unknown", 0) {
    }

    init {
        println("Name = ${firstName.capitalize()} ${lastName.capitalize()}")
        println("Age = $age")
    }

    fun enroll(enrollmentDate: Date = Date(), course: String = "English", cost: Double? = null) {
    }

    fun cancelEnrollment(reason: String? = null, course: String) {
    }
}

fun main(args: Array<String>) {

    // 1 Primary constructor
    val student = StudentK("Joe", "Smith", 21)

    // 2. Default values
    student.enroll()
    student.enroll(Date())
    student.enroll(course = "Maths")

    student.cancelEnrollment(course = "English")
    student.cancelEnrollment(reason = "too busy", course = "English")

    // 3. Secondary constructor
    val anotherStudent = StudentK("Kim")

    // 4. apply function
    val me = StudentK("Mark").apply {
        enroll()
    }
}
