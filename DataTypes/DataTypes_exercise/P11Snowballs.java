package exercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int n = Integer.parseInt(scanner.nextLine());
double maxValue = Double.MIN_VALUE;

int bestSnow = 0;
int bestTime = 0;
int bestQuality = 0;
        for (int i = 1; i <=n ; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());

            double value = Math.pow((snow / time), quality);

            if(value >= maxValue){
                maxValue = value;

                bestSnow = snow;
                bestTime = time;
                bestQuality = quality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnow, bestTime, maxValue, bestQuality);
    }
}
