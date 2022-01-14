package com.company;

import java.util.Scanner;

public class Circle11 {

    public static void main(String[] args) {
        // write your code here
        //Write a Java program to print the area and perimeter of a circle.
        //Radius = 7.5
        //Expected Output
        //Perimeter is = 47.12388980384689
        //Area is = 176.71458676442586

        //P = 2*Pi*R
        //A= pi*r(^2)

        Scanner scanner = new Scanner(System.in);
        System.out.println("input the Radius of a circle: ");
        double radius = scanner.nextDouble();

        double perimeter = 2*Math.PI*radius;
        double area = Math.PI* Math.pow(radius,2);

        System.out.println("The perimeter of a circle with radius" + radius + "is : " + perimeter );
        System.out.println("The area of a circle with radius" + radius + "is : " + area );




    }
}
