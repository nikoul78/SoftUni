package com.company;

import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split(" ");
        int n = Integer.parseInt(input.findInLine("\\d+"));
        String oddOrEven = input.next();
        int counter = 0;

        for (int i = 0; i < str.length; i++){
            String strSec = " ";
            if (counter == n){
                break;
            }
            if (counter == n - 1 || i == str.length - 1){
                strSec = "";
            }

            int currentNumber = Integer.parseInt(str[i]);
            if (currentNumber % 2 == 0 && oddOrEven.equals("even")){
                System.out.printf("%d%s", currentNumber, strSec);
                counter++;
            }
            else if (currentNumber % 2 != 0 && oddOrEven.equals("odd")){
                System.out.printf("%d%s", currentNumber, strSec);
                counter++;
            }
        }
    }
}
