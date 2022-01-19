import java.util.Scanner;

class PolygonArea35 {

    public static void main(String[] args) {

        //34. Write a Java program to compute the area of a hexagon. Go to the editor
        //Area of a hexagon = (6 * s^2)/(4*tan(π/6))
        Scanner sc = new Scanner(System.in);
        System.out.println ("Input the number of side on the polygon: ");
        int numberSide = sc.nextInt();

        System.out.println("Input the length of one of the sides");
        int length = sc.nextInt();
        double polygonArea = 0;

        polygonArea = ((numberSide*Math.pow(length,2))/(4*Math.tan(Math.PI/numberSide)));

        System.out.println("The polygon area with " + numberSide + "sides and lenght" + length + "is : " + polygonArea );

    }
}