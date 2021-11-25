package com.hackerRank.monthprep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeConversion {

    public static String timeConversion(String s) {

        String result = "";
        Pattern pattern = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})(PM|AM)");
        Matcher matcher = pattern.matcher(s);
        boolean encontrou = matcher.find();


        if (encontrou) {
            String match = matcher.group();
            String group1 = matcher.group(1);
            String group2 = matcher.group(2);
            String group3 = matcher.group(3);
            String group4 = matcher.group(4);

            if (group1.equals("12") && group4.equals("AM")) {
                int italo = Integer.parseInt(group1);
                italo -= 12;
                result = Integer.toString(italo) + "0:" + group2 + ":" + group3;
                return result;
            }

            if ((!group1.equals("12")) && group4.equals("AM")) {
                result = match.replace("AM", "");
                return result;
            }

            if (group1.equals("12") && group4.equals("PM")) {
                result = match.replace("PM", "");
                return result;
            }

            if ((!group1.equals("12") && group4.equals("PM"))) {
                int italo = Integer.parseInt(group1);
                italo += 12;

                result = Integer.toString(italo) + ":" + group2 + ":" + group3;
                return result;
            }

        }
        return null;
    }

    public static void main(String[] args) {
        String s = "07:05:45PM";

        System.out.println(timeConversion(s));
    }
}
