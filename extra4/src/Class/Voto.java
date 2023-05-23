/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.Comparator;
import java.util.HashSet;

/**
 *
 * @author itsmi
 */
public class Voto {
    private Alumno alumno;
    private HashSet<Alumno> votos;

    public Voto(Alumno alumno, HashSet<Alumno> votos) {
        this.alumno = alumno;
        this.votos = votos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public HashSet<Alumno> getVotos() {
        return votos;
    }

    public void setVotos(HashSet<Alumno> votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return alumno + ", votos=" + votos;
    }
    
    public static Comparator<Voto> comprarAlumno = (Voto v1, Voto v2) -> {
        int retorno;
        if (v1.getAlumno().getCantVotosRecibidos() == v2.getAlumno().getCantVotosRecibidos()) {
            retorno = 0;
        } else if (v1.getAlumno().getCantVotosRecibidos() < v2.getAlumno().getCantVotosRecibidos()) {
            retorno = 1;
        } else {
            retorno = -1;
        }
        return retorno;
    };
    
    
}
