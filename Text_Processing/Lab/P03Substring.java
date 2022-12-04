package lab;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToRemove = scanner.nextLine();
        String text = scanner.nextLine();

        while(text.contains(wordToRemove)) {
            text = newText(text, wordToRemove);

        }
        System.out.println(text);
    }

    private static String newText(String text, String word) {
        int beginIndex = text.indexOf(word);
        int endIndex = word.length() + beginIndex;
        String firstPart = text.substring(0, beginIndex);
        String secondPart = text.substring(endIndex);
        return firstPart + secondPart;
    }
}
