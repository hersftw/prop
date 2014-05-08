package prop.drivers;

import java.util.Scanner;

import prop.ctrldomini.ctrlPersistencia;;

public class DriverCtrlPersistencia {

	private static void menu() {
		System.out.println("Selecciona una opcio:");
	    System.out.println("\t 0) Sortir.");
	    System.out.println("\t 1) Carregar d'un fitxer.");
	    System.out.println("\t 2) Mostrar tamany.");
	    System.out.println("\t 3) Mostrar matriu d'afinitats.");
	    System.out.println("\t 4) Mostrar matriu de distancies.");
	    System.out.println("\t 5) Guardar solució al fitxer.");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		System.out.println("Driver CtrlPersistencia");
		ctrlPersistencia ctrl = new ctrlPersistencia();
		boolean end = false;
		Scanner in = new Scanner(System.in);
		while (!end) {
			menu();
			switch(in.nextInt()) {
			case 1:
				System.out.print("Introdueix el nom del fitxer: ");
				ctrl.leerJuegoDePrueba(in.next());
				break;
			case 2:
				System.out.println(ctrl.getTam());
				break;
			case 3:
				for (int i = 0; i < ctrl.getTam(); ++i) {
	                for (int j = 0; j < ctrl.getTam(); ++j) {
	                    System.out.print(ctrl.getAfin()[i][j]+"\t");
	                }
	                System.out.println();
				}
				break;
			case 4:
				for (int i = 0; i < ctrl.getTam(); ++i) {
	                for (int j = 0; j < ctrl.getTam(); ++j) {
	                    System.out.print(ctrl.getDist()[i][j]+"\t");
	                }
	                System.out.println();
				}
				break;
			case 5:
				int res[] = {1, 8, 3, 2, 7, 6, 9, 5, 4};
				System.out.print("Introdueix el nom del fitxer a guardar: ");
				ctrl.guardarResultado(res, in.next());
				System.out.println("S'ha guardat un exemple de solució al fitxer indicat.");
				break;
			case 0:
				end = true;
				break;
			}
		}
	}
}