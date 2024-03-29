package lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String listOfNames = scanner.nextLine();
        //Ivan Ivanov, Georgi Georgiev, Peter Georgiev, Anna Petrova
        String regex ="\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(listOfNames);

        while(matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
