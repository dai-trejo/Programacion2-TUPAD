/*Enunciado:
. Verificación de Año Bisiesto. 
Escribe un programa en Java que solicite al usuario un año y determine si es 
bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea 
divisible por 400. 
Ejemplo de entrada/salida: 
Ingrese un año: 2024 
El año 2024 es bisiesto. 
Ingrese un año: 1900 
El año 1900 no es bisiesto. 
*/


package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

  
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int anio = Integer.parseInt(scanner.nextLine());
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
        scanner.close();
    }

}
