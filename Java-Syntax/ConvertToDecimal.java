package com.company;
import java.util.Scanner;

public class ConvertToDecimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String base = input.next();
        int decimal = Integer.valueOf(base, 7);
        System.out.println(decimal);
    }
}
