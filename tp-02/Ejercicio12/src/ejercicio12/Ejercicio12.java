/*Enunciado:
12.  Modificación de un array de precios y visualización de resultados.  
Crea un programa que: 
a. Declare e inicialice un array con los precios de algunos productos. 
b. Muestre los valores originales de los precios. 
c. Modifique el precio de un producto específico. 
d. Muestre los valores modificados. 
Salida esperada: 
Precios originales: 
Precio: $199.99 
Precio: $299.5 
Precio: $149.75 
Precio: $399.0 
Precio: $89.99 
Precios modificados: 
Precio: $199.99 
Precio: $299.5 
Precio: $129.99 
Precio: $399.0 
Precio: $89.99 
Conceptos Clave Aplicados: 
✔ Uso de arrays (double[]) para almacenar valores. 
✔ Recorrido del array con for-each para mostrar valores. 
✔ Modificación de un valor en un array mediante un índice. 
✔ Reimpresión del array después de la modificación. 
*/
package ejercicio12;
public class Ejercicio12 {

    public static void main(String[] args) {
        //Uso de arrays (double[]) para almacenar valores
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};
        
        //Recorrido del array con for-each para mostrar valores
        System.out.println("Precios originales:");
        mostrarPreciosForEach(precios);
        
        //Modificación de un valor en un array mediante un índice
        int indiceProducto = 2; // Tercer producto (índice 2)
        System.out.printf("%nModificando precio en índice %d...%n", indiceProducto);
        System.out.printf("Precio anterior: $%.2f%n", precios[indiceProducto]);
        precios[indiceProducto] = 129.99; // Modificando el precio
        System.out.printf("Precio nuevo: $%.2f%n", precios[indiceProducto]);
        
        //Reimpresión del array después de la modificación
        System.out.println("\nPrecios modificados:");
        mostrarPreciosForEach(precios);
    }        
 
    public static void mostrarPreciosForEach(double[] precios) {
        for (double precio : precios) {
            System.out.printf("Precio: $%.2f%n", precio);
    
    }

}
}