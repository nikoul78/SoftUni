package com.company;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        float b = input.nextFloat();
        float c = input.nextFloat();

        String hex = Integer.toHexString(a).toUpperCase();
        String binary = Integer.toBinaryString(a);

        System.out.printf("|%1$-10s|%2$010d|%3$10.2f|%4$-10.3f| ", hex, Integer.parseInt(binary), b, c);


    }
}
