package lab;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printTriangle(n);
    }

    private static void printTriangle(int n) {
        printTop(n);
        printMiddle(n);
        printBottom(n);
    }

    private static void printTop(int n) {
        for (int i = 1; i < n; i++){
                prinSingelLine(i);
        }

    }

    private static void printMiddle(int n) {
        for (int i = 1; i <= n ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printBottom(int n) {
        for (int i = n - 1; i >= 1 ; i--) {
            prinSingelLine(i);
        }

    }
    private static void prinSingelLine(int i) {
        for (int j = 1; j <= i ; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
