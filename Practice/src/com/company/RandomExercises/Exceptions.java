import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Exceptions {

    public static void main(String[] args) {
        int num1, num2, division;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the integer number one");
        num1 = sc.nextInt();

        System.out.println("Input the integer number two");
         num2 = sc.nextInt();

        try{
           division = num1/num2;
            System.out.println(division);

        }catch (ArithmeticException exception){
            System.out.println("Se intentó dividir por cero");

        }




    }
}