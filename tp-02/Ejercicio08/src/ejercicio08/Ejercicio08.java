/*Enunciado:
8. Cálculo del Precio Final con impuesto y descuento.  
Crea un método calcularPrecioFinal(double impuesto, double 
descuento) que calcule el precio final de un producto en un e-commerce. La 
fórmula es: 
PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) 
PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times 
Descuento) 
Desde main(), solicita el precio base del producto, el porcentaje de 
impuesto y el porcentaje de descuento, llama al método y muestra el precio 
final. 
Ejemplo de entrada/salida: 
Ingrese el precio base del producto: 100 
Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10 
Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5 
El precio final del producto es: 105.0 
*/
package ejercicio08;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = Double.parseDouble(scanner.nextLine()) / 100;
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = Double.parseDouble(scanner.nextLine()) / 100;
        
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        System.out.printf("El precio final del producto es: %.2f%n", precioFinal);
    }
    
    // Método para calcular el precio final
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
        
    }

}
