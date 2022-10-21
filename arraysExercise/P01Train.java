package arraysExercise;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sumPeople = 0;
        for (int i = 1; i <= n; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            sumPeople += people;
            System.out.print(people + " ");

        }
        System.out.println();
        System.out.print(sumPeople);
    }
}
