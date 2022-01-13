package com.company;

import java.util.Scanner;

public class Arithmetic6 {
    //Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
    //Test Data:
    //Input first number: 125
    //Input second number: 24
    //Expected Output :
    //125 + 24 = 149
    //125 - 24 = 101
    //125 x 24 = 3000
    //125 / 24 = 5
    //125 mod 24 = 5

    public static void main(String[] args) {
   //Write a Java program that takes a number as input and prints its multiplication table upto 10

        Scanner scanner = new Scanner(System.in);
        System.out.println("input the first number expressed in integer form only: ");
        int num1 = scanner.nextInt();

        System.out.println("input the second number expressed in integer form only: ");
        int num2 = scanner.nextInt();

        int sum = num1+num2;
        int substract = num1-num2;
        int product = num1*num2;
        int divide = num1/num2;
        int mod = num1 % num2;

        System.out.println("a."+sum + " is the result of the sum between " + num1 + " and " + num2 );
        System.out.println("b."+substract + " is the result of substract " + num2 + " from " + num1 );
        System.out.println("c."+ product + " is the result of product " + num1 + " and " + num2 );
        System.out.println("d."+ divide + " is the result of divide " + num1 + " between " + num2 );
        System.out.println("e."+ mod + "  is the Remainder of a division between " + num1 + " and" + num2 );

    }
}
