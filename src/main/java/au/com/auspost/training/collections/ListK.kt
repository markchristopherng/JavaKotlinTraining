package au.com.auspost.training.collections

data class PersonK(var firstName: String, var lastName: String, var age: Int)

fun main(args: Array<String>) {

    // Data
    val peopleList = listOf(PersonK("Joe", "Smith", 21), // mutableListOf(), arrayListOf()
        PersonK("Sally", "Jones", 36),
        PersonK("Harry", "White", 10),
        PersonK("Paul", "Black", 65))

    // 1. iterate over list
    peopleList.forEach {
        println("firstname = ${it.firstName}, lastname = ${it.lastName}")
    }

    // 2. map
    val peopleMap = mapOf("Joe" to PersonK("Joe", "Smith", 21),
        "Sally" to PersonK("Sally", "Jones", 36))

    // 3. filter by age
    val oldPerson =
        peopleList.asSequence().filter { it.age > 45 }.firstOrNull() // mapNotNull {  }

    println("Oldest person ${oldPerson?.firstName} ${oldPerson?.lastName} ")
}
