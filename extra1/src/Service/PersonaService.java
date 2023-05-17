/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Class.Persona;
import java.util.ArrayList;

/**
 *
 * @author itsmi
 */
public class PersonaService {
    public static ArrayList<Persona> CrearPersonas(){
        ArrayList<Persona> auxPersonas = new ArrayList();
        auxPersonas.add(new Persona("Pepe", "Argento", 50, 38764267));
        auxPersonas.add(new Persona("Jose", "Arriaga", 23, 18234237));
        return auxPersonas;
    }
    
    public static void MostrarPersonas(ArrayList<Persona> personas){
        for(Persona p : personas){
            System.out.println(p);
        }
    }
    
    public static void MostrarPersonasConIndex(ArrayList<Persona> personas){
        int x = 1;
        for(Persona p : personas){
            System.out.println(x+" "+p);
            x+=1;
        }
    }
}
