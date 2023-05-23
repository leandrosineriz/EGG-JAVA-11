/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author itsmi
 */
public class Simulador {
    public ArrayList<Alumno> CrearAlumnosRandom(int cant) {
        ArrayList<Alumno> retorno = new ArrayList();
        for (int i = 0; i < cant; i++) {
            String nombre = this.GeneradorNombreRandom();
            int dni = this.GeneradorDniRandom();
            while (!this.ValidarDni(retorno, dni)) {                
                dni = this.GeneradorDniRandom();
            }
            retorno.add(new Alumno(nombre, dni, 0));
        }
        return retorno;
    }
    
    public int GeneradorDniRandom() {
        int multiplicador = 1;
        int dni = 0;
        
        for (int i = 0; i < 8; i++) {
            int num = (int) (Math.random() * 9 + 1);
            while (i == 7 && num>4) { 
                num = (int) (Math.random() * 9 + 1);
            }
            dni += num * multiplicador;
            multiplicador*=10;
        }
        return dni;
    }
    
    public String GeneradorNombreRandom() {
        String[] nombres = {"Pepe", "Jose", "Leandro", "Lionel", "Debora", "Camila", "Luna", 
            "Sabrina", "Oriana", "Josefa", "Kafka", "Natasha"};
        String[] apellidos = {"Fernandez", "Gomes", "Sineriz", "Messi", "Zidane", "Bochini", "DiMaria", "DePaul"};
        String nombre = nombres[(int) (Math.random() * nombres.length)] + " " + 
                apellidos[(int) (Math.random() * apellidos.length)];
        return nombre;
    }
    
    public boolean ValidarDni(ArrayList<Alumno> alumnos, int dni) {
        /**
         * retorna false si no es valido sino true;
         */
        boolean retorno = true;
        for (Alumno a : alumnos) {
            if (a.getDni() == dni) {
                retorno = false;
                break;
            }
        }
        return retorno;
    }
    
    public void MostrarAlumnos(ArrayList<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    
    public void MostrarVotos(ArrayList<Voto> alumnos) {
        for (Voto alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    
    public ArrayList<Voto> Votar(ArrayList<Alumno> alumnos) {
        ArrayList<Voto> votantes = new ArrayList();
        HashSet<Alumno> votos;
        Alumno votado = null;
        boolean continuar = true;
        for (Alumno a : alumnos) {
            votos = new HashSet();
            for (int i = 0; i < 3; i++) {
                while (continuar) {                    
                    votado = alumnos.get((int) (Math.random() * alumnos.size()));
                    if (a.equals(votado)) {
//                        System.out.println(a + " - " + votado);
                        continue;
                    }
                    if (votos.add(votado)) {
                        continuar = false;
                    }
                }
                continuar = true;
                votado.setCantVotosRecibidos(votado.getCantVotosRecibidos()+1);
            }
            votantes.add(new Voto(a, votos));
        }
        return votantes;
    }
    
    public ArrayList<Alumno> RecuentoVotos(ArrayList<Voto> alumnos){
        ArrayList<Voto> aux = (ArrayList<Voto>)alumnos.clone();
        aux.sort(Voto.comprarAlumno);
        ArrayList<Alumno> retorno = new ArrayList();
        for (int i = 0; i < 10; i++) {
            retorno.add(aux.get(i).getAlumno());
        }
        return retorno;
    }
}
