/*
 * De Cine nos interesa conocer la película que se está reproduciendo, la
 * sala con los espectadores y el precio de la entrada.
 */
package Class;

import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class Cine {
    Pelicula pelicula;
    Sala sala;
    float precioEntrada;

    public Cine() {
        this.pelicula = new Pelicula();
        this.sala = new Sala();
        this.precioEntrada = 0;
    }

    public Cine(Pelicula pelicula, Sala sala, float precioEntrada) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
    }
    
    public boolean comprarEntrada(Espectador e) {
        if (e.getEdad()<this.pelicula.getEdadMin()) {
            System.out.println("No puede ver la pelicula por que es menor de edad.");
            return false;
        }
        if (e.getDineroDisp()<this.precioEntrada) {
            System.out.println("No posee el dinero suficiente para comprar el boleto");
            return false;
        }
        if (!sala.hayLibres()) {
            System.out.println("No hay asientos disponibles.");
            return false;
        }
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        sala.MostrarSala();
        System.out.println("\nIngrese el numero de asiento que desea:");
        String opc = leer.next();
        while (!sala.isLibre(opc)) {
            System.out.println("El asiento esta ocupado puede elegir alguna de las siguientes opciones:");
            sala.mostrarLibres();
            opc = leer.next();
        }
        sala.asignarAsiento(opc, e);
        System.out.println("Se le asigno el asiento correctamente.");
        e.setDineroDisp(e.getDineroDisp()-precioEntrada);
        return true;
    }
}
