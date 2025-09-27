/*Enunciado
3. Encapsulamiento con la Clase Libro 
a. Crear una clase Libro con atributos privados: titulo, autor, 
añoPublicacion. 
Métodos requeridos: Getters para todos los atributos. Setter con validación 
para añoPublicacion. 
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con 
uno válido, mostrar la información final. 
*/
package ejercicio03;

public class Libro {

 private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {                
        if (anioPublicacion > 0) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Año de publicacion invalido. Debe ser un año positivo.");
        }
    }

    public String getDescripcion() {
        return "Titulo: " + getTitulo() + ", Autor: " + getAutor() + ", Año de Publicacion: " + getAnioPublicacion();
     
        
    }

}
