package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        while(numbers.length > 1){
            int[] condense = new int[numbers.length-1];
            for (int i = 0; i < condense.length; i++) {
                condense[i] = numbers[i] + numbers[i + 1];
            }
            numbers = condense;
        }

        System.out.println(numbers[0]);
    }
}
