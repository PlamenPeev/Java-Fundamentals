package lab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());
        printStringResult(input,repeat);
        
    }

    private static String printStringResult(String input, int repeat) {
        String result = " ";

        for (int i = 1; i <= repeat; i++) {
            System.out.print(input);
        }

        return result;
    }
}
