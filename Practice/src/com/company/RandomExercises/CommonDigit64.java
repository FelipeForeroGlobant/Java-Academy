import java.util.Scanner;

class CommonDigit64 {

    public static void main(String[] args) {
        boolean commonDigit = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer one: ");
        int num1 = scanner.nextInt();

        System.out.println("Input integer two ");
        int num2 = scanner.nextInt();


        if((num1 > 25 && num1 < 75) && (num2 > 25 && num2 < 75)){
            for (int i = 2; i < 75; i++) {
                if (num1 % i == 0 && num2 % i == 0) {

                }
            }
            System.out.println(commonDigit);
        }else{
            System.out.println(!commonDigit);
        }
        }
    }
