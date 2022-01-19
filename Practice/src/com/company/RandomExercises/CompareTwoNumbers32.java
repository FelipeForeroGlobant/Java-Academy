package com.company;

import java.util.Scanner;

public class CompareTwoNumbers32 {

    public static void main(String[] args) {

        //32. Write a Java program to compare two numbers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first integer number: ");
        int num1 = scanner.nextInt();
        System.out.println("Input second Integer number: ");
        int num2 = scanner.nextInt();

        if(num1 == num2){
            System.out.println(num1 + " == " + num2);
        }
        if (num1 < num2){
            System.out.println(num1 + " < " + num2);
            System.out.println(num1 + " != " + num2);
            System.out.println(num1 + " <= " + num2);
        }
        if(num1 > num2){
            System.out.println(num1+" > "+ num2);
            System.out.println(num1 + " != " + num2);
            System.out.println(num1 + " >= " + num2);
        }


    }
}
