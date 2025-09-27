
package ejercicio04;

public class Principal {
 public static void main(String[] args) {
        Gallina gallina1 = new Gallina();
        gallina1.setInformacionCompleta(1,2 ,0 );
        System.out.println("Gallina 1");
        System.out.println(gallina1.getDescripcion());
        gallina1.ponerHuevo();
        gallina1.setEdad(3);
        gallina1.ponerHuevo();
        System.out.println(gallina1.getDescripcion());
        System.out.println("Gallina 2");
        Gallina gallina2 = new Gallina();
        gallina2.setInformacionCompleta(2, 1, 0);
        System.out.println(gallina2.getDescripcion());
        gallina2.ponerHuevo();
        gallina2.setEdad(0);
        gallina2.ponerHuevo();
        System.out.println(gallina2.getDescripcion());
        gallina2.setHuevosPuestos(-5); // Intento de establecer un valor
        gallina2.setEdad(-1); // Intento de establecer un valor inválido
        System.out.println("Gallina 2 despues de intentos invalidos:");
        System.out.println(gallina2.getDescripcion());
}
}
