// Importar la clase Scanner para permitir la entrada del usuario
import java.util.Scanner;

public class FindLargest {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada desde la consola
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número y leerlo
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        // Solicitar al usuario que ingrese el segundo número y leerlo
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        // Solicitar al usuario que ingrese el tercer número y leerlo
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int largestNumber;

        // Determinar el número mayor utilizando una serie de declaraciones condicionales
        // Compara num1 con num2 y num3
        if (num1 >= num2 && num1 >= num3) {
            largestNumber = num1;
        // Si num1 no es el mayor, compara num2 con num1 y num3
        } else if (num2 >= num1 && num2 >= num3) {
            largestNumber = num2;
        // Si ni num1 ni num2 son los mayores, entonces num3 debe ser el mayor
        } else {
            largestNumber = num3;
        }

        // Imprimir el número mayor encontrado en la consola
        System.out.println("El número mayor es: " + largestNumber);

        // Cerrar el objeto Scanner para liberar los recursos del sistema asociados con él
        scanner.close();
    }

}
