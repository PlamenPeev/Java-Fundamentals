package arraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String input = scanner.nextLine();
       String[] numbers = input.split(" ");
       int[] arr = new int[numbers.length];

       int sum=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.println(sum);

    }
}
