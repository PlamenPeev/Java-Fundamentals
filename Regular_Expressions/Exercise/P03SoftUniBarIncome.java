package exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //%Valid%<Valid>valid|10|valid20$, %George%<Croissant>|2|10.3$
        //%Peter%<Gum>|1|1.3$
        //%Maria%<Cola>|1|2.4$
        String regex = "%(?<customer>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        double income = 0;
        while (!input.equals("end of shift")) {
            //customer, product, count and a price
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                double totalPrice = count * price;
                System.out.printf("%s: %s - %.2f%n", customer, product, totalPrice);
                income += totalPrice;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", income);
    }
}
