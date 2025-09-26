/*Enunciado:
5. Suma de Números Pares (while).  
Escribe un programa que solicite números al usuario y sume solo los 
números pares. El ciclo debe continuar hasta que el usuario ingrese el número 
0, momento en el que se debe mostrar la suma total de los pares ingresados. 
Ejemplo de entrada/salida: 
Ingrese un número (0 para terminar): 4 
Ingrese un número (0 para terminar): 7 
Ingrese un número (0 para terminar): 2 
Ingrese un número (0 para terminar): 0 
La suma de los números pares es: 6 
*/
package ejercicio05;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        int numero;
        int sumaPares = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero (0 para terminar): ");
        numero = Integer.parseInt(scanner.nextLine());
        while (numero != 0) {
            if (numero % 2 == 0) {
                sumaPares += numero;
            }
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("La suma de los numeros pares es: " + sumaPares);  
        
    }

}
