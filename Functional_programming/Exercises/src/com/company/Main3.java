public class Main3 {

    static final double LIMIT = 0.000000001;

    static long factorial(int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
    public static void main(String[] args) {

        double actualSum = 1d / factorial(0);//Inicializamos directamente con el primer sumando de la secuencia
        double beforeSum = 0;
        double euler = actualSum;
        int n = 1;
        do {
            beforeSum = actualSum;//Hacemos "copia" del ultimo sumando para luego poder calcular diferencia con el nuvo sumando
            actualSum = (1d / factorial(n));
            euler += actualSum;
            n++;
            //Info para comprobar en pantalla la evolucion de los calculos
            System.out.println("\nFactorial de " + n + ": " + factorial(n));
            System.out.println("Actual sum: " + actualSum);
            System.out.println("Difference: " + (actualSum - beforeSum));
            System.out.println("Actual Euler: " + euler);
        }while(actualSum - beforeSum < LIMIT);

        System.out.println("Numero Euler: " + euler);
    }
}
