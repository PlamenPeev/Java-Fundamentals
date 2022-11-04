package exercise;

import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> forceBook = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                 //{forceSide} | {forceUser}
                String forceSide = input.split("\\s+\\|\\s+")[0];
                String forceUser = input.split("\\s+\\|\\s+")[1];
                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new ArrayList<>());
                }

                boolean isExist = false;
                for (List<String> list : forceBook.values()) {
                    if (list.contains(forceUser)) {
                        isExist = true;
                    }
                }
                if (!isExist) {
                    forceBook.get(forceSide).add(forceUser);
                }

            } else if (input.contains("->")) {
                //{forceUser} -> {forceSide}
                String forceUser = input.split("\\s+->\\s+")[0];
                String forceSide = input.split("\\s+->\\s+")[1];
                forceBook.entrySet().forEach(entry -> entry.getValue().remove(forceUser));
                forceBook.putIfAbsent(forceSide, new ArrayList<>());
                forceBook.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }

            input = scanner.nextLine();
        }

        //key(side) -> value(list of people)
        forceBook.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .sorted((e1, e2) -> {
                    //1. по големина на броя на хората -> descending order
                    int sortedResult = Integer.compare(e2.getValue().size(), e1.getValue().size());
                    //1 -> втория размер > първия размер -> разменя
                    //0 -> размерите на двата списъка са еднакви
                    //-1 -> втория размер < първия размер -> не ги разменя
                    if (sortedResult == 0) {
                        //броят на хората в двете страни е еднакъв -> сортирам по име на страната
                        sortedResult = e1.getKey().compareTo(e2.getKey());
                        //е1 < е2 -> -1
                        //е1 == е2 -> 0
                        //е1 > е2 -> 1
                    }
                    return sortedResult;
                }).forEach(entry -> {
                    //Side: {forceSide}, Members: {forceUsers.Count}
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(user -> System.out.println("! " + user));
                });
    }
}
