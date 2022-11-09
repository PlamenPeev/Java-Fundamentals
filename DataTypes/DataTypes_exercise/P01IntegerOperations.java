package exercise;

import java.util.Scanner;

public class P01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Read four integer numbers.
//Add first to the second, divide (integer) the sum by the third number
// and multiply the result by the fourth number. Print the result.

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int fourthNum = Integer.parseInt(scanner.nextLine());

        int result = ((firstNum + secondNum) / thirdNum) * fourthNum;
        System.out.println(result);
    }
}
