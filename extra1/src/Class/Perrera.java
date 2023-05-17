/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class Perrera {
    ArrayList<Perro> perrosDisponibles;
    ArrayList<Perro> perrosPendientesAdopcion; 
    ArrayList<Perro> perrosAdoptados;

    public Perrera() {
        this.perrosAdoptados = new ArrayList();
        this.perrosPendientesAdopcion = new ArrayList();
        this.perrosDisponibles = new ArrayList();
    }

    public Perrera(ArrayList<Perro> perrosDisponibles) {
        this.perrosAdoptados = new ArrayList();
        this.perrosPendientesAdopcion = new ArrayList();
        this.perrosDisponibles = perrosDisponibles;
    }
    
    public void ReservarPerro(Persona persona1){
        if (!this.perrosDisponibles.isEmpty()) {
            System.out.println("Elija un perro de la lista de perros disponibles(0 para salir):");
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            int x = 1;
            for(Perro p : this.perrosDisponibles){
                System.out.println(x+" "+p);
                x+=1;
            }
            Perro pAux = this.perrosDisponibles.get(leer.nextInt()-1);

            if (!this.perrosPendientesAdopcion.contains(pAux)) {
                this.perrosPendientesAdopcion.add(pAux);
                persona1.AddPerro(pAux);
                pAux.setDueño(persona1);
                System.out.println(persona1.getNombre()+ " reservo a " + pAux.getNombre());
            } else {
                System.out.println("El perro ya fue solicitado por otra persona.");
            }
        } else {
            System.out.println("No hay perros que disponibles.");
        }
        
        
        
    }
    
    public boolean RetirarPerro(Persona p1){
        boolean retorno = false;
        Iterator<Perro> iter = this.perrosPendientesAdopcion.iterator();
        while(iter.hasNext()){
            Perro p = iter.next();
            if (p.getDueño().equals(p1)) {
                System.out.print(p1.getNombre()+" ah retirado al perro: ");
                System.out.println(p);
                this.perrosDisponibles.remove(p);
                //this.perrosPendientesAdopcion.remove(p);
                this.perrosAdoptados.add(p);
                iter.remove();
                retorno = true;
            }
        }
        if (!retorno) {
            System.out.println("La persona no tiene perros que retirar");
        }
        return retorno;
    }
    
    public void MostrarPerrosDisponibles(){
        for(Perro p : this.perrosDisponibles){
            System.out.println(p);
        }
    }
    public void MostrarPerrosPendientes(){
        for(Perro p : this.perrosPendientesAdopcion){
            System.out.println(p);
        }
    }
    public void MostrarPerrosAdoptados(){
        for(Perro p : this.perrosAdoptados){
            System.out.println(p);
        }
    }
}
