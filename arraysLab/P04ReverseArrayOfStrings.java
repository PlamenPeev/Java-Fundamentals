package arraysLab;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] elements = input.split(" ");

        for (int i = elements.length -1 ; i >=0 ; i--) {
            System.out.print(elements[i] + " ");
        }
    }
}
