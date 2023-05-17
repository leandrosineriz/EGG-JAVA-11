/*
 * • barajar(): cambia de posición todas las cartas aleatoriamente.
 * • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
 * se haya llegado al final, se indica al usuario que no hay más cartas.
 * • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
 * • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
 * cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
 * debemos indicárselo al usuario.
 * • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
 * indicárselo al usuario
 * • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
 * luego se llama al método, este no mostrara esa primera carta.
 */
package Class;

import Enum.Palo;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author itsmi
 */
public class Baraja {
    private ArrayList<Carta> mazo;
    private ArrayList<Carta> monton;

    public Baraja() {
        this.mazo = new ArrayList();
        this.monton = new ArrayList();
        for(Palo p : Palo.values()){
            for (int j = 1; j <= 12; j++) {
                if (!(j == 8 || j == 9)) {
                    this.mazo.add(new Carta(j, p));
                }
            }
        }
    }
    
    public void MostrarBaraja(){
        System.out.println("MAZO:");
        for(Carta c : this.mazo){
            System.out.println(c);
        }
    }
    
    public void MostrarMonton(){
        System.out.println("MONTON:");
        for(Carta c : this.monton){
            System.out.println(c);
        }
    }
    
    public void Barajar(){
        Collections.shuffle(this.mazo);
    }
    
    public Carta SiguienteCarta(){
        Carta retorno = null;
        if (this.mazo.size()>0) {
            /*System.out.println("La siguiente carta es "+this.mazo.get(0));*/
            retorno = this.mazo.remove(0);
            this.monton.add(retorno);
        }
        return retorno;
    }
    
    public int CartasDisponibles(){
        /*System.out.println("Quedan " + this.mazo.size() + " cartas en el mazo.");*/
        return this.mazo.size();
    }
    
    public void DarCartas(int cant){
        if (this.mazo.size()>=cant) {
            for (int i = 0; i < cant; i++) {
               System.out.println("Sacaste " + this.SiguienteCarta());
            }
            
        } else {
            System.out.println("No hay suficientes cartas para sacar. Quedan: "+this.CartasDisponibles());
        }
        
    }
}
