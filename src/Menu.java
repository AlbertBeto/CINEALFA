import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Pelicula[] peliculas = LectorExterno.lector();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please introduce la opción deseada.");
        System.out.println("1 Ordenación por nombre");
        System.out.println("2 Ordenación por estrellas");
        System.out.println("3 Ordenación por sala");
        System.out.println("4 Ordenación por precio");
        System.out.println("5 Ordenación por si la has visto o no");
        System.out.println("0 Salir de la ordenación");

        int opciones = sc.nextInt();
        boolean salir = false;

        while (salir == false) {
            switch (opciones) {
                case 1:
                    //Ordenacion por nombre
                    System.out.println("Elige la opcion de ordenación: ");
                    System.out.println("1. Ordenación ascendente ");
                    System.out.println("2. Ordenación descendente ");
                    int ordenacion = sc.nextInt();
                    switch (ordenacion) {
                        case 1:
                            Sorter.alphaSortDesc(peliculas);
                            printCompleto(peliculas);
                            opciones = 0;
                            break;
                        case 2:
                            Sorter.alphaSortAsc(peliculas);
                            printCompleto(peliculas);
                            opciones = 0;
                            break;
                    }
                    break;
                case 2:
                    //Ordenacion por estrellas
                    System.out.println("Elige la opcion de ordenación: ");
                    System.out.println("1. Ordenación ascendente ");
                    System.out.println("2. Ordenación descendente ");
                    System.out.println("0. Salir ");
                    int ordenacion2 = sc.nextInt();
                    switch (ordenacion2) {
                        case 1:
                            Sorter.ratingSortAsc(peliculas);
                            break;
                        case 2:
                            Sorter.ratingSortDesc(peliculas);
                            break;
                    }
                    break;
                case 3:
                    //Ordenar por Sala de cine asc o desc(burbuja)
                    System.out.println("Elige la opcion de ordenación: ");
                    System.out.println("1. Ordenación ascendente ");
                    System.out.println("2. Ordenación descendente ");
                    int ordenacion3 = sc.nextInt();
                    switch (ordenacion3) {
                        case 1:
                            Sorter.salaSortAsc(peliculas);
                            break;
                        case 2:
                            Sorter.salaSortDesc(peliculas);
                            break;
                    }
                    break;
                case 4:
                    //Ordenar por precio
                    System.out.println("Elige la opcion de ordenación: ");
                    System.out.println("1. Ordenación ascendente ");
                    System.out.println("2. Ordenación descendente ");
                    int ordenacion4 = sc.nextInt();
                    switch (ordenacion4) {
                        case 1:
                            Sorter.priceSortAsc(peliculas);
                            opciones = 0;
                            break;
                        case 2:
                            Sorter.priceSortDesc(peliculas);
                            opciones = 0;
                            break;
                    }
                    break;
                case 5:
                    //Ordenar por visto si o no
                    break;

                case 0:
                    //Salir de la ordenacion
                    salir = true;
                    break;
            }
        }
    }
    public static void printCompleto(Pelicula[] peliculas){
        for (int i = 0; i < peliculas.length; i++) {
            peliculas[i].print();
            System.out.println();
        }
    }
}