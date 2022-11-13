package exercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());

        int sumSpice = 0;
        int countDays = 0;
        while (startingYield >= 100) {
            countDays++;
            int newYield = startingYield - 26;
            sumSpice += newYield;
            startingYield -= 10;
            if(startingYield < 100){
                sumSpice -= 26;
            }
        }
        System.out.println(countDays);
        System.out.println(sumSpice);
    }
}
