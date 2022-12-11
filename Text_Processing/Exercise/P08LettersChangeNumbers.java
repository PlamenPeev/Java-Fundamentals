package exercise;

import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //A12b s17G
        String input = scanner.nextLine();
        String[] passwords = input.split("\\s+");

        double totalSum = 0;
        for (String password :passwords) {
            double modifiedNum = getModifiedNum(password);
            totalSum += modifiedNum;
        }
        System.out.printf("%.2f", totalSum);
    }

    private static double getModifiedNum(String password) {
        //A12b
        char firstLetter = password.charAt(0);
        char secondLetter = password.charAt(password.length()-1);

        //1-ви начин за число
        StringBuilder builder = new StringBuilder(password);
        double number = Double.parseDouble(builder.deleteCharAt(0)
                                                  .deleteCharAt(builder.length()-1)
                                                  .toString());

        //2-ри начин за взимане на число
//        double num1 = Double.parseDouble(password.replace(firstLetter,' ')
//                                                .replace(secondLetter, ' ')
//                                                .trim());
//        //3-ти начин за число
//        double num2 = Double.parseDouble(password.substring(1,password.indexOf(secondLetter)));

        //за Първа БУКВА
        if(Character.isUpperCase(firstLetter)){
            int positionUpperLetter = (int)firstLetter - 64;
            number /= positionUpperLetter;
        }else{
            int positionLowerLetter = (int)firstLetter - 96;
            number *= positionLowerLetter;
        }

        //за Втора БУКВА
        if(Character.isUpperCase(secondLetter)){
            int positionUpperLetter = (int)secondLetter - 64;
            number -= positionUpperLetter;
        }else{
            int positionLowerLetter = (int)secondLetter - 96;
            number += positionLowerLetter;
        }

        return number;
    }
}
