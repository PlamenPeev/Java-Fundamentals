package lab;

import java.util.Scanner;

public class P11Mathoperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        double calculate = getCalculate(firstNum, operator, secondNum);
        System.out.printf("%.0f", calculate);
    }

    private static double getCalculate(int firstNum, String operator, int secondNum) {
        double result = 0;
        switch (operator){
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "/":
                result = firstNum*1.0 / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            default:
                break;
        }
        return result;
    }
}
