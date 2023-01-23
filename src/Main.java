public class Main {

    public static void main(String[] args) {
        Pelicula[] peliculas = LectorExterno.lector();
        System.out.println(peliculas[0].getNombre());

    }
}
