package lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());


        for (int i = 0; i < numbers.size()-1; i++) {
            double sum = 0;
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                sum += numbers.get(i) + numbers.get(i + 1);
                numbers.set(i, sum);
                numbers.remove(i + 1);
                i = -1;
            }
        }
        DecimalFormat nums = new DecimalFormat("0.#");
        for (double num : numbers) {
            System.out.print(nums.format(num) + " ");
        }
    }
}
