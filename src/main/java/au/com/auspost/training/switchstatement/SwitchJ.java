package au.com.auspost.training.switchstatement;

import java.util.Calendar;

public class SwitchJ {


    public String getStringValue(Boolean value) {
        if (value) return "TRUE";
        else return "FALSE";
    }


    public static void main(String args[]) {

        //1.
        String result = new SwitchJ().getStringValue(true);
        System.out.println(result);


        //2. display day of week
        Integer day = Calendar.getInstance().get((Calendar.DAY_OF_WEEK));
        String dayStr = null;

        switch (day) {
            case 1:
                dayStr = "Sunday";
                break;
            case 2:
                dayStr = "Monday";
                break;
            case 3:
                dayStr = "Tuesday";
                break;
            case 4:
                dayStr = "Wednesday";
                break;
            case 5:
                dayStr = "Thursday";
                break;
            case 6:
                dayStr = "Friday";
                break;
            case 7:
                dayStr = "Saturday";
                break;
            default:
                dayStr = "Unknown";
        }
        System.out.println(String.format("Today is %s", dayStr));

        //3. display type of day
        switch (day) {
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
                dayStr = "Weekday";
                break;
            case 1:
            case 7:
                dayStr = "Weekend";
                break;
            default:
                dayStr = "Unknown";
        }

        System.out.println(String.format("Today is %s", dayStr));
    }
}
