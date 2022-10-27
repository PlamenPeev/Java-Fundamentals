package lab;

import java.util.*;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> synonymDictionary = new LinkedHashMap<>();

        for (int i = 1; i <=n ; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if(!synonymDictionary.containsKey(word)){
                List<String> synonymsForCurrentWord = new ArrayList<>();
                synonymsForCurrentWord.add(synonym);
                synonymDictionary.put(word, synonymsForCurrentWord);
            }else{
                List<String> synonymsForCurrentWord = synonymDictionary.get(word);
                synonymsForCurrentWord.add(synonym);
                synonymDictionary.put(word, synonymsForCurrentWord);
            }
        }

        for (Map.Entry< String, List<String>> entry : synonymDictionary.entrySet()) {
            String currentWord = entry.getKey();
            List<String> currentSynonymsForWord = entry.getValue();

            System.out.printf("%s - %s%n", currentWord,
                    String.join(", ", currentSynonymsForWord));
        }
    }
}
