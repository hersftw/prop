package prop.ctrldomini;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import prop.presentacio.CtrlPresentacio;

public class gestorDades {
	
    private int n;
    private int numPres;
    private int[][] afin;
    private double[][] dist; 
    private CtrlPresentacio cp;
    
    public gestorDades(CtrlPresentacio cpgeneral){
    	cp = cpgeneral;
    }

    public int getnum(){
    	return numPres;
    }
    
    public int getTam() {
        return n;
    }

    public int[][] getAfin() {
        return afin;
    }

    public double[][] getDist() {
        return dist;
    }
    
    public void leerJuegoDePrueba(String ruta) {
    	
        try {
            File arxiu = new File(ruta);
            
            Scanner in = new Scanner(arxiu);
            
            
            n = in.nextInt();
            numPres = in.nextInt();
            cp.afegirDistribucio(n, numPres);
            
            int num = in.nextInt();
            in.nextLine();
            
            
           for (int i = 0; i < num; i++) {
               String[] cats = in.nextLine().split(" ");
               cp.afegirCategoria(cats[0],cats[1]);
            }
            
	   		
           for(int i = 0; i < n; i++){
   	   		int id = in.nextInt();
   	   		in.nextLine();
   	   		String titol = in.nextLine();
   	   		String autor = in.nextLine();
   	   		String edi = in.nextLine();
   	   		int any = in.nextInt();
   	   		in.nextLine();
   	   		String cat = in.nextLine();
        	cp.afegirLlibre(id, titol, autor, edi, any, cat);
           }
           
           int next = in.nextInt();
           if (next == 1){
               afin = new int[n][n];
               for (int i = 0; i < n; ++i) {
                   for (int j = 0; j < n; ++j) {
                       afin[i][j] = in.nextInt();
                   }
               }
           }
           
           next = in.nextInt();
           if (next == 1){
               dist = new double[n][n];
               for (int i = 0; i < n; ++i) 
                   for (int j = 0; j < n; ++j) 
                       dist[i][j] = in.nextDouble();
           }
           
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
 /*   public void guardarResultado(int[] res, String ruta) {
        ruta += "Solucio.out";     
        FileWriter ficher;
        PrintWriter pw;
        try {
            ficher = new FileWriter(ruta);
            pw = new PrintWriter(ficher);
            for (int i = 0; i < res.length; ++i) pw.print(res[i] + " ");
            ficher.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}

