package lab;

import java.util.Scanner;

public class P05DigitsLettersOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentIndex = input.charAt(i);
            if(Character.isDigit(currentIndex)){
                digits.append(currentIndex);
            }else if(Character.isLetter(currentIndex)){
                letters.append(currentIndex);
            }else{
                symbols.append(currentIndex);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);
    }
}
