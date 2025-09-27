/*Enunciado
5. Simulación de Nave Espacial 
Crear una clase NaveEspacial con los atributos: nombre, combustible. 
Métodos requeridos: despegar(), avanzar(distancia), 
recargarCombustible(cantidad), mostrarEstado(). 
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que 
se supere el límite al recargar. 
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin 
recargar, luego recargar y avanzar correctamente. Mostrar el estado al final. 
*/
package ejercicio05;
public class NaveEspacial {
    private String nombre;
    private double combustible;
    private final double LIMITE_COMBUSTIBLE = 1000.0; // Límite máximo de combustible    

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        if (combustible >= 0 && combustible <= LIMITE_COMBUSTIBLE) {
            this.combustible = combustible;
        } else {
            System.out.println("Cantidad de combustible invalida. Debe estar entre 0 y " + LIMITE_COMBUSTIBLE);
        }
    }

    public void despegar() {
        if (combustible >= 50) { // Suponiendo que despegar consume 50 unidades de combustible
            combustible -= 50;
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(double distancia) {
        double consumo = distancia * 0.5; // Suponiendo que avanzar consume 0.5 unidades de combustible por unidad de distancia
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar esa distancia [" + distancia + "] unidades.");
        }
    }

    public void recargarCombustible(double cantidad) {
        if (cantidad > 0) {
            if (combustible + cantidad <= LIMITE_COMBUSTIBLE) {
                combustible += cantidad;
                System.out.println(nombre + " ha recargado " + cantidad + " unidades de combustible.");
            } else {
                System.out.println("No se puede recargar esa cantidad. Supera el limite de " + LIMITE_COMBUSTIBLE);
            }
        } else {
            System.out.println("La cantidad a recargar debe ser positiva.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + ", Combustible: " + combustible + "/" + LIMITE_COMBUSTIBLE);
    }
    public void setInformacionCompleta(String nombre, double combustible) {
        setNombre(nombre);
        setCombustible(combustible);
     
        
        
    }

}
