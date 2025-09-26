/*Enunciado:
4. Calculadora de Descuento según categoría. 
Escribe un programa que solicite al usuario el precio de un producto y 
su categoría (A, B o C). 
Luego, aplique los siguientes descuentos: 
Categoría A: 10% de descuento 
Categoría B: 15% de descuento  
Categoría C: 20% de descuento 
El programa debe mostrar el precio original, el descuento aplicado y el 
precio final 
Ejemplo de entrada/salida: 
Ingrese el precio del producto: 1000 
Ingrese la categoría del producto (A, B o C): B 
Descuento aplicado: 15% 
Precio final: 850.0
*/
package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        //Programa para calcular el descuento de un producto según su categoría
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora de descuentos.");
        //Solicitar al usuario que ingrese el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(scanner.nextLine());
        //Solicitar al usuario que ingrese la categoría del producto
        System.out.print("Ingrese la categoría del producto (A [10%], B [15%] o C [20%]): ");
        char categoria = scanner.nextLine().toUpperCase().charAt(0);
        double descuento = 0.0;
        //Determinar el descuento según la categoría ingresada
        switch (categoria) {
            case 'A':
                descuento = 0.10; //10% de descuento
                break;
            case 'B':
                descuento = 0.15; //15% de descuento
                break;
            case 'C':
                descuento = 0.20; //20% de descuento
                break;
            default:
                System.out.println("Categoría no válida. Por favor, ingrese A, B o C.");
                return; //Salir del programa si la categoría es invalida
        }
        //Calcular el descuento aplicado y el precio final
        double descuentoAplicado = precio * descuento;
        double precioFinal = precio - descuentoAplicado;
        //Mostrar el precio original, el descuento aplicado y el precio final
        System.out.printf("Precio original: %.2f%n", precio);
        System.out.printf("Descuento aplicado: %.2f%n", descuentoAplicado);
        System.out.printf("Precio final: %.2f%n", precioFinal);
        
        
    }

}
