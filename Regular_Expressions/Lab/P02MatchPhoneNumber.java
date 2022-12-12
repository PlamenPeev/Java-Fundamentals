package lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phoneNumbers = scanner.nextLine();
        //+359 2 222 2222, +359-2-222-2222
        String regex = "\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher phoneMatcher = pattern.matcher(phoneNumbers);

        List<String> phones = new ArrayList<>();
        while(phoneMatcher.find()){
            phones.add(phoneMatcher.group());
        }
        System.out.println(phones.toString().replaceAll("[\\[\\]]", ""));
       // System.out.println(String.join(", ", phones));
    }
}
