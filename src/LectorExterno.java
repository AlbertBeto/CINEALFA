import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;
import java.nio.file.Files;

public class LectorExterno {

    private static Pelicula[] peliculas;

    //HAy que convertir esta clase en un objeto estatico que pueda invocar metodos sin crear un objeto de la clase


        private LectorExterno(){}
        public static Pelicula[] lector() {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;

            try {
                // Apertura del fichero y creacion de BufferedReader para poder
                // hacer una lectura comoda (disponer del metodo readLine()).
                archivo = new File ("BDPelis.txt");
                fr = new FileReader (archivo);
                br = new BufferedReader(fr);



                //Saber cuantas peliculas-lineas están en la lista
                int cantidadPelis= (int)br.lines().count();


                // Lectura del fichero
                String linea;
                int nLineas = 0;
                while((linea=br.readLine())!=null){
                    nLineas++;
                }

                //No se si esto funciona, tras el merge lo comprobaremos xD

                peliculas = new Pelicula[nLineas];
                for (int i = 0; i < nLineas; i++) {
                    linea = br.readLine();
                    Pelicula m= new Pelicula(Spliter.separador(linea));
                    peliculas[i]=m;
                }

                //String linea=br.readLine();
                //String[] pepe = new String[cantidadPelis];
                //while((linea=br.readLine())!=null)

                    //Leemos las lineas del archivo, luego creamos un for y replicamos el funcionamiento de la creación
                    //de arrays de objetos utilizada en  el ejercicio de patri

                           //pepe=Spliter.separador(linea);
                // Hay que ver como creamos el objeto con el nombre del primer campo del array otorgado.

            }catch(Exception e){
                e.printStackTrace();
            }finally{
                // En el finally cerramos el fichero, para asegurarnos
                // que se cierra tanto si todo va bien como si salta
                // una excepcion.
                try{
                    if( null != fr ){
                        fr.close();
                    }
                }catch (Exception e2){
                    e2.printStackTrace();
                }
            }
            return peliculas;
        }
    }



