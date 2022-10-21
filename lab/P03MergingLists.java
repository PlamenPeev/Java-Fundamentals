package lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstLine = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondtLine = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int smallListSize = Math.min(firstLine.size(), secondtLine.size());
        for (int i = 0; i < smallListSize; i++) {
            System.out.print(firstLine.get(i) + " " + secondtLine.get(i) + " ");
        }

        if (firstLine.size() > secondtLine.size()) {
            printTheRest(firstLine, smallListSize);
        }else{
            printTheRest(secondtLine, smallListSize);
        }
    }

    private static void printTheRest(List<Integer> list, int nextElement) {
        for (int i = nextElement; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
