import java.util.Arrays;

public class OrdenarTodo implements Comparable<OrdenarTodo> {

    private String nombre;
    private int estrellas;
    private int sala;
    private double coste;
    private String visto;

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

    public String getVisto() {
        return visto;
    }
    public OrdenarTodo(String nom, int est, int sal, double cos, String vis) {
        this.nombre = nom;
        this.estrellas = est;
        this.sala = sal;
        this.coste = cos;
        this.visto = vis;

    }

    @Override
    public int compareTo(OrdenarTodo o) {
        int resultado = 0;


        if (this.estrellas < o.getEstrellas()) {
            return 1;
        } else if (this.estrellas > o.getEstrellas()) {
            return -1;
        }
        if(this.sala < o.getSala()) {
            return -1;
        } else if (this.sala > o.getSala()) {
            return 1;
        }
        if(this.coste<o.getCoste()){
            return -1;
        } else if (this.coste>getCoste()) {
            return 1;

        }
        if(visto.startsWith(" N")){
            return -1;
        } else if(visto.startsWith(" S")){
            return 1;
        }
        return 0 + this.nombre.compareToIgnoreCase(o.getNombre());
    }
    public static void imprimeArrayCartelera (OrdenarTodo[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i].nombre + " - Estrellas: " + array[i].estrellas + " - Sala: " + array[i].sala
                    + " - Euros: " + array[i].coste + array[i].visto);
        }
    }

    public static void main (String[]args){
        OrdenarTodo[] Cartelera = new OrdenarTodo[5];
        Cartelera[0] = new OrdenarTodo("Avatar", 5, 2, 8.99, " No vista");
        Cartelera[1] = new OrdenarTodo("Rocky", 4, 4, 13.29, " Si vista");
        Cartelera[2] = new OrdenarTodo("Fury", 2, 1, 11.99, " Si vista");
        Cartelera[3] = new OrdenarTodo("Robocop", 3, 3, 19.99, " No vista");
        Cartelera[4] = new OrdenarTodo("Alf", 1, 5, 4.99, " No vista");
        System.out.println("Array sin ordenar por Nombre, Estrellas ,Sala ,Coste y Vista o no.");
        imprimeArrayCartelera(Cartelera);
        Arrays.sort(Cartelera);
        System.out.println("Array ordenado por Nombre, Estrellas,Sala,Coste y Vista o no.");
        imprimeArrayCartelera(Cartelera);
    }
}
