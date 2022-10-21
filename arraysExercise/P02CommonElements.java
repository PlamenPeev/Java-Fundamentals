package arraysExercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

String first = scanner.nextLine();
String second = scanner.nextLine();

String[] firstArr = first.split(" ");
String[] secondArr = second.split(" ");
        for (int i = 0; i <= secondArr.length-1 ; i++) {
            for (int j = 0; j <= firstArr.length-1; j++) {
                if (secondArr[i].equals(firstArr[j])){
                    System.out.print(secondArr[i] + " ");
                }

            }
        }
    }
}
