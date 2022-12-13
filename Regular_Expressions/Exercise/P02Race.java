package exercise;

import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        Map<String, Integer> participantsList = new LinkedHashMap<>();
        names.forEach(name -> participantsList.put(name, 0));

        String regexName = "[A-Za-z]+";
        //G4e@55or%6g6!68e!!@
        //7P%et^#e5346r
        //T$o553m&6
        Pattern patternName = Pattern.compile(regexName);

        String regexDistance = "[0-9]";
        Pattern patternDistance = Pattern.compile(regexDistance);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {

            StringBuilder name = new StringBuilder();
            Matcher matcherName = patternName.matcher(input);
            while (matcherName.find()) {
                name.append(matcherName.group());
            }
            int distance = 0;
            Matcher matcherDistance = patternDistance.matcher(input);
            while (matcherDistance.find()) {
                distance += Integer.parseInt(matcherDistance.group());
            }

            String racerName = name.toString();
            if (participantsList.containsKey(racerName)) {
                int currentDistance = participantsList.get(racerName);
                participantsList.put(racerName, currentDistance + distance);
            }

            input = scanner.nextLine();
        }
        List<String> threeRacer = participantsList.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.printf("1st place: %s%n", threeRacer.get(0));
        System.out.printf("2nd place: %s%n", threeRacer.get(1));
        System.out.printf("3rd place: %s%n", threeRacer.get(2));
    }
}
