package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;

        ArrayList<String> memory = new ArrayList<String>();

        int memoryLimit = 200;
        for (int i = 0; i < memoryLimit; i++) {
            memory.add("****");

        }

        do {
            System.out.println("Input 1 if you want show MEMORY SPACE");
            System.out.println("Input 2 if want to create a SISTEM PROCESS");
            System.out.println("Input 3 if want to create an APLICATION PROCESS");
            System.out.println("Input 4 if want to delete a MEMORY SELECTED");


            System.out.println("Input the option to run: ");


            option = sc.nextInt();
            int sistemMax = 0;
            int sistemMin = 0;
            int sum = 0;

            if (option == 1) {
                sistemMax = 15;
                sistemMin = 10;

                int numRandomSistem = (int) (Math.random() * (sistemMin - sistemMax + 1) + sistemMax);
                System.out.println(numRandomSistem);

                int newRandomNum = sum + numRandomSistem;

                sum = newRandomNum;
                int availableMemory = memoryLimit - sum;

                memoryLimit = memoryLimit - sum;


                for (int i = memoryLimit; i >= 0; i--) {

                    for (int j = availableMemory; j <= 199; j++) {

                        memory.set(j, "s001");


                    }

                }


            }

            if (option == 2) {
                sistemMax = 20;
                sistemMin = 10;

                int numRandomSistem = (int) (Math.random() * (sistemMin - sistemMax + 1) + sistemMax);
                System.out.println(numRandomSistem);

                int newRandomNum = sum + numRandomSistem;

                sum = newRandomNum;
                int availableMemory = memoryLimit - sum;

                memoryLimit = memoryLimit - sum;


                for (int i = memoryLimit; i >= 0; i--) {

                    for (int j = availableMemory; j <= 199; j++) {

                        memory.set(j, "a002");

                    }

                }
            }
            System.out.println(memory);
        }
            while (option <= 4) ;

        }
}




