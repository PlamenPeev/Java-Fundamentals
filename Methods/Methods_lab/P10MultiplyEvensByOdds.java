package lab;

import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int result = getMultiplyEvensByOdds(number);
        System.out.println(result);
    }

    private static int getMultiplyEvensByOdds(int number) {
        int evenSum = getEvenSum(number);
        int oddSum = getOddSum(number);
        return evenSum * oddSum;
    }

    private static int getOddSum(int number) {
        int sum = 0;
        while (Math.abs(number) > 0)  {
            int lastDigit = number % 10;
            if(lastDigit % 2 != 0){
                sum += lastDigit;
            }
            number /= 10;
        }
        return  sum;
    }

    private static int getEvenSum(int number) {
        int sum = 0;
        while (Math.abs(number) > 0) {
            int lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                sum += lastDigit;
            }
            number /= 10;
        }
        return  sum;
    }
}
