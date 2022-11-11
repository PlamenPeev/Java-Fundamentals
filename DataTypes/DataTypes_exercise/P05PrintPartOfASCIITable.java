package exercise;

import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startSymbol = Integer.parseInt(scanner.nextLine());;
        int endSymbol = Integer.parseInt(scanner.nextLine());;

        for (int i = startSymbol; i <= endSymbol ; i++) {
            System.out.print((char)i + " ");
        }
    }
}
