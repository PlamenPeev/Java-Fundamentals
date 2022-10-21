package lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (true) {
            String commands = scanner.nextLine();
            if (commands.equals("end")) {
                break;
            }

            String[] elementsCommand = commands.split(" ");
            switch (elementsCommand[0]) {
                case "Add":
                    int numberAdd = Integer.parseInt(elementsCommand[1]);
                    numbers.add(numberAdd);
                    break;
                case "Remove":
                    int numberRemove = Integer.parseInt(elementsCommand[1]);
                    numbers.remove(Integer.valueOf(numberRemove));
                    break;
                case "RemoveAt":
                    int numRemoveAt = Integer.parseInt(elementsCommand[1]);
                    numbers.remove(numRemoveAt);
                    break;
                case "Insert":
                    int numInsert = Integer.parseInt(elementsCommand[1]);
                    int numInsertIndex = Integer.parseInt(elementsCommand[2]);
                    numbers.add(numInsertIndex, numInsert);
                    break;

            }


        }
        for ( int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
