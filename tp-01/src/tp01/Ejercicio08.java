/*Enunciado:
8. Manejar conversiones de tipo y división en Java.  
a. Escribe un programa que divida dos números enteros ingresados por el 
usuario.  
b. Modifica el código para usar double en lugar de int y compara los 
resultados. 
*/
package tp01;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Parte a: División con enteros
        System.out.println("=== División con enteros ===");
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();
        
        int resultadoInt = num1 / num2;
        System.out.println("Resultado (int): " + resultadoInt);
        
        // Parte b: División con double
        System.out.println("\n=== División con double ===");
        System.out.print("Ingrese el primer número decimal: ");
        double num3 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número decimal: ");
        double num4 = scanner.nextDouble();
        
        double resultadoDouble = num3 / num4;
        System.out.println("Resultado (double): " + resultadoDouble);
        
        scanner.close();
    }
}