import java.util.Scanner;

public class SumaNumerosConMensaje {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        if (suma > 10) {
            System.out.println("La suma es mayor que 10.");
        }

        scanner.close();
    }
}
