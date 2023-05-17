/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1;

import Class.Perrera;
import Class.Persona;
import Service.PerroService;
import Service.PersonaService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author itsmi
 */
public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona> personas = PersonaService.CrearPersonas();
        Perrera perrera = new Perrera(PerroService.CrearPerros());
        
        while (true) {            
            System.out.println("\nPERRERA");
            System.out.println("1. Ver personas");
            System.out.println("2. Ver perros disponibles");
            System.out.println("3. Reservar Perro");
            System.out.println("4. Retirar Perro");
            System.out.println("5. Mostrar perros pendientes");
            System.out.println("6. Adoptar perros ad2optados");
            
            int opc = leer.nextInt();
            
            switch (opc) {
                case 1:
                    PersonaService.MostrarPersonas(personas);
                    break;
                case 2:
                    perrera.MostrarPerrosDisponibles();
                    break;
                case 3:
                    System.out.println("Seleccione a la persona que desea reservar al perro:");
                    PersonaService.MostrarPersonasConIndex(personas);
                    int opc2 = leer.nextInt();
                    perrera.ReservarPerro(personas.get(opc2-1));
                    break;
                case 4:
                    System.out.println("Seleccione a la persona que desea retirar al perro:");
                    PersonaService.MostrarPersonasConIndex(personas);
                    opc2 = leer.nextInt();
                    perrera.RetirarPerro(personas.get(opc2-1));
                    break;
                case 5:
                    perrera.MostrarPerrosPendientes();
                    break;
                case 6:
                    perrera.MostrarPerrosAdoptados();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }
    
}
