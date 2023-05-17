/*
 * Por último, del espectador, nos interesa saber su
 * nombre, edad y el dinero que tiene disponible.
 */
package Class;

/**
 *
 * @author itsmi
 */
public class Espectador {
    private String nombre;
    private int edad;
    private float dineroDisp;
    private String asiento;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, float dineroDisp) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisp = dineroDisp;
    }

    public float getDineroDisp() {
        return dineroDisp;
    }

    public void setDineroDisp(float dineroDisp) {
        this.dineroDisp = dineroDisp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDisp=" + dineroDisp + ", asiento=" + asiento + '}';
    }
    
    
}
