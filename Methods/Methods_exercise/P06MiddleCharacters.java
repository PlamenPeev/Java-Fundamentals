package exercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        getMiddleChar(input);
    }

    private static void getMiddleChar(String input) {
        //проверка нечетно
        if(input.length() % 2 != 0){
            System.out.println(input.charAt(input.length() / 2));
        }else{//проверка четно
            System.out.print(input.charAt(input.length() / 2 - 1));
            System.out.print(input.charAt(input.length() / 2));
        }


    }
}
