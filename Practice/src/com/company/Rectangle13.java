package com.company;

import java.util.Scanner;

public class Rectangle13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("indicate rectangle height ");
        double heightRectangle = scanner.nextDouble();

        System.out.println("indicate rectangle width ");
        double widthRectangle = scanner.nextDouble();

        double parameterRectangle = (heightRectangle*2)+(widthRectangle*2);
        double area = (heightRectangle*widthRectangle);

        System.out.println("The rectangle parameter is: " + parameterRectangle);
        System.out.println("The area parameter is: " + area);

    }
}
