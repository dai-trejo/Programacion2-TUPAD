
package ejercicio03;

public class Principal {
 public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setTitulo("El juego de la vida y como jugarlo");
        libro.setAutor("Florence Scovel Shinn");
        libro.setAnioPublicacion(2019);        
        System.out.println(libro.getDescripcion());
        libro.setAnioPublicacion(-5); // Prueba de validación
        System.out.println(libro.getDescripcion());
}
}
