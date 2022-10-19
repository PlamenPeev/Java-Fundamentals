package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {

            for (int i = 0; i < firstPlayer.size(); i++) {
                for (int j = 0; j < secondPlayer.size(); j++) {
                    int firstPLCard = firstPlayer.get(i);
                    int secondPLCard = secondPlayer.get(j);
                    if (firstPLCard > secondPLCard) {
                        firstPlayer.add(firstPLCard);
                        firstPlayer.add(secondPLCard);
                        firstPlayer.remove(0);
                        secondPlayer.remove(0);
                    } else if (firstPLCard < secondPLCard) {
                        secondPlayer.add(secondPLCard);
                        secondPlayer.add(firstPLCard);
                        firstPlayer.remove(0);
                        secondPlayer.remove(0);
                    } else if (firstPLCard == secondPLCard) {
                        firstPlayer.remove(0);
                        secondPlayer.remove(0);
                    }
                    j--;
                    if (firstPlayer.isEmpty()) {
                        break;
                    }
                    if (secondPlayer.isEmpty()) {
                        break;
                    }
                }

            }

        }
        if (firstPlayer.isEmpty()) {
            System.out.print("Second player wins! ");
            int sum = 0;
            for (int i = 0; i < secondPlayer.size(); i++) {
                sum += secondPlayer.get(i);
            }
            System.out.printf("Sum: %d", sum);
        } else if (secondPlayer.isEmpty()) {
            System.out.print("First player wins! ");
            int sum = 0;
            for (int i = 0; i < firstPlayer.size(); i++) {
                sum += firstPlayer.get(i);
            }
            System.out.printf("Sum: %d", sum);
        }
    }
}
