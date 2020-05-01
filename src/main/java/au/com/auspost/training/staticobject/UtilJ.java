package au.com.auspost.training.staticobject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilJ {

    public static final String YEAR_FORMAT = "yyyy";

    public static String toYear(Date date) {
        return new SimpleDateFormat(YEAR_FORMAT).format(date);
    }

    public static String toMonth(Date date) {
        return new SimpleDateFormat("MM").format(date);
    }

    public static void main(String args[]) {

        String year = UtilJ.toYear(new Date());
        System.out.println("year = " + year);

        String month = UtilJ.toMonth(new Date());
        System.out.println("month = " + month);
    }

}

