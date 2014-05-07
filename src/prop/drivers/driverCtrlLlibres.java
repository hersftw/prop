package prop.drivers;

import java.util.Scanner;

import prop.ctrldomini.CrtlLlibres;
import prop.domini.Llibre;

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
		System.out.println("Introdueix un llibre:");
		System.out.print("Introdueix una ISBN(int): ");
		Scanner in = new Scanner(System.in);
		int id = in.nextInt();
		in.nextLine();
		System.out.print("Introdueix Titol (String): ");
		String titol = in.nextLine();
		System.out.print("Introdueix Autor (String): ");
		String autor = in.nextLine();
		System.out.print("Introdueix Editorial (String): ");
		String edi = in.nextLine();
		System.out.print("Introdueix Any (int): ");
		int any = in.nextInt();
		in.nextLine();
		System.out.print("Introdueix Categoria (String): ");
		String cat = in.nextLine();
		
		Llibre book = new Llibre(id, titol, autor, edi, any, cat);
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
		    	case 1: System.out.println("Introdueix l'isbn del llibre que vols consultar.");
		    			ctrl.consultarLlibre(in.nextInt());
		    			break;
		    	case 2: System.out.println("Introdueix el nou llibre:");
				    	System.out.print("Introdueix una ISBN(int): ");
						id = in.nextInt();
						in.nextLine();
						System.out.print("Introdueix Titol (String): ");
						titol = in.nextLine();
						System.out.print("Introdueix Autor (String): ");
						autor = in.nextLine();
						System.out.print("Introdueix Editorial (String): ");
						edi = in.nextLine();
						System.out.print("Introdueix Any (int): ");
						any = in.nextInt();
						in.nextLine();
						System.out.print("Introdueix Categoria (String): ");
						cat = in.nextLine();
						
						book = new Llibre(id, titol, autor, edi, any, cat);
						ctrl.afegirLlibre(book);
		    	 		break;
		    	case 3: System.out.println("Introdueix l'isbn del llibre a modificar:");
		    			int isbn1 = in.nextInt();
		    			System.out.print("Introdueix una ISBN(int): ");
						int isbn2 = in.nextInt();
						in.nextLine();
						System.out.print("Introdueix Titol (String): ");
						titol = in.nextLine();
						System.out.print("Introdueix Autor (String): ");
						autor = in.nextLine();
						System.out.print("Introdueix Editorial (String): ");
						String editorial = in.nextLine();
						System.out.print("Introdueix Any (int): ");
						any = in.nextInt();
						in.nextLine();
						System.out.print("Introdueix Categoria (String): ");
						String categoria = in.nextLine();
		    			ctrl.modificarLlibre(isbn1, isbn2, titol, autor, editorial, any, categoria);
		    			break;
		    	case 4: System.out.println("Introdueix l'isbn del llibre a eliminar:");
		    	 		ctrl.eliminarLlibre(in.nextInt());
		    	 		break;
		    	default:System.out.println("Opcio no correcta!");
		    			break;
		    }
	    }
	    in.close();
	}
}
