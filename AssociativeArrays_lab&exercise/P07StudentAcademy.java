package exercise;

import com.sun.source.tree.Tree;

import java.util.*;

public class P07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentBook = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentBook.containsKey(name)) {
                studentBook.put(name, new ArrayList<>());
            }
            studentBook.get(name).add(grade);
        }

        double average;
        Map<String, Double> averageGrades = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentBook.entrySet()) {
            average = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                average = average + entry.getValue().get(i);
            }
            average = average / entry.getValue().size();
            if(average >= 4.50) {
                averageGrades.put(entry.getKey(), average);
            }
        }

        averageGrades.entrySet().stream()
                .sorted((n1, n2) -> n2.getValue().compareTo(n1.getValue()))
                .forEach(name -> {
                    System.out.printf("%s -> %.2f%n", name.getKey(), name.getValue());
                });

    }
}
