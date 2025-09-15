/*Enunciado:
Escribe un programa que solicite dos números enteros y realice las siguientes 
operaciones:   
a. Suma   
b. Resta   
c. Multiplicación   
d. División  
Muestra los resultados en la consola. 
*/
package tp01;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        
        scanner.close();
    }
}