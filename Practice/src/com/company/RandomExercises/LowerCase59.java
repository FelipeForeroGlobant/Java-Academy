import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class LowerCase59 {

    public static void main(String[] args) {

        //59. Write a Java program to convert a given string into lowercase. Go to the editor

        Scanner sc = new Scanner(System.in);
        System.out.println("Input text to convert to LoweCase");
        String text = sc.next();
        System.out.println(text.toLowerCase());

    }
}