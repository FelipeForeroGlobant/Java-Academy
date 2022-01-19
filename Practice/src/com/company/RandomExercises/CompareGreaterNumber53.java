package com.company;

import java.util.Scanner;

public class CompareGreaterNumber53 {


    public static void main(String[] args) {

        //53. Write a Java program that accepts three integers from the user and return true if the
        // second number is greater than first number and third number is greater
        //than second number. If "abc" is true second number does not need to be greater than first number

        boolean equals = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = sc.nextInt();

        System.out.println("Input second number: ");
        int num2 = sc.nextInt();

        System.out.println("Input third number: ");
        int num3 = sc.nextInt();

        if(num1<num2 && num3>num2){
            System.out.println(equals);
        }





    }
}
