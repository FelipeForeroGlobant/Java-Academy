import java.util.Scanner;

class SumDigitsInteger33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println ("Input integer number: ");
        int num = sc.nextInt();
        int b,sum=0;
        while(num>0)
        {
            if (num != 0)
            {
                b=num % 10;
                sum=sum+b;
                num=num/10;

            }
        }
        System.out.println(sum);
    }
}