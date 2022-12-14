package exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldierCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        Map<String,String> decryptedValidMS =  new TreeMap<>();

        for (int i = 1; i <= n ; i++) {
            String encryptedMS = scanner.nextLine();
            int count = 0;
            for (int j = 0; j < encryptedMS.toCharArray().length; j++) {
                char currentSymbol = encryptedMS.charAt(j);
                if (currentSymbol == 's' || currentSymbol == 'S') {
                    count++;
                }
                if (currentSymbol == 't' || currentSymbol == 'T') {
                    count++;
                }
                if (currentSymbol == 'a' || currentSymbol == 'A') {
                    count++;
                }
                if (currentSymbol == 'r' || currentSymbol == 'R') {
                    count++;
                }
            }
            StringBuilder decryptedMS = new StringBuilder();
            for (int j = 0; j < encryptedMS.toCharArray().length; j++) {
                char currentSymbol = encryptedMS.charAt(j);
                decryptedMS.append((char)(currentSymbol - count));
            }

            Matcher matcher = pattern.matcher(decryptedMS);
            //planet name, population, attack type ('A', as attack or 'D', as destruction) and soldier count.
            if(matcher.find()){
                String planetName = matcher.group("planetName");
                String population = matcher.group("population");
                String attackType = matcher.group("attackType");
                int sodierCount = Integer.parseInt(matcher.group("soldierCount"));
                decryptedValidMS.put(planetName, attackType);
            }

        }

        int countA = 0;
        for (Map.Entry <String,String> entry : decryptedValidMS.entrySet()) {
            if (entry.getValue().equals("A")) {
                countA++;
            }
        }
        System.out.printf("Attacked planets: %d%n", countA);
        for (Map.Entry<String, String> entry : decryptedValidMS.entrySet()) {
            if (entry.getValue().equals("A")) {
                System.out.printf("-> %s%n", entry.getKey());
            }
        }

        int countD = 0;
        for (Map.Entry <String,String> entry : decryptedValidMS.entrySet()) {
            if (entry.getValue().equals("D")) {
                countD++;
            }
        }
        System.out.printf("Destroyed planets: %d%n", countD);
        for (Map.Entry<String, String> entry : decryptedValidMS.entrySet()) {
            if (entry.getValue().equals("D")) {
                System.out.printf("-> %s%n", entry.getKey());
            }
        }

    }
}
