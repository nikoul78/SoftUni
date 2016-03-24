package com.company;

import  java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == result) {
                    System.out.println(i + "+" + j + "=" + result);
                } else if (i - j == result) {
                    System.out.println(i + "-" + j + "=" + result);
                }
            }
        }
    }
}
