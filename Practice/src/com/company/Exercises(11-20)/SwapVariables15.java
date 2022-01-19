package com.company;

import java.util.Scanner;

public class SwapVariables15{

    public static void main(String[] args) {
        int num1;
        int num2;
        int change;

        num1 = 80;
        num2 = 250;

        System.out.println("Before swapping : a = "+num1+" and b = "+ + num2);

        change = num1;
        num1 = num2;
        num2 = change;
        System.out.println("After swapping : a = "+num1+" and b = "+ + num2);

    }
}
