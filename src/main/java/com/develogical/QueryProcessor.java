package com.develogical;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "DAN";
        }
        if (query.toLowerCase().contains("cool")) {
            return "Yep, you are cool.";
        }
        if (query.toLowerCase().contains("larger")) {
            String input = query.toLowerCase();
            Pattern regex = Pattern.compile("which of the following numbers is the largest: (\\d+), (\\d+)");
            Matcher matcher = regex.matcher(input);
            String[] parts = input.split(matcher.group(1));
            Integer one = Integer.parseInt(parts[0]);
            Integer two = Integer.parseInt(parts[1]);
            Integer m = 0;
            if (one > two)
                m = one;
            else
                m = two;
            return String.valueOf(m);
        }
        if (query.toLowerCase().contains("largest")) {
            String input = query.toLowerCase();
            String[] parts = input.split(":");
            String[] nums = parts[1].split(",");

            Integer one = Integer.parseInt(nums[0]);
            Integer two = Integer.parseInt(nums[1]);
            Integer m = 0;
            if (one > two)
                m = one;
            else
                m = two;
            return String.valueOf(m);
        }
    
        return "";
    }
}
