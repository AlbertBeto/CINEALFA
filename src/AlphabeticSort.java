public class AlphabeticSort {
    private AlphabeticSort(){}
    public static void sort(Pelicula[] cartelera) {
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
}
