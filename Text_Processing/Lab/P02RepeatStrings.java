package lab;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");
        for (String word : text) {
            String result = repeateWord(word, word.length());
            System.out.print(result);
        }

    }

    private static String repeateWord(String input, int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += input + "";
        }
        return result;
    }
}