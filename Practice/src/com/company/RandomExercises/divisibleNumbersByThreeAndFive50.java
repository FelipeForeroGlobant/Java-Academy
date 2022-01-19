
package com.company;

        import java.util.Scanner;


public class divisibleNumbersByThreeAndFive50  {

    public static void main(String[] args) {

        //50. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.

        Scanner sc = new Scanner(System.in);
        System.out.println("Type the limit number where you want to perform the operations: ");
        int numberLimit = sc.nextInt();

        System.out.println("number divisible by three: " );
        for (int i = 1; i < numberLimit; i++) {
            if (i % 3 == 0) {
                System.out.println(i);

            }
        }

            System.out.println("number divisible by five: " );
            for (int j = 1; j < numberLimit; j++) {
                if(j % 5 == 0){
                    System.out.println(j);

                }
            }


            System.out.println("numbers divisible by three and five: " );
            for (int k = 1; k < numberLimit; k++) {
                if ((k % 3 == 0) && (k % 5 == 0)){
                    System.out.println(k);
                }
            }

        }

    }
