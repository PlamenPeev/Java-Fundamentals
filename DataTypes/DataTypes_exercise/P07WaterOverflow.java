package exercise;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <=n ; i++) {
            int quantitiesOfWater = Integer.parseInt(scanner.nextLine());

            if (sum+quantitiesOfWater <= 255) {
                sum += quantitiesOfWater;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sum);
    }
}
