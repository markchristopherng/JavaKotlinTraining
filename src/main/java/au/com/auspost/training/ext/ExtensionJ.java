package au.com.auspost.training.ext;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class ExtensionJ {

    static class URLUtils {

        public static String decode(String value) throws UnsupportedEncodingException {
            return URLDecoder.decode(value, StandardCharsets.UTF_8.toString());
        }

        public static String encode(String value) throws UnsupportedEncodingException {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        }
    }

    static class IntegerUtils {

        public static Integer modulas(Integer number, Integer base) {
            return number % base;
        }

        public static Integer pow(Integer number, Integer exponent) {
            return (int) Math.pow(number, exponent);
        }
    }

    public static void main(String args[]) throws UnsupportedEncodingException {

        //1. power of function
        Integer num = 2;
        System.out.println(IntegerUtils.pow(num, 3));

        //2. modulas function
        num = 15;
        System.out.println(IntegerUtils.modulas(num, 10));

        //3. safe URL encoding of a string
        String test = "Hello world safe URL string";
        String encoded = URLUtils.encode(test);
        String decoded = URLUtils.decode(encoded);
        System.out.println("encoded string = " + encoded);
        System.out.println("decoded string = " + decoded);
    }
}
