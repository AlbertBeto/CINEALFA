import java.util.Arrays;

public class OrdenarSala implements Comparable<OrdenarSala> {
    private String nombre;
    private int estrellas;
    private int sala;
    private double coste;
    private String vista;

    public String getNombre() {
        return nombre;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public int getSala() {
        return sala;
    }

    public double getCoste() {
        return coste;
    }

    public String getVista() {
        return vista;
    }
    public OrdenarSala(String nombre, int estrellas, int sala, double coste, String vista) {
        this.nombre = nombre;
        this.estrellas = estrellas;
        this.sala = sala;
        this.coste = coste;
        this.vista = vista;
    }

    public static void imprimeArrayCartelera(OrdenarSala[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i].nombre + " - Estrellas: " + array[i].estrellas + " - Sala: " + array[i].sala
                    + " - Euros: " + array[i].coste + array[i].vista);
        }
    }

    public static void main(String[] args) {
        OrdenarSala[]Cartelera =new OrdenarSala[5];
        Cartelera[0] = new OrdenarSala("Avatar", 5, 2, 8.99, " No vista");
        Cartelera[1] = new OrdenarSala("Rocky", 4, 4, 13.00, " Si vista");
        Cartelera[2] = new OrdenarSala("Fury", 2, 1, 11.99, " Si vista");
        Cartelera[3]= new OrdenarSala("Robocop",3,3,19.99," No vista");
        Cartelera[4] = new OrdenarSala("Alf", 1, 5, 4.99, " No vista");
        System.out.println("Array sin ordenar por Sala");
        imprimeArrayCartelera(Cartelera);
        Arrays.sort(Cartelera);
        System.out.println("Array ordenado por Sala");
        imprimeArrayCartelera(Cartelera);
    }

    @Override
    public int compareTo(OrdenarSala o) {
        if(sala<o.sala){
            return -1;
        }
        if(sala>o.sala){
            return 1;
        }
        return 0;
    }
}