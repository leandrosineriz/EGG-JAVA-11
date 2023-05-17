/*
 * Luego, de las películas nos interesa saber
 * el título, duración, edad mínima y director.
 */
package Class;

/**
 *
 * @author itsmi
 */
public class Pelicula {
    private String titulo;
    private float duracion;
    private int edadMin;
    private String director;

    public Pelicula() {
    }
    
    public Pelicula(String titulo, float duracion, int edadMin, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMin = edadMin;
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }
    
}
