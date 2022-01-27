package com.company;

import java.util.Scanner;


public class
NumberOddOrEven49 {

    public static void main(String[] args) {

        //48. Write a Java program to print the odd numbers from 1 to 99.

        Scanner sc = new Scanner(System.in);
        System.out.println("Type the number to know if odd or even: ");

        int number = sc.nextInt();


        if(number % 2 == 0){
            System.out.println(1);
            System.out.println("Number: " + number + " is Even");

        }
        else if (number % 2 == 1) {
            System.out.println(0);
            System.out.println("Number: " + number + " is Odd");

        }

    }
}
