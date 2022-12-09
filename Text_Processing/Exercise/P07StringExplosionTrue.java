package exercise;

import java.util.Scanner;

public class P07StringExplosionTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();
        StringBuilder result = new StringBuilder();

        for (int j = 0; j < input.length; j++) {
            result.append(input[j]);
        }

        int power = 0;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '>') {
                power += Integer.parseInt(String.valueOf(result.charAt(i + 1)));
            } else {
                if (power != 0) {
                    result = result.deleteCharAt(i);
                    i--;
                    power--;
                }
            }
        }
        System.out.println(result);
    }
}
