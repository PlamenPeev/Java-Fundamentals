package exercise;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        getMatrix(n);
    }

    private static void getMatrix(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int colums = 1; colums < n; colums++) {
                System.out.print(n + " ");

            }
            System.out.println(n + " ");

        }
    }
}