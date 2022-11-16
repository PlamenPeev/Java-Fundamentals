package lab;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //("add", "multiply", "subtract", "divide")
        String input = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        if (input.equals("add")) {
            printAdd(a, b);
        } else if (input.equals("multiply")) {
            printMultiply(a, b);
        } else if (input.equals("subtract")) {
            printSubtract(a, b);
        } else if (input.equals("divide")) {
            printDivide(a, b);
        }
    }

    private static void printDivide(int a, int b) {
        System.out.println(a / b);
    }

    private static void printSubtract(int a, int b) {
        System.out.println(a - b);
    }

    private static void printMultiply(int a, int b) {
        System.out.println(a * b);
    }

    private static void printAdd(int a, int b) {
        System.out.println(a + b);
    }
}
