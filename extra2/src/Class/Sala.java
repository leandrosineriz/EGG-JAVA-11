/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.ArrayList;

/**
 *
 * @author itsmi
 */
public class Sala {
    ArrayList<Espectador> espectadores;
    String[][] asientos;
    String[][] disponibles;

    public Sala() {
        String[] letras = {"A", "B", "C","D","E","F"};
        this.asientos = new String[8][6];
        this.disponibles = new String[8][6];
        for (int i = 1; i <= 8; i++) {
            for (int j = 0; j < 6; j++) {
               asientos[i-1][j] = letras[j]+""+i;
               this.disponibles[i-1][j] = " ";
            }
        }
    }

    public Sala(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
        
        String[] letras = {"A", "B", "C","D","E","F"};
        this.asientos = new String[8][6];
        this.disponibles = new String[8][6];
        for (int i = 1; i <= 8; i++) {
            for (int j = 0; j < 6; j++) {
               asientos[i-1][j] = letras[j]+""+i;
               this.disponibles[i-1][j] = " ";
            }
        }
        
        for (Espectador e : espectadores) {
            int x = (int) (Math.random() * 8);
            int i = (int) (Math.random() * 6);
            if (!this.hayLibres()) {
                break;
            }
            while (this.disponibles[x][i].equals("X")) {
                x = (int) (Math.random() * 8);
                i = (int) (Math.random() * 6);
            }
            this.disponibles[x][i] = "X";
            e.setAsiento(this.asientos[x][i]);
        }
    }
    
    public void MostrarSala(){
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(this.asientos[i][j]+this.disponibles[i][j]+" | ");
            }
            System.out.println("");
        }
    }
    
    public boolean isLibre(String buscar){
        boolean retorno = false;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (this.asientos[i][j].equals(buscar)) {
                    if (this.disponibles[i][j].equals(" ")) {
                        retorno = true;
                    }
                }
            }
            
        }
        return retorno;
    }
    
    public void asignarAsiento(String asiento, Espectador esp){
        boolean retorno = false;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (this.asientos[i][j].equals(asiento)) {
                    this.disponibles[i][j] = "X";
                    esp.setAsiento(this.asientos[i][j]);
                }
            }
        }
    }
    
    public void mostrarLibres(){
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (this.disponibles[i][j].equals(" ")) {
                    System.out.print(this.asientos[i][j]+" - ");
                }
            }
        }
        System.out.println("");
    }
    
    public boolean hayLibres(){
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (this.disponibles[i][j].equals(" ")) {
                    return true;
                }
            }
        }
        return false;
    }
}
