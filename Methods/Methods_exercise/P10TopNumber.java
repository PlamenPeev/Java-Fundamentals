package exercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            if (sumIsDivisibleByEight(i) && hasOneOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean sumIsDivisibleByEight(int i) {
        int sum = 0;
        while( i != 0){
            int lastDigit = i % 10;
            sum += lastDigit;
            i /= 10;
        }
            return sum % 8 == 0;
    }

    private static boolean hasOneOddDigit(int i) {
        while(i != 0){
           int lastDigit = i % 10;
           i /= 10;
           if(lastDigit % 2 != 0){
               return true;
           }
        }
        return false;
    }
}
