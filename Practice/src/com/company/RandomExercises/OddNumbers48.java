package com.company;

import java.util.Scanner;


public class OddNumbers48 {

    public static void main(String[] args) {

        //48. Write a Java program to print the odd numbers from 1 to 99.

        Scanner sc = new Scanner(System.in);
        System.out.println("Type the number up to where you want to calculate the odd numbers: ");
        int numberLimit = sc.nextInt();
        System.out.println("Odd numbers existing up to " + numberLimit + " are:");

        for (int i = 0; i <= numberLimit; i++) {

            if(i % 2 == 1) {
                System.out.println(i);
            }
        }

    }
}
