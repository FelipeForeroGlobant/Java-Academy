package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class SumNumbers2 {

    public static void main(String[] args) {
        //2. Write a Java program to print the sum of two numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("input any number followed expressed in decimal form:");
        double num1 = scanner.nextDouble();

        System.out.println("input any number followed expressed in decimal form:");
        double num2 = scanner.nextDouble();
        double sum = num1+num2;
        System.out.println("total sum es : " + sum);

    }
}
