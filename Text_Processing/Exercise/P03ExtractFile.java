package exercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\\\");
        String lastPart = input[input.length - 1];
        String[] output = lastPart.split("\\.");
        String name = output[0];
        String extension = output[1];
        System.out.printf("File name: %s%n", name);
        System.out.printf("File extension: %s", extension);
    }
}
