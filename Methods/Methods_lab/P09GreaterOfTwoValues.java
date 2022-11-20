package lab;

import com.sun.jdi.Value;

import java.lang.invoke.VarHandle;
import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input){
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                int result = getMax(firstNum,secondNum);
                System.out.println(result);
                break;
            case "char":
                char first = scanner.nextLine().charAt(0);
                char second = scanner.nextLine().charAt(0);
                char resultChar = getMax(first,second);
                System.out.println(resultChar);
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                String resultString = getMaxSting(firstString, secondString);
                System.out.println(resultString);
                break;
            default:
                break;
        }

        }

    private static String getMaxSting(String firstString, String secondString) {
        if(firstString.compareTo(secondString) >= 0){
            return firstString;
        }
        return secondString;
    }

    private static char getMax(char first, char second) {
        if(first > second){
            return first;
        }
        return second;
    }

    private static int getMax(int firstNum, int secondNum) {
        return Math.max(firstNum, secondNum);
    }


}

