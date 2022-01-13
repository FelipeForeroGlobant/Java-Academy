package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class MultiplicationTables7 {

    public static void main(String[] args) {
        //Write a Java program that takes a number as input and prints its multiplication table upto 10

        Scanner scanner = new Scanner(System.in);
        System.out.println("input any number expressed in integer form only: ");
        int num1 = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            int  multiplicationTable = num1*i;
            System.out.println(num1 + " * "+ i + " = " + multiplicationTable);

        }

    }
}
