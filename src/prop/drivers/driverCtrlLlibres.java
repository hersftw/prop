package prop.drivers;

import java.util.Scanner;

import prop.ctrldomini.CrtlLlibres;
import prop.domini.Llibre;
import prop.domini.Llibreria;

public class driverCtrlLlibres {
	private static void menu() {
		System.out.println("Selecciona una opcio:");
	    System.out.println("\t 0) Sortir.");
	    System.out.println("\t 1) Consulta un llibre.");
	    System.out.println("\t 2) Afageix un llibre.");
	    System.out.println("\t 3) Modifica un llibre.");
	    System.out.println("\t 4) Eliminar llibre.");
	}
	
	public static void main(String[] args) {
		System.out.println("Introdueix un llibre(isbn, titol, autor, editorial, any i categoria):");
		Scanner in = new Scanner(System.in);
		Llibre book = new Llibre(in.nextInt(), in.next(), in.next(), in.next(), in.nextInt(), in.next());
		CrtlLlibres ctrl = new CrtlLlibres();
		ctrl.inicialitzarLlibres();
		ctrl.afegirLlibre(book);
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
		    	default:System.out.println("Opcio no correcta!");
		    			break;
		    }
	    }
	    in.close();
	}
}
