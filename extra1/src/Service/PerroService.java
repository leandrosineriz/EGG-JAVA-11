/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Class.Perro;
import java.util.ArrayList;

/**
 *
 * @author itsmi
 */
public class PerroService {
    public static ArrayList<Perro> CrearPerros(){
        ArrayList<Perro> auxPerros = new ArrayList();
        auxPerros.add(new Perro("Rocky", "Dalmata", 2, 50));
        auxPerros.add(new Perro("Luna", "Boxer", 3, 60));
        auxPerros.add(new Perro("Camila", "Sharpei", 5, 20));
        auxPerros.add(new Perro("Loqui", "Aleman", 7, 40));
        return auxPerros;
    }
}
