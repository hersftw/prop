package prop.ctrldomini;

import java.io.*;
import java.io.File;
import java.util.Scanner;

    /* autor: Pedro Moreno Duran
    /* version 1.0 */

    /* Esta clase implementa el Controlador de Persistencia, sera el encargado de conectar Dominio y Persistencia, es decir, de
       almacenar aquellos datos de dominio que sea preciso almacenar y de leer de ficheros aquellos de datos que sea preciso leer */

public class ctrlPersistencia {

    private int tam;
    private int[][] afin;
    private int[][] dist;

    public int getTam() {
        return tam;
    }

    public int[][] getAfin() {
        return afin;
    }

    public int[][] getDist() {
        return dist;
    }

    /* funcion que lee del fichero ruta, el controlador se guarda el tamano de las matrices y las matrices de afinidad y distancia
       si ruta = chr12a lee del fichero chr12a.dat. Lo primero que se hara una vez se lean datos son los correspondientes gets para
        obtener la informacion leida, ya que una vez se lea otro fichero esa informacion se sobreescribira en el controlador */

    public void leerJuegoDePrueba(String ruta) {
        ruta += ".dat";     // anado la extension a la ruta para leer
        try {
            File archivo = new File(ruta);
            
            Scanner sc = new Scanner(archivo);
            
            
            tam = sc.nextInt();
            afin = new int[tam][tam];
            dist = new int[tam][tam];
            for (int i = 0; i < tam; ++i) 
                for (int j = 0; j < tam; ++j) 
                    afin[i][j] = sc.nextInt();
            for (int i = 0; i < tam; ++i)
                for (int j = 0; j < tam; ++j)
                    dist[i][j] = sc.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    /* funcion que almacena en el fichero rutaSOL.dat la solucion res del juego de pruebas ruta.
       En este caso si ruta = chr12a crea el fichero chr12aSOL.dat y guarda dentro el vector res
       La solucion es un vector de enteros, donde los indices son el identificador del paquete y lo que contienen
       el identificador del planeta. Si el vector res = {1,3,2} paquete1-planeta1, paquete2-planeta3, paquete3-planeta2
       */

    public void guardarResultado(int[] res, String ruta) {
        ruta += "SOL.dat";     // anyado la extension a la ruta para leer
        FileWriter fichero;
        PrintWriter pw;
        try {
            fichero = new FileWriter(ruta);
            pw = new PrintWriter(fichero);
            for (int i = 0; i < res.length; ++i) pw.print(res[i] + " ");
            fichero.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
