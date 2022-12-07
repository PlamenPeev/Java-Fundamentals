package exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class P5MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstnumArr = scanner.nextLine();
        String seconfnumArr = scanner.nextLine();
        BigInteger firstNum = new BigInteger(firstnumArr);
        BigInteger secondNum = new BigInteger(seconfnumArr);

        System.out.println(firstNum.multiply(secondNum));



    }
}
