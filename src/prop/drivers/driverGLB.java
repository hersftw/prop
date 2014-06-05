package prop.drivers;

import java.util.Scanner;
import prop.ctrldomini.GLB;

public class driverGLB {
	
	private static void menu() {
		System.out.println("Selecciona una opcio:");
	    System.out.println("\t 0) Sortir.");
	    System.out.println("\t 1) Buscar fita.");
	    System.out.println("\t 2) Introduir nova matriu d'afinitats:");
	    System.out.println("\t 3) Introduir nova matriu de dimensions:");
	}
	
public static void main(String[] args) {
		
		System.out.println("Introdueix la dimensio:");
	    Scanner in= new Scanner(System.in);
	    int n = in.nextInt();
	    
	    System.out.println("Introdueix la matriu d'afinitats:");
	    double[][] A = new double[n][n];
	    for (int i = 0; i < n; ++i) for (int j = 0; j < n; ++j) A[i][j] = in.nextDouble();
	    
	    System.out.println("Introdueix la matriu de dimensions:");
	    double[][] D = new double[n][n];
	    for (int i = 0; i < n; ++i) for (int j = 0; j < n; ++j) D[i][j] = in.nextDouble();
	    
	    boolean end = false;
	    while (!end) {
	    	menu();
		    int num = in.nextInt();
		    if (num == 0) end = true;
		    else if (num == 1) {
		    	GLB g = new GLB();
		    	System.out.println(g.fitaGLB(A, D));
		    }
		    else if (num == 2) {
		    	System.out.println("Introdueix la matriu d'afinitats:");
		 	    for (int i = 0; i < n; ++i) for (int j = 0; j < n; ++j) A[i][j] = in.nextDouble();
		    }
		    else if (num == 3) {
		    	System.out.println("Introdueix la matriu de dimensions:");
			    for (int i = 0; i < n; ++i) for (int j = 0; j < n; ++j) D[i][j] = in.nextDouble();
		    }
		    else System.out.println("Opcio no correcta!");
	    }
	    in.close();
	}
}
