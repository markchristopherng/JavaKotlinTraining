package au.com.auspost.training.strings

fun main(args: Array<String>) {

    // 1. Json string
    var iosJson = """
    {
      "IOS_CORE": {
        "forceUpgrade": {
          "to": "4.5.0",
          "from":"",
          "msg": "Sorry, this version is out of date. Please update the app (requires iOS 10.3.3 or later).",
          "type": "H",
          "link": "https://itunes.apple.com/au/app/australia-post-mobile/id380897313?mt=8",
          "linkText": "Launch App Store",
          "fromOS": "8.0"
        },
        "features": {},
        "featureToggles":[
          {"supportEnquiries" : "On"},
          {"saveForLater" : "On"},
          {"raiseACase" : "On"},
          {"redirectFailure" : "Off"}
        ]
        }
    }
    """.trimIndent()

    // 2. Regular expression
    val regexPattern = """   "to"\s*:\s*"\w*"   """.trimIndent()

    // 3. Comparing 2 Strings
    val one = "kotlin"
    val two = "kotlin"

    if (one == two) {
        println("Strings are equal")
    }

    // 4. extra methods
    val me = "mark".capitalize()
    println(me)
}
