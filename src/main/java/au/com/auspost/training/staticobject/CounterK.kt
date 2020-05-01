package au.com.auspost.training.staticobject

object Counter {
    private var count = 0

    fun increment() {
        count++
    }

    fun decrement() {
        count--
    }

    fun getCount() = count
}

fun main(args: Array<String>) {

    var count = Counter.getCount()
    println("initial count = $count")

    Counter.increment()
    Counter.increment()
    Counter.increment()
    Counter.decrement()

    println("final count = " + Counter.getCount())
}
