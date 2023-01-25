public class RatingSort {

    private RatingSort(){}

    public static void sort(Pelicula[] cartelera) {
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
}
