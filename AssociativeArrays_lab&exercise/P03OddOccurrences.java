package lab;

import java.util.*;
import java.util.stream.Collectors;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        Map<String, Integer> counts = new LinkedHashMap<>();
        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();
            if (!counts.containsKey(wordInLowerCase)) {
                counts.put(wordInLowerCase, 1);
            } else {
                int occurrences = counts.get(wordInLowerCase);
                occurrences++;
                counts.put(wordInLowerCase, occurrences);
            }
        }
        List<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odds.add(entry.getKey());
            }
        }

        for (int i = 0; i < odds.size()-1; i++) {
            System.out.print(odds.get(i) + ", ");
        }
        System.out.println(odds.get(odds.size() - 1));
    }
}
