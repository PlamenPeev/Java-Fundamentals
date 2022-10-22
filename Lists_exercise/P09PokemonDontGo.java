package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int sumRemoveElements = 0;
        while (!numbers.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                int currentIndex = numbers.get(0);
                numbers.remove(0);
                numbers.add(0, numbers.get(numbers.size() - 1));
                getIncreaseDecreaseElement(numbers, currentIndex);
                sumRemoveElements += currentIndex;
            } else if (index > numbers.size() - 1) {
                int currentIndex = numbers.get(numbers.size() - 1);
                numbers.remove(numbers.size() - 1);
                numbers.add(numbers.get(0));
                getIncreaseDecreaseElement(numbers, currentIndex);
                sumRemoveElements += currentIndex;
            } else{
                int currentIndex = numbers.get(index);
                numbers.remove(index);
                getIncreaseDecreaseElement(numbers, currentIndex);
                sumRemoveElements += currentIndex;
            }
        }
        System.out.println(sumRemoveElements);

    }

    private static void getIncreaseDecreaseElement(List<Integer> list, int n) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= n) {
                list.set(i, list.get(i) + n);
            } else if (list.get(i) > n) {
                list.set(i, list.get(i) - n);
            }
        }
    }
}
