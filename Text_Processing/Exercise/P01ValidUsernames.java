package exercise;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] names = input.split(", ");

        for (String name : names) {
            if (isValidName(name)) {
                System.out.println(name);
            }
        }
    }

    private static boolean isValidName(String name) {
        if (!(name.length() >= 3 && name.length() <= 16)) {
            return false;
        }

        for (char symbol : name.toCharArray()) {
            if (!(Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_')) {
                return false;
            }
        }
        return true;
    }
}
