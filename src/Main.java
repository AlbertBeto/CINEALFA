public class Main {

    public static void main(String[] args) {
        Pelicula[] peliculas = LectorExterno.lector();
        for (int i = 0; i < peliculas.length; i++) {
            peliculas[i].print();
            System.out.println();
        }
        RatingSort.sort(peliculas);
        System.out.println();
        System.out.println();
        for (int i = 0; i < peliculas.length; i++) {
            peliculas[i].print();
            System.out.println();
        }
        SalaSort.sort(peliculas);
        System.out.println();
        System.out.println();
        for (int i = 0; i < peliculas.length; i++) {
            peliculas[i].print();
            System.out.println();
        }

        AlphabeticSort.sort(peliculas);
        System.out.println();
        System.out.println();
        for (int i = 0; i < peliculas.length; i++) {
            peliculas[i].print();
            System.out.println();
        }

        PriceSort.sort(peliculas);
        System.out.println();
        System.out.println();
        for (int i = 0; i < peliculas.length; i++) {
            peliculas[i].print();
            System.out.println();
        }



    }
}
