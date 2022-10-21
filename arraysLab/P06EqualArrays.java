package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] secondArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sumFirst = 0;
        int position = 0;
        int different = 0;
        boolean isDifferent = false;
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] != secondArr[i]) {
                different++;
                isDifferent = true;
                position = i;
                break;
            } else {
                sumFirst += firstArr[i];
            }
        }

        if (isDifferent) {
            System.out.printf("Arrays are not identical. Found difference at %d index.", position);
        } else {
            System.out.printf("Arrays are identical. Sum: %d", sumFirst);
        }

    }
}
