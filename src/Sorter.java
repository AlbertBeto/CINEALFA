public class Sorter {
    private Sorter() {
    }

    public static void priceSortDesc(Pelicula[] cartelera) {
        int n = cartelera.length;
        Pelicula temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (cartelera[j - 1].getPrecio() > cartelera[j].getPrecio()) {
                    //swap elements
                    temp = cartelera[j - 1];
                    cartelera[j - 1] = cartelera[j];
                    cartelera[j] = temp;
                }

            }
        }
    }

    public static void priceSortAsc(Pelicula[] cartelera) {
        int n = cartelera.length;
        Pelicula temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (cartelera[j - 1].getPrecio() < cartelera[j].getPrecio()) {
                    //swap elements
                    temp = cartelera[j - 1];
                    cartelera[j - 1] = cartelera[j];
                    cartelera[j] = temp;
                }

            }
        }
    }

    public static void alphaSortDesc(Pelicula[] cartelera) {
        int n = cartelera.length;
        Pelicula temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if( (int)cartelera[j-1].getNombre().toUpperCase().charAt(0) > (int)cartelera[j].getNombre().toUpperCase().charAt(0)){
                    //swap elements
                    temp = cartelera[j-1];
                    cartelera[j-1] = cartelera[j];
                    cartelera[j] = temp;
                }

            }
        }
    }

    public static void alphaSortAsc(Pelicula[] cartelera) {
        int n = cartelera.length;
        Pelicula temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if( (int)cartelera[j-1].getNombre().toUpperCase().charAt(0) < (int)cartelera[j].getNombre().toUpperCase().charAt(0)){
                    //swap elements
                    temp = cartelera[j-1];
                    cartelera[j-1] = cartelera[j];
                    cartelera[j] = temp;
                }

            }
        }
    }

    public static void salaSortDesc(Pelicula[] cartelera) {
        int n = cartelera.length;
        Pelicula temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(cartelera[j-1].getSala() > cartelera[j].getSala()){
                    //swap elements
                    temp = cartelera[j-1];
                    cartelera[j-1] = cartelera[j];
                    cartelera[j] = temp;
                }

            }
        }
    }
    public static void salaSortAsc(Pelicula[] cartelera) {
        int n = cartelera.length;
        Pelicula temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(cartelera[j-1].getSala() < cartelera[j].getSala()){
                    //swap elements
                    temp = cartelera[j-1];
                    cartelera[j-1] = cartelera[j];
                    cartelera[j] = temp;
                }

            }
        }
    }

    public static void ratingSortDesc(Pelicula[] cartelera) {
        int n = cartelera.length;
        Pelicula temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(cartelera[j-1].getRating() > cartelera[j].getRating()){
                    //swap elements
                    temp = cartelera[j-1];
                    cartelera[j-1] = cartelera[j];
                    cartelera[j] = temp;
                }

            }
        }
    }

    public static void ratingSortAsc(Pelicula[] cartelera) {
        int n = cartelera.length;
        Pelicula temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(cartelera[j-1].getRating() > cartelera[j].getRating()){
                    //swap elements
                    temp = cartelera[j-1];
                    cartelera[j-1] = cartelera[j];
                    cartelera[j] = temp;
                }
            }
        }
    }
    public static void visuSortAsc(Pelicula[] cartelera) {
        int n = cartelera.length;
        Pelicula temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(cartelera[j - 1].isVisualizado() && !cartelera[j].isVisualizado()){
                    //swap elements
                    temp = cartelera[j-1];
                    cartelera[j-1] = cartelera[j];
                    cartelera[j] = temp;
                }
            }
        }
    }
    public static void visuSortDesc(Pelicula[] cartelera) {
        int n = cartelera.length;
        Pelicula temp;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(!cartelera[j - 1].isVisualizado() && cartelera[j].isVisualizado()){
                    //swap elements
                    temp = cartelera[j-1];
                    cartelera[j-1] = cartelera[j];
                    cartelera[j] = temp;
                }
            }
        }
    }

}
