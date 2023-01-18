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
}
