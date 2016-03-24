package com.company;
import java.util.Scanner;
public class ConvertFromDecimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        String base = Integer.toString(decimal, 7);
        System.out.println(base);

    }
}
