
/*Enunciado:
11. Cálculo de descuento especial usando variable global. 
Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un 
método calcularDescuentoEspecial(double precio) que use la variable global para 
calcular el descuento especial del 10%. 
Dentro del método, declara una variable local descuentoAplicado, almacena 
el valor del descuento y muestra el precio final con descuento. 
Ejemplo de entrada/salida: 
Ingrese el precio del producto: 200 
El descuento especial aplicado es: 20.0 
El precio final con descuento es: 180.0 
*/
package ejercicio11;
import java.util.Scanner;
public class Ejercicio11 {


    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
        
        // Variable global para el descuento especial
        final double DESCUENTO_ESPECIAL = 0.10;
        
        // Solicitar al usuario el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        // Calcular y mostrar el descuento especial
        calcularDescuentoEspecial(precio, DESCUENTO_ESPECIAL);        
    }

    public static void calcularDescuentoEspecial(double precio, double descuentoEspecial) {
        // Calcular el descuento aplicado
        double descuentoAplicado = precio * descuentoEspecial;
        
        // Calcular el precio final con descuento
        double precioFinal = precio - descuentoAplicado;
        
        // Mostrar los resultados
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

}
