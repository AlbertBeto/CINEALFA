public class SalaSort {
    private SalaSort(){}

    public static void sort(Pelicula[] cartelera) {
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
}
