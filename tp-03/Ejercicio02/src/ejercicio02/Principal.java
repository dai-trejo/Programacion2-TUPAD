
package ejercicio02;

public class Principal {
public static void main(String[] args) {
        Mascota mascota = new Mascota();
        mascota.setNombre("Luna");
        mascota.setEspecie("Perro");
        mascota.setEdad(7);

        System.out.println(mascota.getInformacionCompleta());

        mascota.cumplirAnios();
        System.out.println("Despues de cumplir años:");
        System.out.println(mascota.getInformacionCompleta());
}
}
