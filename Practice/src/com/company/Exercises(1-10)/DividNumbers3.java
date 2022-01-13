package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class DividNumbers3 {

    public static void main(String[] args) {
        //3. Write a Java program to divide two numbers and print on the screen.
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the dividend number expressed in decimal form:");
        double num1 = scanner.nextDouble();

        System.out.println("input any divider number followed expressed in decimal form:");
        double num2 = scanner.nextDouble();
        double divide = num1/num2;
        System.out.println( divide +" is the result to divid " + num1 + " between " + num2 );
    }
}
