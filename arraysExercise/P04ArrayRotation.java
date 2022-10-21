package arraysExercise;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int rotation = Integer.parseInt(scanner.nextLine());

        String[] arr = input.split(" ");

        for (int i = 1; i <= rotation; i++) {
            String firstIndex = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length -1] = firstIndex;
        }
        for (String num : arr) {
            System.out.print(num + " ");
        }
    }
}
