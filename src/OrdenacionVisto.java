import java.util.Arrays;

class OrdenarVisto implements Comparable <OrdenarVisto> {
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
    public OrdenarVisto(String nombre, int estrellas, int sala, double coste, String vista) {
        this.nombre = nombre;
        this.estrellas = estrellas;
        this.sala = sala;
        this.coste = coste;
        this.vista = vista;
    }

    public static void imprimeArrayCartelera(OrdenarVisto[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i].nombre + " - Estrellas: " + array[i].estrellas + " - Sala: " + array[i].sala
                    + " - Euros: " + array[i].coste + array[i].vista);
        }
    }

    public static void main(String[] args) {
        OrdenarVisto[]Cartelera =new OrdenarVisto[5];
        Cartelera[0] = new OrdenarVisto("Avatar", 5, 2, 8.99, " No vista");
        Cartelera[1] = new OrdenarVisto("Rocky", 4, 4, 13.00, " Si vista");
        Cartelera[2] = new OrdenarVisto("Fury", 2, 1, 11.99, " Si vista");
        Cartelera[3]= new OrdenarVisto("Robocop",3,3,19.99," No vista");
        Cartelera[4] = new OrdenarVisto("Alf", 1, 5, 4.99, " No vista");
        System.out.println("Array sin ordenar por visto o no visto");
        imprimeArrayCartelera(Cartelera);
        Arrays.sort(Cartelera);
        System.out.println("Array ordenado por visto o no visto");
        imprimeArrayCartelera(Cartelera);
    }

    @Override
    public int compareTo(OrdenarVisto o) {
        if(vista.startsWith(" N")){
            return -1;
        } else if(vista.startsWith(" S")){
            return 1;
        }
        return 0;
    }
}
