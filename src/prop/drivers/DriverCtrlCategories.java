package prop.drivers;

import java.util.Scanner;

import prop.ctrldomini.CtrlCategories;

public class DriverCtrlCategories {

	private static void menu() {
		System.out.println("Selecciona una opcio:");
	    System.out.println("\t 0) Sortir.");
	    System.out.println("\t 1) Afegeix una categoria.");
	    System.out.println("\t 2) Modifica el nom d'una categoria.");
	    System.out.println("\t 3) Intercanvia dues categories.");
	    System.out.println("\t 4) Elimina la categoria.");
	    System.out.println("\t 5) Mostra la jerarquia de categories.");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Driver CtrlCategories");
		CtrlCategories ctrl = new CtrlCategories();
		ctrl.inicialitzarCategories();
		Scanner in = new Scanner(System.in);
		String nom;
		String pare;
		String nou;
		boolean end = false;
		ctrl.mostrarCategories();
		while (!end) {
			menu();
			switch(in.nextInt()) {
			case 1:
				System.out.print("Introdueix el nom de la categoria: ");
				nom = in.next();
				System.out.print("Introdueix la categoria a la que pertany: ");
				pare = in.next();
				ctrl.afegirCategoria(nom, pare);
				ctrl.mostrarCategories();
				break;
			case 2:
				System.out.print("Introdueix la categoria a modificar: ");
				nom = in.next();
				System.out.print("Introdueix el nou nom: ");
				nou = in.next();
				ctrl.modificarCategories(nom, nou);
				break;
			case 3:
				System.out.print("Introdueix una de les categories a intercanviar: ");
				nom = in.next();
				System.out.println("Introdueix l'altre categoria a intercanviar: ");
				nou = in.next();
				ctrl.canviarCategories(nom, nou);
				break;
			case 4:
				System.out.print("Introdueix la categoria a eliminar: ");
				nom = in.next();
				ctrl.eliminarCategoria(nom);
				break;
			case 5:
				ctrl.mostrarCategories();
				break;
			case 0:
				end = true;
				break;
			}
		}
		in.close();
	}

}