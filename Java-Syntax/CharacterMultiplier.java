package com.company;
import java.util.Scanner;
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstString = console.next("\\w+");
        String secondString = console.next("\\w+");

        System.out.println(findingProduct(firstString, secondString));
    }

    static int findingProduct(String firstString, String secondString) {
        int product = 0;
        if (firstString.length() == secondString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                product += firstString.charAt(i) * secondString.charAt(i);
            }
        } else if (firstString.length() > secondString.length()) {
            for (int i = 0; i < secondString.length() ; i++) {
                product+= firstString.charAt(i) * secondString.charAt(i);
            }
            for (int i = secondString.length() ; i < firstString.length() ; i++) {
                product+= firstString.charAt(i);
            }

        }else {
            for (int i = 0; i < firstString.length() ; i++) {
                product+= firstString.charAt(i) * secondString.charAt(i);
            }
            for (int i = firstString.length() ; i < secondString.length() ; i++) {
                product+= secondString.charAt(i);
            }
        }
        return product;
    }
}
