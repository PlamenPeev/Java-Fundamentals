package exercise;

import java.sql.SQLOutput;
import java.util.*;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> contest = new HashMap<>();
        Map<String, Integer> languages = new LinkedHashMap<>();

        String input = scanner.nextLine();
        int count = 0;
        while (!input.equals("exam finished")) {
            String[] data = input.split("-");
            String username = data[0];
            String language = data[1];
            if(data.length == 3) {
                int points = Integer.parseInt(input.split("-")[2]);
                if (!contest.containsKey(username)) {
                    contest.put(username, points);
                } else {
                    int currentPoints = contest.get(username);
                    if (points > currentPoints) {
                        contest.put(username, points);
                    }
                }
            }

                count++;
                if (!languages.containsKey(language)) {
                    languages.put(language, count);
                    if (language.equals("banned")) {
                        languages.remove(language);
                    }
                } else {
                    int currentNum = languages.get(language);
                    languages.put(language, currentNum + count);
                }

                if (language.equals("banned")) {
                    contest.remove(username);
                }
                count = 0;

                input = scanner.nextLine();

        }
        System.out.println("Results:");
        contest.entrySet().stream()
                .sorted((n1,n2) -> n2.getValue().compareTo(n1.getValue()))
                .forEach(name -> {
                    System.out.printf("%s | %d%n", name.getKey(), name.getValue());
                });

        System.out.println("Submissions:");
        languages.entrySet().stream()
                .sorted((n1,n2) -> n1.getKey().compareTo(n2.getKey()))
                .forEach(name -> {
                    System.out.printf("%s - %d%n", name.getKey(), name.getValue());
                });
    }
}

