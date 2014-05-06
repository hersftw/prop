package prop.drivers;

import java.util.Scanner;

import prop.domini.Afinidad;
import prop.domini.Nodo;

public class driverAfinidad {
	private static void menu() {
		System.out.println("Selecciona una opcio:");
	    System.out.println("\t 0) Sortir.");
	    System.out.println("\t 1) Consulta les coordenades.");
	    System.out.println("\t 2) Modifica les coordenades.");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Introdueix la mida de la matriu:");
	    Scanner in= new Scanner(System.in);
	    int n = in.nextInt();
	    Afinidad m = new Afinidad(n);
	    Nodo n = new Nodo(x, y);
	    boolean end = false;
	    while (!end) {
	    	menu();
		    int num = in.nextInt();
		    if (num == 0) end = true;
		    else if (num == 1) {
		    	System.out.print(n.getX());
		    	System.out.print(" ");
		    	System.out.println(n.getY());
		    }
		    else if (num == 2) {
		    	System.out.println("Introdueix nous valors per a x i y:");
		    	System.out.print("x = ");
		    	x = in.nextInt();
		    	n.setX(x);
		    	System.out.print("y = ");
		    	y = in.nextInt();
		    	n.setY(y);
		    }
		    else System.out.println("Opcio no correcte.");
	    }
	    in.close();
	}
}
