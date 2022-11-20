package lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        double result = getMathPower(number, power);
        System.out.println(new DecimalFormat("0.####").format(result));
    }

    private static double getMathPower(double number, int power) {
       double result = 1;

        result =  Math.pow(number, power);
        return result;
    }
}
