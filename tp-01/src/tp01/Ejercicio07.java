/*Enunciado:
7. Analiza el siguiente código y responde: ¿Cuáles son expresiones y cuáles son 
instrucciones? Explica la diferencia en un breve párrafo.  
int x = 10; // Línea 1  
x = x + 5; // Línea 2  
System.out.println(x); // Línea 3 
*/
package tp01;

public class Ejercicio07 {
    public static void main(String[] args) {
        int x = 10; // Línea 1
        x = x + 5; // Línea 2
        System.out.println(x); // Línea 3
        
        /* 
        Expresiones:
        - "10" (Línea 1): valor literal
        - "x + 5" (Línea 2): operación aritmética que evalúa a 15
        - "x" (Línea 3): variable que evalúa a 15
        
        Instrucciones:
        - "int x = 10;" (Línea 1): declaración e inicialización de variable
        - "x = x + 5;" (Línea 2): asignación
        - "System.out.println(x);" (Línea 3): llamada a método
        
        Diferencia: Las expresiones son fragmentos de código que evalúan 
        a un valor, mientras que las instrucciones son comandos completos 
        que realizan una acción específica.
        */
    }
}
