package lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
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
                case "Contains":
                    int numContains = Integer.parseInt(elementsCommand[1]);
                    if (numbers.contains(numContains)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (elementsCommand[1].equals("even")) {
                        for (int num : numbers) {
                            if (num % 2 == 0) {
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();
                    } else if (elementsCommand[1].equals("odd")) {
                        for (int num : numbers) {
                            if (num % 2 == 1) {
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    if (elementsCommand[1].equals("sum")) {
                        int sum = 0;
                        for (int num : numbers) {
                            sum += num;
                        }
                        System.out.print(sum);
                    }
                    System.out.println();
                    break;
                case "Filter":
                    if (elementsCommand[1].equals("<")) {
                        for ( int num : numbers) {
                            if( num < Integer.parseInt(elementsCommand[2])){
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();
                    }
                    if (elementsCommand[1].equals(">")) {
                            for ( int num : numbers) {
                                if( num > Integer.parseInt(elementsCommand[2])){
                                    System.out.print(num + " ");
                                }
                            }
                        System.out.println();
                    }
                    if (elementsCommand[1].equals(">=")){
                            for ( int num : numbers) {
                                if( num >= Integer.parseInt(elementsCommand[2])){
                                    System.out.print(num + " ");
                                }
                            }
                        System.out.println();
                    }
                    if (elementsCommand[1].equals("<=")) {
                            for ( int num : numbers) {
                                if( num <= Integer.parseInt(elementsCommand[2])){
                                    System.out.print(num + " ");
                                }
                            }
                        System.out.println();
                    }
                    break;
            }

        }

    }
}
