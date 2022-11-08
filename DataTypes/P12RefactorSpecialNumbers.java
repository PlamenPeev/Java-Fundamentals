package lab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int digit = 0;
        boolean isSpecialNum = false;
        for (int num = 1; num <= n; num++) {
            digit = num;
            int sum = 0;

            while (digit > 0) {
                sum += digit % 10;
                digit = digit / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                isSpecialNum = true;
                System.out.printf("%d -> True%n", num);
            } else {
                System.out.printf("%d -> False%n", num);
            }

        }
    }
}
