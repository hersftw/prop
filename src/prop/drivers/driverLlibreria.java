package prop.drivers;

import java.util.Scanner;

import prop.domini.Llibreria;
import prop.domini.Nodo;

public class driverLlibreria {
	private static void menu() {
		System.out.println("Selecciona una opcio:");
	    System.out.println("\t 0) Sortir.");
	    System.out.println("\t 1) Consulta el nombre de prestatges.");
	    System.out.println("\t 2) Modifica el nombre de prestatges.");
	    System.out.println("\t 3) Consulta el nombre d'ubicacions.");
	    System.out.println("\t 4) Modifica el nombre d'ubicacions.");
	    System.out.println("\t 5) Afageix una ubicacio.");
	    System.out.println("\t 6) Consulta una ubicacio.");
	    System.out.println("\t 7) Elimina una ubicacio.");
	}
	
	public static void main(String[] args) {
		System.out.println("Introdueix el nombre de prestatges i ubicacions:");
	    Scanner in= new Scanner(System.in);
	    int p = in.nextInt();
	    int u = in.nextInt();
	    Llibreria n = new Llibreria(p, u);
	    boolean end = false;
	    while (!end) {
	    	menu();
		    int num = in.nextInt();
		    switch(num) {
		    	case 0: end = true;
		    			break;
		    	case 1: System.out.println(n.getPrestatges());
		    			break;
		    	case 2: System.out.println("Introdueix el nou nombre de prestatges:");
		    	 		p = in.nextInt();
		    	 		n.setPrestatges(p);
		    	 		break;
		    	case 3: System.out.println(n.getUbicacions());
		    			break;
		    	case 4: System.out.println("Introdueix el nou nombre de ubicacions:");
		    	 		u = in.nextInt();
		    	 		n.setUbicacions(u);
		    	 		break;
		    	case 5: System.out.println("Introdueix les coordenades x i y de la nova ubicacio");
				    	u = in.nextInt();
		    	 		p = in.nextInt();
		    	  		Nodo ub = new Nodo(u, p);
		    	  		n.addNodo(ub);
		    	 		break;
		    	case 6: System.out.println("Introdueix les coordenades x i y de la ubicacio que vols consultar");
				    	u = in.nextInt();
		    	 		p = in.nextInt();
		    			Nodo tmp = n.getNodo(u, p);
		    			System.out.print(tmp.getX());
		    			System.out.print(" ");
		    			System.out.println(tmp.getY());
		    	 		break;
		    	case 7: System.out.println("Introdueix les coordenades de la ubicacio que vols eliminar");
		    	 		u = in.nextInt();
		    	 		p = in.nextInt();
		    	 		n.deleteNodo(u, p);
		    	 		break;
		    }
	    }
	    in.close();
	}
}
