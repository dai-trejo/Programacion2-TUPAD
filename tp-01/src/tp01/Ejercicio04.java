/*Enunciado:
Escribe un programa que solicite al usuario ingresar su nombre y edad, y luego 
los muestre en pantalla. Usa Scanner para capturar los datos. 
*/
package tp01;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer entrada del teclado
        Scanner scanner = new Scanner(System.in);
        
        // Pedir datos al usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();     
        
        // Mostrar los datos ingresados
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad );
        
        // Cerrar el scanner
        scanner.close();
    }
}
