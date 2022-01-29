package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        ArrayList<String> memory = new ArrayList<String>();

        int memoryLimit = 200;
        for (int i = 0; i < memoryLimit; i++) {
            memory.add("****");
        }

        System.out.println("Input 1 if you want show MEMORY SPACE");
        System.out.println("Input 2 if want to create a SISTEM PROCESS");
        System.out.println("Input 3 if want to create an APLICATION PROCESS");
        System.out.println("Input 4 if want to delete a MEMORY SELECTED");

        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();


        int i = 2;

        while (i != 0) {
            System.out.println("WHILE");  // No se ejecuta.

        }
    }
}