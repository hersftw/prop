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
		Scanner in = new Scanner(System.in);
		boolean end = false;
		while (!end) {
			menu();
			switch(in.nextInt())
		ctrl.inicialitzarCategories();
		ctrl.afegirCategoria("Bib1", "Biblioteca");
		ctrl.afegirCategoria("Bib2", "Biblioteca");
		ctrl.afegirCategoria("Bib1.1", "Bib1");
		ctrl.afegirCategoria("Bib1.2", "Bib1");
		ctrl.mostrarCategories();
		ctrl.canviarCategories("Bib2", "Bib1.1");
		System.out.println();
		ctrl.mostrarCategories();
	}

}