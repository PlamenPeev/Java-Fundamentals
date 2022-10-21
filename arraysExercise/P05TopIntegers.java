package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index < numbers.length; index++) {
            boolean isTopInteger = true;
            for (int i = index + 1; i < numbers.length; i++) {

                if (numbers[index] <= numbers[i]) {
                    isTopInteger = false;
                }
            }
            if (isTopInteger) {
                System.out.print(numbers[index] + " ");
            }
        }
    }
}