/*Enunciado:
3. Clasificación de Edad. 
Escribe un programa en Java que solicite al usuario su edad y clasifique su 
etapa de vida según la siguiente tabla: 
Menor de 12 años: "Niño" 
Entre 12 y 17 años: "Adolescente" 
Entre 18 y 59 años: "Adulto" 
60 años o más: "Adulto mayor" 
Ejemplo de entrada/salida: 
Ingrese su edad: 25 
Eres un Adulto. 
Ingrese su edad: 10 
Eres un Niño. 
*/

package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa de clasificación de etapas de vida.");
        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        // Leer la edad ingresada por el usuario
        int edad = Integer.parseInt(scanner.nextLine());
        String etapaVida;
        // Clasificar la etapa de vida según la edad ingresada
        if (edad < 12) {
            etapaVida = "Eres un Niño";
        } else if (edad >= 12 && edad <= 17) {
            etapaVida = "Eres un Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            etapaVida = "Eres un Adulto";
        } else {
            etapaVida = "Eres un Adulto mayor";
        }
        // Mostrar la etapa de vida al usuario
        System.out.println("Su etapa de vida es: " + etapaVida);
    }

}
