import java.util.Scanner;

class CompareNumbers52 {

    public static void main(String[] args) {

        //52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer

        boolean equals = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = sc.nextInt();

        System.out.println("Input second number: ");
        int num2 = sc.nextInt();

        System.out.println("Input third number: ");
        int num3 = sc.nextInt();


        if (num3 == num1 + num2) {
            System.out.println("The result is: " + equals);
        } else {
            System.out.println("The result is: " + !equals);
        }
    }
}