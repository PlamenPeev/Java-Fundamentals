package lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String listOfData = scanner.nextLine();
        //13/Jul/1928, 10-Nov-1934, 25.Dec.1937
        String regex = "\\b(?<day>\\d{2})([\\.\\/ -])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(listOfData);

        while (matcher.find()) {
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }
}
