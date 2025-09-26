/*Enunciado:
7. Validación de Nota entre 0 y 10 (do-while). 
Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el 
usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota 
hasta que ingrese un valor válido. 
Ejemplo de entrada/salida: 
Ingrese una nota (0-10): 15 
Error: Nota inválida. Ingrese una nota entre 0 y 10. 
Ingrese una nota (0-10): -2 
Error: Nota inválida. Ingrese una nota entre 0 y 10. 
Ingrese una nota (0-10): 8 
Nota guardada correctamente.
*/

package ejercicio07;
import java.util.Scanner;
public class Ejercicio07 {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
        int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(scanner.nextLine());
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota invalida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");
        
    }

}
