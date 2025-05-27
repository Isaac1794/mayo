import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar el menú y leer la opción del usuario
        System.out.println("Escriba el número de la opcion que desea realizar");
        System.out.println("1 - Centigrados a Fahrenheit");
        System.out.println("2 - Fahrenheit a Centigrados");

        int choice = scanner.nextInt();

        // Validar la entrada del usuario para asegurarse de que sea 1 o 2
        while (choice != 1 && choice != 2) {
            System.out.println("Opción no válida, vuelva a ingresar la opcion deseada");
            choice = scanner.nextInt();
        }

        double grados;
        double result;

        // Realizar la conversión según la opción del usuario
        switch (choice) {
            case 1:
                // Convertir de Celsius a Fahrenheit
                System.out.println("***** Convertir de Centigrados a Fahrenheit *****");
                System.out.print("Ingrese los grados: ");
                grados = scanner.nextDouble();
                // Fórmula: F = C * (9/5) + 32
                result = grados * (9.0 / 5.0) + 32;
                System.out.println(grados + " °C son " + result + " °F");
                break;
            case 2:
                // Convertir de Fahrenheit a Celsius
                System.out.println("***** Convertir de Fahrenheit a Centigrados *****");
                System.out.print("Ingrese los grados: ");
                grados = scanner.nextDouble();
                // Fórmula: C = (F - 32) * (5/9)
                result = (grados - 32) * (5.0 / 9.0);
                System.out.println(grados + " °F son " + result + " °C");
                break;
        }

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }

}
