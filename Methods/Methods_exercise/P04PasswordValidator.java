package exercise;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean isValidLenght = isValidLenght(input);
        if (!isValidLenght) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isValidContent = isValidOnlyDigitsAndLetters(input);
        if (!isValidContent) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isValidDigits = isValidTwoDigits(input);
        if (!isValidDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        if(isValidContent && isValidDigits && isValidLenght){
            System.out.println("Password is valid");
        }

    }

    //Consists only of letters and digits;
    private static boolean isValidOnlyDigitsAndLetters(String input) {

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (!Character.isLetter(currentSymbol) && !Character.isDigit(currentSymbol)) {
                return false;
            }
        }
        return true;
    }

    //Have at least 2 digits.
    private static boolean isValidTwoDigits(String input) {
        int count = 0;
        for (char i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (Character.isDigit(currentSymbol)) {
                count++;
            }
        }
        return count >=2;
//        if (count >= 2) {
//            return true;
//        } else {
//            return false;
//        }
    }

    //	6 – 10 characters (inclusive);
    private static boolean isValidLenght(String input) {
        if (input.length() >= 6 && input.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }
}
