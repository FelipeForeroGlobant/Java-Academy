package com.company;

import java.util.Scanner;

public class AverageNumbers12 {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the amount of numbers over which you want to calculate the average: ");

        int totalNumbers = scanner.nextInt();
        double suma = 0.0;
        double average = 0;

        for (int i = 1; i <= totalNumbers; i++) {
            System.out.println("num" + i);
            double num = scanner.nextInt();
            double newNum = suma;
            double sum = num+newNum;
            num = sum;
            suma = sum;

        }
        System.out.println("the result of sum is:" + suma);
        System.out.println("The average is " + suma/totalNumbers);

    }
}
