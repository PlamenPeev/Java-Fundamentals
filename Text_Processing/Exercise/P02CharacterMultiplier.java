package exercise;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        char[] str1 = input[0].toCharArray();
        char[] str2 = input[1].toCharArray();

        int totalSum = 0;
        for (int i = 0; i < Math.max(str1.length, str2.length) ; i++) {
            if(i < str1.length && i < str2.length){
                totalSum += str1[i] * str2[i];
            }else if(i < str1.length && i >= str2.length){
                totalSum += str1[i];
            }else if(i >= str1.length && i < str2.length){
                totalSum += str2[i];
            }
        }
        System.out.println(totalSum);
    }
}
