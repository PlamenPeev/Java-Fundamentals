package arraysLab;

import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        int[] arr = new int[numbers.length];

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbers.length ; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
            if(arr[i] % 2 == 0){
                sumEven += arr[i];
            }else {
                sumOdd += arr[i];
            }
        }
         int diff = sumEven - sumOdd;
        System.out.println(diff);
    }
}
