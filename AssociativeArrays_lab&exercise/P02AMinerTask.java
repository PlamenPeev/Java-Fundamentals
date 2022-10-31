package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> results = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!results.containsKey(resource)) {
                results.put(resource, quantity);
            } else {
                int sumQuantity = results.get(resource);
                sumQuantity += quantity;
                results.put(resource, sumQuantity);
            }

            input = scanner.nextLine();
        }

        results.entrySet().stream()
                .forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));
    }
}
