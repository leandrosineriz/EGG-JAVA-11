/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author itsmi
 */
public class Alumno {
    private String nombreCompleto;
    private int dni;
    private int cantVotosRecibidos;

    public Alumno(String nombreCompleto, int dni, int cantVotosRecibidos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantVotosRecibidos = cantVotosRecibidos;
    }

    public int getCantVotosRecibidos() {
        return cantVotosRecibidos;
    }

    public void setCantVotosRecibidos(int cantVotosRecibidos) {
        this.cantVotosRecibidos = cantVotosRecibidos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return nombreCompleto + ": " + cantVotosRecibidos + " votos";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }

    
    
    
}
