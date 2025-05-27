// Incluir la biblioteca estándar de entrada/salida para funciones como printf y scanf
#include <stdio.h>

int main() {
    // Declarar variables enteras para almacenar los tres números ingresados por el usuario y el número mayor
    int num1, num2, num3, largestNumber;

    // Solicitar al usuario que ingrese el primer número y leerlo
    printf("Ingrese el primer número: ");
    scanf("%d", &num1); // Lee un entero y lo almacena en num1

    // Solicitar al usuario que ingrese el segundo número y leerlo
    printf("Ingrese el segundo número: ");
    scanf("%d", &num2); // Lee un entero y lo almacena en num2

    // Solicitar al usuario que ingrese el tercer número y leerlo
    printf("Ingrese el tercer número: ");
    scanf("%d", &num3); // Lee un entero y lo almacena en num3

    // Determinar el número mayor utilizando una serie de declaraciones condicionales
    // Compara num1 con num2 y num3
    if (num1 >= num2 && num1 >= num3) {
        largestNumber = num1; // Si num1 es el mayor o igual, se asigna a largestNumber
    // Si num1 no es el mayor, compara num2 con num1 y num3
    } else if (num2 >= num1 && num2 >= num3) {
        largestNumber = num2; // Si num2 es el mayor o igual, se asigna a largestNumber
    // Si ni num1 ni num2 son los mayores, entonces num3 debe ser el mayor
    } else {
        largestNumber = num3; // num3 se asigna a largestNumber
    }

    // Imprimir el número mayor encontrado en la consola
    printf("El número mayor es: %d\n", largestNumber);

    // Indicar que el programa terminó exitosamente
    return 0;
}
