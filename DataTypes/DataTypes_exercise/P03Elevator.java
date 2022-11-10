package exercise;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int numberOfPeople = Integer.parseInt(scanner.nextLine());
int capacityOfElevator = Integer.parseInt(scanner.nextLine());

int courses = (int)Math.ceil((double)numberOfPeople / capacityOfElevator);

        System.out.println(courses);
    }
}
