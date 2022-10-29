package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> lettersCount = new LinkedHashMap<>();
        for (int i = 0; i <= text.length() - 1; i++) {
            char currentSymbol = text.charAt(i);
            if (currentSymbol == ' ') {
                continue;
            }

            if (!lettersCount.containsKey(currentSymbol)) {
                lettersCount.put(currentSymbol, 1);
            } else {
                int occurrences = lettersCount.get(currentSymbol);
                occurrences++;
                lettersCount.put(currentSymbol, occurrences);
            }
        }

//        for (Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
//            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
//        }
        lettersCount.entrySet().stream()
                .forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));

    }
}
