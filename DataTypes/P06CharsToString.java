package lab;

import java.util.Scanner;

public class P06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

String first = scanner.nextLine();
String second = scanner.nextLine();
String third = scanner.nextLine();

String result = String.format("%s%s%s",first, second,third);
        System.out.println(result);
    }
}
