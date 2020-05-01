package au.com.auspost.training.strings;

public class StringJ {

    public static void main(String args[]) {

        //1. Json string
        String iosJson = " { " +
            "\"IOS_CORE\": {" +
            "\"forceUpgrade\": {" +
                "\"to\": \"4.5.0\"," +
                        "\"from\":\"\"," +
                        "\"msg\": \"Sorry, this version is out of date. Please update the app (requires iOS 10.3.3 or later).\"," +
                        "\"type\": \"H\"," +
                        "\"link\": \"https://itunes.apple.com/au/app/australia-post-mobile/id380897313?mt=8\"," +
                        "\"linkText\": \"Launch App Store\"," +
                        "\"fromOS\": \"8.0\"" +
                        "}," +
                        "\"features\": {}," +
                        "\"featureToggles\":[" +
                            "{\"supportEnquiries\" : \"On\"}," +
                            "{\"saveForLater\" : \"On\"}," +
                            "{\"raiseACase\" : \"On\"}," +
                            "{\"redirectFailure\" : \"Off\"}" +
                        "]" +
                        "}" +
                        "}\";";

        //2. Regular expression
        String regexPattern = "\"to\"\\s*:\\s*\"\\w*";


        //3. Comparing 2 Strings
        String one = "kotlin";
        String two = "kotlin";

        if (one.equals(two)) {
            System.out.println("Strings are equal");
        }

        //4. extra methods
        String me = "mark";
        //WordUtils.capitalize(me)
        System.out.println(me);
    }

}
