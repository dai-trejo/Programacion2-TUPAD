/*Enunciado:
2. Registro de Mascotas 
a. Crear una clase Mascota con los atributos: nombre, especie, edad. 
Métodos requeridos: mostrarInfo(), cumplirAnios(). 
Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y 
verificar los cambios.
*/
package ejercicio02;

public class Mascota {
   
    private String nombre;
    private String especie;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    //En vez de llamarla mostrarInfo(), la llamamos getInformacionCompleta()
    public String getInformacionCompleta() {
        return "Nombre: " + getNombre() +
               ", Especie: " + getEspecie() +
               ", Edad: " + getEdad();
    }
    public void setInformacionCompleta(String nombre, String especie, int edad) {
        setNombre(nombre);
        setEspecie(especie);
        setEdad(edad);
    }

    public void cumplirAnios() {
        this.edad += 1;
    }

}
