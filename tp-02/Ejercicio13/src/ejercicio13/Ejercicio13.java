/*Enunciado:
13.  Impresión recursiva de arrays antes y después de modificar un elemento. 
Crea un programa que: 
a. Declare e inicialice un array con los precios de algunos productos. 
b. Use una función recursiva para mostrar los precios originales. 
c. Modifique el precio de un producto específico. 
d. Use otra función recursiva para mostrar los valores modificados. 
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
✔ Recorrido del array con una función recursiva en lugar de un bucle. 
✔ Modificación de un valor en un array mediante un índice. 
✔ Uso de un índice como parámetro en la recursión para recorrer el 
array. 

*/
package ejercicio13;

public class Ejercicio13 {

    public static void main(String[] args) {
           //a. Declare e inicialice un array con los precios de algunos productos.
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        //b. Use una función recursiva para mostrar los precios originales.
        System.out.println("Precios originales:");
        mostrarPreciosOriginalesRecursivo(precios, 0);
        
        //c. Modifique el precio de un producto específico.
        int indiceProducto = 2; // Tercer producto (índice 2)
        precios[indiceProducto] = 129.99; // Modificando el precio de $149.75 a $129.99
        
        //d. Use otra función recursiva para mostrar los valores modificados.
        System.out.println("Precios modificados:");
        mostrarPreciosModificadosRecursivo(precios, 0);
    }
    
    public static void mostrarPreciosOriginalesRecursivo(double[] precios, int indice) {
        //Caso base: si el índice es mayor o igual a la longitud del array, terminar
        if (indice >= precios.length) {
            return;
        }
        
        //Mostrar el precio actual con formato específico
        System.out.printf("Precio: $%.1f%n", precios[indice]);
        
        //Llamada recursiva con el siguiente índice
        mostrarPreciosOriginalesRecursivo(precios, indice + 1);
    }
    
    public static void mostrarPreciosModificadosRecursivo(double[] precios, int indice) {
        //Caso base: si el índice es mayor o igual a la longitud del array, terminar
        if (indice >= precios.length) {
            return;
        }
        
        //Mostrar el precio actual con formato específico
        System.out.printf("Precio: $%.2f%n", precios[indice]);
        
        //Llamada recursiva con el siguiente índice
        mostrarPreciosModificadosRecursivo(precios, indice + 1);
    }

}
