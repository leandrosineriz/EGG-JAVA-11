/*
 * Perro, que tendrá como atributos: nombre, raza, edad y tamaño;
 */
package Class;

/**
 *
 * @author itsmi
 */
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private float tamanio;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, float tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getTamaño() {
        return tamanio;
    }

    public void setTamaño(float tamaño) {
        this.tamanio = tamaño;
    }

    @Override
    public String toString() {
        return "\n{"+"nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio+"}";
    }
    
    
    
}
