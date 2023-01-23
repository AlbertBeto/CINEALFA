public class Pelicula {
    private String nombre;
    private boolean visualizado;
    private int rating;
    private int sala;
    private double precio;

    public Pelicula(String[] parametros){
        this.nombre=parametros[0];
        this.rating=Integer.parseInt(parametros[1]);
        this.precio=Double.parseDouble(parametros[3]);
        this.sala=Integer.parseInt(parametros[2]);
        if (Integer.parseInt(parametros[4]) == 1){
            this.visualizado=true;
        }else{
            this.visualizado=false;
        }
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
