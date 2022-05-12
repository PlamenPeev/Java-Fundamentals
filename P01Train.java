package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commands = input.split(" ");

            if(commands[0].equals("Add")){
                int addNewWagon = Integer.parseInt(commands[1]);
              wagons.add(addNewWagon);
            }else{
                int passengers = Integer.parseInt(commands[0]);
                for (int i = 0; i < wagons.size() ; i++) {
                    int currentWagon = wagons.get(i);
                    if((currentWagon + passengers) <= maxCapacity){
                        wagons.set(i, currentWagon + passengers);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int num : wagons) {
            System.out.print(num + " ");
        }
    }
}
