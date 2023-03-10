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
                int nLineas= (int)br.lines().count();
                //No se si esto funciona, tras el merge lo comprobaremos xD
                br.close();
                br = new BufferedReader(new FileReader(archivo));
                peliculas = new Pelicula[nLineas];
                for (int i = 0; i < nLineas; i++) {
                    Pelicula m = new Pelicula(Spliter.separador(br.readLine()));
                    peliculas[i]=m;
                }


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



