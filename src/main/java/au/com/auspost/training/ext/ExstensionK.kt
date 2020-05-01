package au.com.auspost.training.ext

import java.net.URLDecoder
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

/**
 *
 * https://kotlinlang.org/docs/reference/exceptions.html#checked-exceptions
 * @Throws(IOException::class) for java interoperability
 *
 */

fun Int.pow(exponent: Int) = Math.pow(this.toDouble(), exponent.toDouble()).toInt()
fun Int.modulas(number: Int) = this % number

fun String.urlEncode(): String {
    return URLEncoder.encode(this, StandardCharsets.UTF_8.toString())
}

fun String.urlDecode(): String {
    return URLDecoder.decode(this, StandardCharsets.UTF_8.toString())
}

fun main(args: Array<String>) {

    // 1. power of function
    var num = 2
    println(num.pow(3))

    // 2. modulas function
    num = 15
    println(num.modulas(10))

    // 3. safe URL encoding of a string
    val test = "Hello world safe URL string"
    val encoded = test.urlEncode()
    val decoded = encoded.urlDecode()
    println("encoded string = $encoded")
    println("decoded string = $decoded")
}
