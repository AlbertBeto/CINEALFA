import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Pelicula[] peliculas = LectorExterno.lector();
        Scanner sc = new Scanner(System.in);

        boolean salir = false;

        System.out.println("Bienvenido a la versión 1.0 del gestor de peliculas Alpha.");
        System.out.println(" ");
//Para a versión queremos incluir la opción de escoger una de las peliculas de lista y poder modificar si se ha visto o no.


        while (salir == false) {

            System.out.println("Por favor, introduce la opción deseada.");
            System.out.println("---------------------------------------");
            System.out.println("1 Imprimir el listado de peliculas");
            System.out.println("-------- Ordenación e impresión -------");
            System.out.println("2 por nombre");
            System.out.println("3 por estrellas");
            System.out.println("4 por sala");
            System.out.println("5 por precio");
            System.out.println("6 por vista o no vista");
            System.out.println("--------- Filtro e impresión ----------");
            System.out.println("7 Escoge cuantas opciones mostrar");
            System.out.println("---------------------------------------");
            System.out.println("0 Salir de la ordenación");

            int opciones = sc.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("Imprimir el listado de peliculas");
                    printCompleto(peliculas);
                    break;

                case 2:
                    //Ordenacion por nombre
                    System.out.println("Elige la opcion de ordenación: ");
                    System.out.println("1. Ordenación ascendente ");
                    System.out.println("2. Ordenación descendente ");
                    int ordenacion = sc.nextInt();
                    switch (ordenacion) {
                        case 1:
                            Sorter.alphaSortDesc(peliculas);
                            printCompleto(peliculas);

                            break;
                        case 2:
                            Sorter.alphaSortAsc(peliculas);
                            printCompleto(peliculas);

                            break;
                    }
                    break;
                case 3:
                    //Ordenacion por estrellas
                    System.out.println("Elige la opcion de ordenación: ");
                    System.out.println("1. Ordenación ascendente ");
                    System.out.println("2. Ordenación descendente ");
                    int ordenacion2 = sc.nextInt();
                    switch (ordenacion2) {
                        case 1:
                            Sorter.ratingSortAsc(peliculas);
                            printCompleto(peliculas);
                            break;
                        case 2:
                            Sorter.ratingSortDesc(peliculas);
                            printCompleto(peliculas);
                            break;
                    }
                    break;
                case 4:
                    //Ordenar por Sala de cine asc o desc(burbuja)
                    System.out.println("Elige la opcion de ordenación: ");
                    System.out.println("1. Ordenación ascendente ");
                    System.out.println("2. Ordenación descendente ");
                    int ordenacion3 = sc.nextInt();
                    switch (ordenacion3) {
                        case 1:
                            Sorter.salaSortAsc(peliculas);
                            printCompleto(peliculas);
                            break;
                        case 2:
                            Sorter.salaSortDesc(peliculas);
                            printCompleto(peliculas);
                            break;
                    }
                    break;
                case 5:
                    //Ordenar por precio
                    System.out.println("Elige la opcion de ordenación: ");
                    System.out.println("1. Ordenación ascendente ");
                    System.out.println("2. Ordenación descendente ");
                    int ordenacion4 = sc.nextInt();
                    switch (ordenacion4) {
                        case 1:
                            Sorter.priceSortAsc(peliculas);
                            printCompleto(peliculas);
                            break;
                        case 2:
                            Sorter.priceSortDesc(peliculas);
                            printCompleto(peliculas);
                            break;
                    }
                    break;
                case 6:

                   Sorter.priceSortAsc(peliculas);
                   printCompleto(peliculas);
                    break;

                case 7:
                    System.out.println("Cuantas peliculas quieres mostrar? 0 para mostrar todas.");
                    int cuantasMostrar = sc.nextInt();
                    if(cuantasMostrar==0){
                        printCompleto(peliculas);
                    }else{
                    printparcial(peliculas,cuantasMostrar);}
                    break;

                case 0:
                    //Salir de la ordenacion
                    salir = true;
                    break;
            }
            System.out.println(" ");
            System.out.println("Pulsa 0 para salir o cualquier otro numero para volver al menu.");
            int menusalir = sc.nextInt();
            switch (menusalir){
                case 0:
                    salir =true;
                    break;

                default:
                    System.out.println("");

        }



        }
    }
    public static void printCompleto(Pelicula[] peliculas){
        System.out.println(" ");
        for (int i = 0; i < peliculas.length; i++) {
            peliculas[i].print();
            System.out.println();
        }
    }

    public static void printparcial(Pelicula[] peliculas, int cuantasMostrar){
        System.out.println(" ");
        for (int i = 0; i < cuantasMostrar; i++) {
            peliculas[i].print();
            System.out.println();
        }
    }

}