package arraysLab;

import java.util.Scanner;

public class P04ReverseArrayOfStrings2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] element = scanner.nextLine().split(" ");

        for (int i = 0; i < element.length/2 ; i++) {
            String firstElement = element[i];
            element[i] = element[element.length - 1 - i];
            element[element.length - 1 -i] = firstElement;
        }
        System.out.println(String.join(" ", element));
    }
}
