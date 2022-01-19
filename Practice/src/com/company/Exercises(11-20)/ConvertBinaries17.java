package com.company;

import java.util.Scanner;

public class ConvertBinaries17 {

    public static void main(String[] args) {
        // write your code here
        //Write a Java program to add two binary numbers. Go to the editor
        //Input Data:
        //Input first binary number: 10
        //Input second binary number: 11

        int num1, exp1, dig1;
        double binary1;
        int num2, exp2, dig2;
        double binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce tu primer numero entero >= 0: ");
            num1 = sc.nextInt();

            System.out.print("Introduce tu primer numero entero >= 0: ");
            num2 = sc.nextInt();

        } while (num1 < 0 && num2 < 0);

        exp1 = 0;
        binary1 = 0;
        exp2 = 0;
        binary2 = 0;
        while (num1 != 0 && num2 != 0) {
            dig1 = num1 % 2;
            dig2 = num2 % 2;

            binary1 = binary1 + dig1 * Math.pow(10, exp1);
            exp1++;
            num1 = num1 / 2;

            binary2 = binary2 + dig2 * Math.pow(10, exp2);
            exp2++;
            num2 = num2 / 2;
        }

            System.out.printf("Binario:" + binary1 + "\n" + "Binario2:" + binary2);

    }
}