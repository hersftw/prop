package prop.drivers;

import java.util.Scanner;

import prop.domini.afinidad;

public class driverAfinidad {
	private static void menu() {
		System.out.println("Selecciona una opcio:");
	    System.out.println("\t 0) Sortir.");
	    System.out.println("\t 1) Consulta afinitat.");
	    System.out.println("\t 2) Modifica les coordenades.");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Introdueix la mida de la matriu:");
	    Scanner in= new Scanner(System.in);
	    int n = in.nextInt();
	    afinidad m = new afinidad(n);
	    System.out.println("Introdueix tots els elements de la matriu:");
	    for (int i = 0; i < n; ++i) for (int j = 0; j < n; ++j) m.insertar_afinidad(i, j, in.nextDouble());
	    boolean end = false;
	    while (!end) {
	    	menu();
		    int num = in.nextInt();
		    switch (num) {
			    case 0: end = true;
			    		break;
			    case 1: System.out.println("Introdueix la posició que vols consultar:");
			    		System.out.println(m.consultar_afinidad(in.nextInt(), in.nextInt()));
			    		break;
			    case 2: System.out.println("Introdueix la posició que vols modificar i el nou valor:");
			    		m.insertar_afinidad(in.nextInt(), in.nextInt(), in.nextDouble());
			    		break;
			    default:System.out.println("Opcio no correcta!");
			     		break;
		    }
	    }
	    in.close();
	}
}
