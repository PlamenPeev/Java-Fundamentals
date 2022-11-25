package exercise;

import java.util.Scanner;

public class P08FactorialDivision1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = Integer.parseInt(scanner.nextLine());
        double n2 = Integer.parseInt(scanner.nextLine());

        double f1 = getFactorial(n1);
        double f2 = getFactorial(n2);
        double divide = f1 / f2;
        System.out.printf("%.2f", divide);
    }

    private static double getFactorial(double n) {
        double factorial = 1;
        for (double i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
