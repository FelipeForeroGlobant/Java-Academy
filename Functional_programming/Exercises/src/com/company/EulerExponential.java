package com.company;

import static java.lang.Math.pow;
import java.util.Scanner;

public class EulerExponential {

    public static void main(String[] args) {
        double x;
        int n;
        Scanner reader = new Scanner(System.in);
        System.out.printf("Type the value of x: ");
        x = reader.nextDouble();
        System.out.printf("Type the number of terms you want to add: ");
        n = reader.nextInt();

        if (n >= 11) {
            System.out.printf("The numbers of terms must be less than or equal to 10%n");
        } else {
            int i = 0;
            double sum = 0;
            double fact = 1;
            do {
                if (i != 0) {
                    fact *= i;
                }
                sum += pow(x, i) / fact;
                i++;
            } while (i < n);
            System.out.printf("e^x = %f%n", sum);
        }
    }
}