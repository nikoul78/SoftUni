package com.company;

import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();


        double resultFirst = Math.pow(((a * a + b * b) / (a * a - b * b)), (a + b + c) / (Math.sqrt(c)));
        double resultSecond = Math.pow((a*a+b*b-Math.pow(c,3)),a-b);
        double averageFirst = (a+b+c)/3;
        double averageSecond = (resultFirst+resultSecond)/2;
        double diff = Math.abs(averageFirst-averageSecond);

        System.out.printf("F1 result: %.2f; ",resultFirst);
        System.out.printf("F2 result: %.2f; ", resultSecond);
        System.out.printf("Diff: %.2f", diff);


    }
}
