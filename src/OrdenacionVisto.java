import java.util.Arrays;

class OrdenarVisto implements Comparable <Pelicula> {
    private OrdenarVisto(){}

    public static Pelicula[] sort(Pelicula[] cartelera) {
        Arrays.sort(cartelera);
        return cartelera;
    }

    @Override
    public int compareTo(Pelicula pelicula) {
        if(pelicula.isVisualizado()){
            return -1;
        } else if (pelicula.isVisualizado()==false){
            return 1;
        }
        return 0;
    }

}
