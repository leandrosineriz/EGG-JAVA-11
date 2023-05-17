/*
 * Persona con
 * atributos: nombre, apellido, edad, documento y Perro.
 */
package Class;

import java.util.ArrayList;

/**
 *
 * @author itsmi
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private int documento;
    private ArrayList<Perro> perros;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perros = new ArrayList();
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void AddPerro(Perro p){
        this.perros.add(p);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
    
    
}
