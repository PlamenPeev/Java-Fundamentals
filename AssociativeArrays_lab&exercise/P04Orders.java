package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Double> products = new LinkedHashMap<>();
        Map<String, Double> totalPrice = new LinkedHashMap<>();
        Map<String, Double> totalQuantity = new LinkedHashMap<>();
        while (!input.equals("buy")) {
            String name = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            double quantity = Double.parseDouble(input.split(" ")[2]);

            if (!products.containsKey(name)) {
                totalPrice.put(name, price);
                totalQuantity.put(name, quantity);
                products.put(name, price*quantity);
            } else {
                double newQuantity = totalQuantity.get(name) + quantity;
                    totalPrice.put(name, price);
                    totalQuantity.put(name, newQuantity);
                    products.put(name, price * newQuantity);

            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : products.entrySet()) {
           System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}
