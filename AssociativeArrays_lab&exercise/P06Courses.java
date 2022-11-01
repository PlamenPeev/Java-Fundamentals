package exercise;

import java.util.*;

public class P06Courses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> mapOfListCourses = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String coursename = input.split(" : ")[0];
            String studentname = input.split(" : ")[1];

            if (!mapOfListCourses.containsKey(coursename)) {
                mapOfListCourses.put(coursename, new ArrayList<>());
            }
            mapOfListCourses.get(coursename).add(studentname);

            input = scanner.nextLine();
        }


        mapOfListCourses.entrySet().stream().sorted((f, s) ->
                        s.getValue().size() - f.getValue().size())
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().sorted(String::compareTo)
                            .forEach(e -> System.out.printf("-- %s%n", e));
                });
    }
}
