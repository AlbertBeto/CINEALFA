import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Pelicula[] peliculas = LectorExterno.lector();

        Scanner sc =new Scanner(System.in);
        System.out.println("Please introduce la opción deseada.");

        int opciones= sc.nextInt();

        switch (opciones){
            case 1:
                //Ordenar por Nombre de película
                //Llamar a método de ordenar
                break;


            case 2:
                //Ordenar por Estrellas
                break;
            case 3:
                //Ordenar por Sala de cine asc o desc(burbuja)
                break;

            case 4:
                //Ordenar por precio

                break;

            case 5:
                //Ordenar por visto si o no

                break;

            default:
        }
    }
}