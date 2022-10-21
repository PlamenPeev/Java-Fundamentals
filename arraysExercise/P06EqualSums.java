package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        boolean isExists = false;
        for (int myIndex = 0; myIndex < numbers.length; myIndex++) {

            int existsIndex = numbers[myIndex];
            int leftSum = 0;
            int rightSum = 0;
            for (int leftIndex = 0; leftIndex < myIndex; leftIndex++) {
                leftSum += numbers[leftIndex];
            }

            for (int rightIndex = myIndex + 1; rightIndex <= numbers.length - 1; rightIndex++) {
                rightSum += numbers[rightIndex];
            }
            if (leftSum == rightSum) {
                isExists = true;
                System.out.println(myIndex);
            }
        }

        if (!isExists) {
            System.out.println("no");
        }

    }
}
