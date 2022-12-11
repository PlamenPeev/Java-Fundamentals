package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //">>{furniture name}<<{price}!{quantity}"
        //>>Sofa<<312.23!3
        //>>TV<<300!5
        String regex = ">>(?<name>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]+)!(?<quantity>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> furnitures = new ArrayList<>();
        double moneySpend = 0;
        while (!input.equals("Purchase")) {
            //">>{furniture name}<<{price}!{quantity}"

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                Double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furnitures.add(matcher.group("name"));
                moneySpend += price * quantity;
            }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        furnitures.forEach(furniture -> System.out.println(furniture));
//        for ( String furniture : furnitures) {
//            System.out.println(furniture);
//        }
        System.out.printf("Total money spend: %.2f", moneySpend);
    }
}
