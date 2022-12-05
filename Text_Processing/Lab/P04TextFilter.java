package lab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();


        for (String word : bannedWords) {
            String replaceWord = wordToreplace(word);
            text = text.replace(word, replaceWord);
        }

        System.out.println(text);
    }

    private static String wordToreplace(String bannedWord) {
        String result = "";
        for (int i = 0; i < bannedWord.length(); i++) {
            result += '*';
        }
        return result;
    }
}
