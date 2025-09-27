/*Enunciado:
1. Registro de Estudiantes 
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, 
calificación. 
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), 
bajarCalificacion(puntos). 
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir 
calificaciones.
*/

package ejercicio01;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    //En vez de llamarla mostrarInfo(), la llamamos getInformacionCompleta()
    public String getInformacionCompleta() {
        return "Nombre: " + getNombre() +
               ", Apellido: " + getApellido() +
               ", Curso: " + getCurso() +
               ", Calificacion: " + getCalificacion();
    }
    
    public void setInformacionCompleta(String nombre, String apellido, String curso, double calificacion) {
        setNombre(nombre);
        setApellido(apellido);
        setCurso(curso);
        setCalificacion(calificacion);
    }

    public void subirCalificacion(double puntos) {     
        if (calificacion + puntos <= 10) {
            calificacion += puntos;
        } else {
            System.out.println("La calificacion no puede superar 10.");
        }    
    }

    public void bajarCalificacion(double puntos) {
        if (calificacion - puntos >= 0) {
            calificacion -= puntos;
        } else {
            System.out.println("La calificacion no puede ser menor que 0.");
}
    }
}

