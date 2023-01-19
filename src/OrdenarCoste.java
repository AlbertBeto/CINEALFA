import java.util.Arrays;

public class OrdenarCoste implements Comparable<OrdenarCoste> {
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
    public OrdenarCoste(String nombre, int estrellas, int sala, double coste, String vista) {
        this.nombre = nombre;
        this.estrellas = estrellas;
        this.sala = sala;
        this.coste = coste;
        this.vista = vista;
    }

    public static void imprimeArrayCartelera(OrdenarCoste[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i].nombre + " - Estrellas: " + array[i].estrellas + " - Sala: " + array[i].sala
                    + " - Euros: " + array[i].coste + array[i].vista);
        }
    }

    //Creacion de objetos ?¿?¿?¿¿?
    public static void main(String[] args) {
        OrdenarCoste[]Cartelera =new OrdenarCoste[5];
        Cartelera[0] = new OrdenarCoste("Avatar", 5, 2, 8.99, "No vista");
        Cartelera[1] = new OrdenarCoste("Rocky", 4, 4, 13.00, "Si vista");
        Cartelera[2] = new OrdenarCoste("Fury", 2, 1, 11.99, "Si vista");
        Cartelera[3]= new OrdenarCoste("Robocop",3,3,19.99,"No vista");
        Cartelera[4] = new OrdenarCoste("Alf", 1, 5, 4.99, "No vista");
        System.out.println("Array sin ordenar por coste");
        imprimeArrayCartelera(Cartelera);
        Arrays.sort(Cartelera);
        System.out.println("Array ordenado por coste");
        imprimeArrayCartelera(Cartelera);
    }


    @Override
    public int compareTo(OrdenarCoste o) {
        if(coste<o.coste){
            return -1;
        }
        if(coste>o.coste){
            return 1;
        }
        return 0;
    }
}
