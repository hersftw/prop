package Drivers;

import prop.ctrldomini.CtrlDomini;

public class DriverCtrlDomini {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CtrlDomini ctrl = new CtrlDomini();
		ctrl.inicialitzarCategories();
		ctrl.afegirCategoria("Bib1", "Biblioteca");
		ctrl.afegirCategoria("Bib2", "Biblioteca");
		ctrl.mostrarCategories();
		System.out.println();
		ctrl.modificarCategories("Bib2", "Bib40");
		ctrl.mostrarCategories();
		
	}

}
