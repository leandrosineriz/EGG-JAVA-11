/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
 * clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
 * atributos: nombre, apellido, edad, documento y Perro.
 * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
 * pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
 * la clase Persona, la información del Perro y de la Persona.
 */
package ej1;

import Class.Perro;
import Class.Persona;
import Service.PersonaService;

/**
 *
 * @author itsmi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perro1 = new Perro("Pepe", "Boxer", 2, 30);
        Perro perro2 = new Perro("Choni", "Dalmata", 7, 60);
        Persona pers1 = new Persona("Jose", "Perez", 27, 38765273);
        Persona pers2 = new Persona("Josefa", "Domiguez", 12, 12426212);
        PersonaService pserv = new PersonaService();
        
        pserv.AddPerro(pers1, perro1);
        pserv.AddPerro(pers1, perro2);
        pserv.AddPerro(pers2, perro2);
        
        System.out.println(pers1);
        System.out.println(pers2);
    }

}
