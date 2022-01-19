import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class SystemHour46 {

    public static void main(String[] args) {

   //46. Write a Java program to display the system time.


        DateTimeFormatter dayTimeDate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dayTimeDate .format(LocalDateTime.now()));

        DateTimeFormatter dayTimeDate2 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
        System.out.println(dayTimeDate2.format(LocalDateTime.now()));

        DateTimeFormatter dayTimeDate3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm");
        System.out.println(dayTimeDate3.format(LocalDateTime.now()));

        DateTimeFormatter dayTimeDate4 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd hh:mm:ss");
        System.out.println(dayTimeDate4.format(LocalDateTime.now()));

        DateTimeFormatter dayTimeDate5 = DateTimeFormatter.ofPattern("YYYY/MMMM/DD HH:mm:ss");
        System.out.println(dayTimeDate5.format(LocalDateTime.now()));



    }
}