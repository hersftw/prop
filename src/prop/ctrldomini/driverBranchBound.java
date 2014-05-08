package prop.ctrldomini;







/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import javax.swing.JFileChooser;


/**
 *
 * @author alex
 */
public class driverBranchBound {
    
    public static void main (String[] args) {
        String nombreclase = "BrancBound";
        System.out.println("Driver" + nombreclase + ".");
        
        ctrlPersistencia cp = new ctrlPersistencia();
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            branchBound bb = new branchBound(0);
            boolean out = false; 
            while (!out) {
				System.out.println("Elige una opicion:");
				System.out.println("\t 1) ctrlPersistencia()");
				System.out.println("\t 2) getTam()");
				System.out.println("\t 3) getAfin()");
				System.out.println("\t 4) getDist()");
				System.out.println("\t 5) leerJuegoDePrueba(String ruta)");
                                System.out.println("\t 6) Ejecutar BranchBound");
				System.out.println("\t 7) guardarResultado(int[] res, String ruta)");
				System.out.println("\t 0) Salir");
				System.out.println();
				
                String linea;
                String palabras[];
                String opcion;

                linea = buffer.readLine();
                palabras = linea.split(" ");
                opcion = palabras[0];

		                
                try {
                    System.out.println("Opcion " + opcion + " seleccionada.");
                    switch (opcion) {
                        case "1": //Creadora por defecto
                            cp = new ctrlPersistencia();
                            break;
                        case "2": //Tamaño de la solucion
                            System.out.println("Tamaño es = " + cp.getTam());
                            break;
                        case "3":   //Devuelve la matriz de Afinidad
                            System.out.println("La matriz de Afinidad = " + cp.getAfin());
                            break;
                        case "4":   //Devuelve la matriz de Distancia 
                            System.out.println("La matriz de Distancia = " + cp.getDist());
                            break;
                        case "5":   // Lee el juego de pruebas 
                            JFileChooser chooser = new JFileChooser();
                            chooser.setCurrentDirectory(new java.io.File("."));	
                            String ruta = chooser.getCurrentDirectory().getAbsolutePath();
                            ruta +="//"+ palabras[1];
                            cp.leerJuegoDePrueba(ruta);
                            break;
                        case "6":   // Ejecuta el algoritmo
                            bb = new branchBound(cp.getAfin() ,cp.getDist());
                            for (int i = 0; i < bb.mejorSolucion.teclasAssignadas.length; i++) {
                                System.out.print(bb.mejorSolucion.teclasAssignadas[i] + " ");
                            }
                             System.out.println("");
                             System.out.println("cost: "+bb.mejorCost);
                            break;
			case "7":   // Guardo los resultados
                            chooser = new JFileChooser();
                            chooser.setCurrentDirectory(new java.io.File("."));
                            ruta = chooser.getCurrentDirectory().getAbsolutePath();
                            ruta +="//"+ palabras[1];
                            cp.guardarResultado(bb.mejorSolucion.teclasAssignadas, ruta);
                            
                            break;
			case "0":
                            out = true;
                            break;
                                                    
                        default: 
                            System.out.println("La opcion elegida no existe.");
                            break;
                    }
                    
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } 
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
