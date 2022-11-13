package exercise;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        double value = pokePowerN * 0.5;
        int target = 0;

        while (pokePowerN >= distanceM) {

            if (pokePowerN == value && y > 0) {

                pokePowerN /= y;
                if(pokePowerN < distanceM) {
                    break;
                }
            }
            pokePowerN -= distanceM;
            target++;
        }
        System.out.println(pokePowerN);
        System.out.println(target);
    }
}