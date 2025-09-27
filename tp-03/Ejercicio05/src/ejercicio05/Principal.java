
package ejercicio05;

public class Principal {
    public static void main(String[] args) {        
        NaveEspacial nave1 = new NaveEspacial();
        nave1.setInformacionCompleta("Princesa", 500);
        nave1.mostrarEstado();
        
        nave1.despegar();
        nave1.mostrarEstado();
        
        nave1.avanzar(200);
        nave1.mostrarEstado();
        
        nave1.recargarCombustible(300);
        nave1.mostrarEstado();
        
        nave1.avanzar(13556); // Intento de avanzar más allá del combustible disponible
        nave1.mostrarEstado();
        
        nave1.recargarCombustible(6000); // Intento de recargar más allá del límite
        nave1.mostrarEstado();

}
}

