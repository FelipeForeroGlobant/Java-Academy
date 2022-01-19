package com.company;



import java.util.Scanner;

class ConvertStringToInteger51 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number: ");
        String stringNumber = sc.next();
        System.out.println(stringNumber);

        int integerNumber = Integer.parseInt(stringNumber);

        System.out.println(integerNumber);


    }
}
