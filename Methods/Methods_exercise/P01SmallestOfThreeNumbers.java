package exercise;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int result = gerSmallestOfThreeNumbers(first, second,third);
        System.out.println(result);
    }

    private static int gerSmallestOfThreeNumbers(int first, int second, int third) {
        int aMin =  Math.min(first,second);
        int bMin =  Math.min(second, third);
        int min = Math.min(aMin,bMin);
        return min;
    }
}
