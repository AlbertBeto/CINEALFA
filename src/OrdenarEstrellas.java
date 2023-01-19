import java.util.Arrays;


public  class OrdenarEstrellas implements Comparable<OrdenarEstrellas> {

    private String nombre;
    private int estrellas;
    private int sala;
    private double coste;
    private String vista;

    public OrdenarEstrellas(String nombre, int estrellas, int sala, double coste, String vista) {
        this.nombre = nombre;
        this.estrellas = estrellas;
        this.sala = sala;
        this.coste = coste;
        this.vista = vista;
    }

    public static void imprimeArrayCartelera(OrdenarEstrellas[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i].nombre + " - Estrellas: " + array[i].estrellas + " - Sala: " + array[i].sala
                    + " - Euros: " + array[i].coste + array[i].vista);
        }
    }

    public static void main(String[] args) {
        OrdenarEstrellas[]Cartelera =new OrdenarEstrellas[5];
        Cartelera[0] = new OrdenarEstrellas("Avatar", 5, 2, 8.99, "No vista");
        Cartelera[1] = new OrdenarEstrellas("Rocky", 4, 4, 13.00, "Si vista");
        Cartelera[2] = new OrdenarEstrellas("Fury", 2, 1, 11.99, "Si vista");
        Cartelera[3]= new OrdenarEstrellas("Robocop",3,3,19.99,"No vista");
        Cartelera[4] = new OrdenarEstrellas("Alf", 1, 5, 4.99, "No vista");
        System.out.println("Array sin ordenar por Estrellas");
        imprimeArrayCartelera(Cartelera);
        Arrays.sort(Cartelera);
        System.out.println("Array ordenado por Estrellas");
        imprimeArrayCartelera(Cartelera);

    }


    @Override
    public int compareTo(OrdenarEstrellas o) {
        if (estrellas>o.estrellas) {
            return -1;
        }
        if (estrellas<o.estrellas) {
            return 1;
        }
        return 0;
    }
}