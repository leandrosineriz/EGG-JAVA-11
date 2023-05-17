/*
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
 * Revolver
 * Métodos:
 * • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores y el revolver para
 * guardarlos en los atributos del juego.
 *
 * • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el gatillo. Sí el
 * revolver tira el agua el jugador se moja y se termina el juego, sino se moja, se pasa al siguiente jugador hasta que
 * uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó. Pensar la
 * lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Service;

import Class.Jugador;
import Class.Revolver;
import java.util.ArrayList;

/**
 *
 * @author itsmi
 */
public class Juego {
    ArrayList<Jugador> jugadores;
    Revolver r;

    public Juego() {
    }
    
    public void LlenarJuego(ArrayList<Jugador> jugadores, Revolver r){
        this.jugadores = jugadores;
        this.r = r;
    }
    
    public boolean Ronda(){
        for(Jugador j : jugadores){
            System.out.println("Turno del "+j.getNombre());
            if (j.Disparo(r)) {
                System.out.println("DISPARO! el "+j.getNombre()+" perdio!");
                return true;
            }
            System.out.println("Safo!");
            System.out.println("----------------------------");
        }
        return false;
    }
    
}
