import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese un número
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        
        // Calcular el factorial del número ingresado
        long factorial = calcularFactorial(numero);
        
        // Mostrar el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
    
    // Método para calcular el factorial de un número
    private static long calcularFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}