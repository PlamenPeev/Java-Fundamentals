package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> database = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            String username = input.split(" ")[1];

            if (command.equals("register")) {
                String licensePlateNumber = input.split(" ")[2];
                if (!database.containsKey(username)) {
                    database.put(username, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                } else {
                    if (database.get(username).equals(licensePlateNumber)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                    }
                }
            } else {
                if (!database.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    System.out.printf("%s unregistered successfully%n", username);
                    database.remove(username);
                }
            }
        }

        for ( Map.Entry <String, String> entry : database.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
