package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nLines = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[nLines];
        int[] secondArr = new int[nLines];
        for (int row = 0; row < nLines; row++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

                if ((row+1) % 2 == 0) {
                    firstArr[row] = numbers[1];
                    secondArr[row] = numbers[0];
                } else {
                    firstArr[row] = numbers[0];
                    secondArr[row] = numbers[1];
                }
        }
        for ( int number: firstArr) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number: secondArr) {
            System.out.print(number + " ");
        }
    }
}
