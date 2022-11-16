package lab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
              //coffee, water, coke, snacks
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
              //coffee – 1.50
              //water – 1.00
              //coke – 1.40
              //snacks – 2.00

        printTotalPriceInOrder(product,quantity);

    }

    private static void printTotalPriceInOrder(String product, int quantity) {
        double price = 0.0;
        switch (product){
            case "coffee":
                price = quantity*1.0 * 1.50;
                break;
            case "water":
                price = quantity * 1.00;
                break;
            case "coke":
                price = quantity* 1.40;
                break;
            case "snacks":
                price = quantity * 2.00;
                break;
            default:
                break;
        }
        System.out.printf("%.2f", price);
    }
}
