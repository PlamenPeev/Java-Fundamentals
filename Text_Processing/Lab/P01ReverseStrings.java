package lab;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String reverse = ReverseWord(input);
            System.out.printf("%s = %s%n", input, reverse);
            input = scanner.nextLine();
        }
    }

    private static String ReverseWord(String input) {
        String reverse = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                char currentIndex = input.charAt(i);
                reverse += currentIndex;
            }
            return reverse;
    }
}
