package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;

        ArrayList<String> memory = new ArrayList<String>();

        int memoryLimit = 200;
        for (int i = 0; i < memoryLimit; i++) {
            memory.add("****");

        }


        do
        {
            System.out.println("Input 1 if you want show MEMORY SPACE");
            System.out.println("Input 2 if want to create a SISTEM PROCESS");
            System.out.println("Input 3 if want to create an APLICATION PROCESS");
            System.out.println("Input 4 if want to delete a MEMORY SELECTED");


            System.out.println("Input the option to run: ");


            option = sc.nextInt();


            switch (option) {


                case 1:
                    System.out.println(memory);
                    break;
                case 2:
                    int sistemMax = 15;
                    int sistemMin = 5;

                    int numRandomSistem = (int)(Math.random()*(sistemMin-sistemMax+1)+sistemMax);
                    System.out.println(numRandomSistem);
                    int availableMemory = memoryLimit - numRandomSistem;


                    for  (int i =memoryLimit; i >= 0; i--) {
                        for (int j = availableMemory; j <= 199; j++) {
                            memory.set(j, "s001");
                        }
                    }
                    System.out.println(memory);

                    break;
                case 3:

                    int applicationMax = 20;
                    int applicationMin = 10;

                    int numRandomApplication= (int)(Math.random()*(applicationMin-applicationMax+1)+applicationMax);
                    System.out.println(numRandomApplication);

                    int availableMemory2 = memoryLimit - numRandomApplication;


                    for  (int i =memoryLimit; i >= 0; i--) {

                        for (int j = 0; j <= numRandomApplication; j++) {
                            memory.set(j, "a002");

                        }
                    }
                    System.out.println(memory);

                    break;
                case 4:

                    break;
            }

        }
        while(option <= 4);

    }
}


