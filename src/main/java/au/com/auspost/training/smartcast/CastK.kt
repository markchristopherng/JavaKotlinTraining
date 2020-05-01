package au.com.auspost.training.smartcast

fun main(args: Array<String>) {

    // Data
    val something: Any = "a test message"

    // 1. smart cast
    if (something is String) {
        println("I am a string of length = " + something.length)
    }

    // 2. casting to a String
    val stringObject = something as String
    println("The first character of String = " + stringObject.get(0))

    // 3. not an instance of check
    if (something !is String) {
        println("Any is NOT a String")
    }

    // 4. safe cast
    val optionalSomething: Any? = "another test message"
    val message = optionalSomething as? String
    println("the length of optional string is = " + message?.length)
}
