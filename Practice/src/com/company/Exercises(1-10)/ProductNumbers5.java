package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ProductNumbers5 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("input the first number expressed in decimal form:");
        double num1 = scanner.nextDouble();

        System.out.println("input the second number expressed in decimal form:");
        double num2 = scanner.nextDouble();

        double product = num1*num2;
        System.out.println("The result is: " + product );
    }
}
