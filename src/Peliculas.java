public class Peliculas {
    private String nombre;
    private boolean visualizado;
    private int rating;
    private int sala;
    private double precio;

    public Peliculas(String nombre, int rating, int sala, double precio, boolean visualizado){
        this.nombre=nombre;
        this.rating=rating;
        this.precio=precio;
        this.sala=sala;
        this.visualizado=visualizado;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isVisualizado() {
        return visualizado;
    }

    public int getRating() {
        return rating;
    }

    public int getSala() {
        return sala;
    }

    public double getPrecio() {
        return precio;
    }
    
}
