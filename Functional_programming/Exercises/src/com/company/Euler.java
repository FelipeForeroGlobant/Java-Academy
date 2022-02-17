package com.company;


import java.util.Scanner;

public class Euler {

    public static void main(String[] args) {
        System.out.println("input any number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(factorial(number));

    }

    public static int factorial(int n) {
  {
            int result;
            if (n==1) return 1;
            result=factorial(n-1)*n;
            return result;


        }

    }



}
