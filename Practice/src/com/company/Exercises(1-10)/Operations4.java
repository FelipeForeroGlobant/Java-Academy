package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Operations4 {

    public static void main(String[] args) {
        //Write a Java program to print the result of the following operations. Go to the editor
        //Test Data:
        //a. -5 + 8 * 6
        //b. (55+9) % 9
        //c. 20 + -3*5 / 8
        //d. 5 + 15 / 3 * 2 - 8 % 3
        int firstResult = (-5+8*6);
        System.out.println("a." + firstResult);

        int secondResult = ((55+9)%9);
        System.out.println("b." + secondResult);

        int thirdResult = (20+((-3*5)/8));
        System.out.println("c."+thirdResult);

        int fourthResult = (5+(15/3*2)-(8%3));
        System.out.println("d."+fourthResult);

    }
}
