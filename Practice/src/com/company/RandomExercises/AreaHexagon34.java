import java.util.Scanner;

class AreaHexagon34 {

    public static void main(String[] args) {

        //34. Write a Java program to compute the area of a hexagon. Go to the editor
        //Area of a hexagon = (6 * s^2)/(4*tan(π/6))
        Scanner sc = new Scanner(System.in);
        System.out.println ("Input the lenght of as side of the hexagon: ");
        int side = sc.nextInt();
        double areaHexagon = 0;

        areaHexagon = (6*Math.pow(side,2))/(4*Math.tan((Math.PI/6)));
        System.out.println("The Hexagon area with side " + side + " is : " + areaHexagon);


    }
}