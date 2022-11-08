package lab;

import java.util.Scanner;

public class P11RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        System.out.printf("Length: ", length);

        double width = Double.parseDouble(scanner.nextLine());
        System.out.printf("Width: ", width);

        double height = Double.parseDouble(scanner.nextLine());
        System.out.printf("Height: ", height);

        double volume = (length * width * height) / 3;


        System.out.printf("Pyramid Volume: %.2f", volume);

    }
}
