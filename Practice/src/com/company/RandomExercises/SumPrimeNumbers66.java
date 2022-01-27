import java.util.Scanner;

class SumPrimeNumbers66 {

    public static void main(String[] args) {

    //66. Write a Java program to compute the sum of the first 100 prime numbers. G

        Scanner sc = new Scanner(System.in);
        System.out.println("Type the limit number to calculate the smulatory of prime numbers: "); //545 nummbers
        int getPrime = sc.nextInt();
        int contador = 0;
        int sum = 0;

        for(int i = 1; i <= getPrime;i++){
            for(int x = 1; x <= getPrime;x++){

                if(i % x == 0){
                    contador = contador + 1;
                }
                if(contador == 2 && x == getPrime){

                    sum = i + sum;
                    System.out.println(i);

                }
                if(x == getPrime){
                    contador = 0;
                }
            }

        }
        System.out.println("Total sum of prime numbers are: "+sum);

    }
}

