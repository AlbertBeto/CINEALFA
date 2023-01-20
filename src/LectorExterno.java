import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;

public class LectorExterno {



        public static void main(String [] arg) {
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
                while((linea=br.readLine())!=null)

                    //Leemos las lineas del archivo, luego creamos un for y replicamos el funcionamiento de la creación
                    //de arrays de objetos utilizada en  el ejercicio de patri
                    Spliter.separador(linea);
            }
            catch(Exception e){
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
        }
    }



