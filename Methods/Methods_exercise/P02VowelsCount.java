package exercise;

import java.util.Locale;
import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = getVowelsCount(input);
        System.out.println(result);

    }

    private static int getVowelsCount(String input) {
        int count = 0;
        String lower = input.toLowerCase();
        for (char i = 0; i < lower.length(); i++) {
            switch (lower.charAt(i)) {
                case 'a':
                case 'o':
                case 'u':
                case 'e':
                case 'i':
                    count++;
                    break;
            }
        }
        return count;
    }
}
