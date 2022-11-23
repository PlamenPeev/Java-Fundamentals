package exercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int result = getCalculate(first, second, third);
        System.out.println(result);

    }

    private static int getCalculate(int first, int second, int third) {
        int resultSum = first + second;
        int finalResult = resultSum - third;
        return finalResult;
    }
}
