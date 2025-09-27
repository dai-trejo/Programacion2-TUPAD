
package ejercicio01;
public class Principal {


    public static void main(String[] args) {
         Estudiante estudiante = new Estudiante();
        estudiante.setInformacionCompleta("Daiana", "Trejo", "A", 0);
        System.out.println(estudiante.getInformacionCompleta());
        estudiante.subirCalificacion(7.8);
        System.out.println("Despues de subir la calificacion:");
        System.out.println(estudiante.getInformacionCompleta());
        estudiante.bajarCalificacion(2.3);
        System.out.println("Despues de bajar la calificacion:");
        System.out.println(estudiante.getInformacionCompleta());
        estudiante.bajarCalificacion(10.0); // Intento de bajar más allá de 0
        System.out.println("Despues de intentar bajar la calificacion mas alla de 0:");
        System.out.println(estudiante.getInformacionCompleta());
        estudiante.subirCalificacion(15.0); // Intento de subir más allá de 10
        System.out.println("Despues de intentar subir la calificacion más alla de 10:");
        System.out.println(estudiante.getInformacionCompleta());
        estudiante.subirCalificacion(4.5); // Subir dentro del rango
        System.out.println("Despues de subir la calificacion dentro del rango:");
        System.out.println(estudiante.getInformacionCompleta());
        
        
    }

}
