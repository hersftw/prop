package prop.drivers;

import prop.domini.categoria;

import java.util.*;



public class driverCategoria {
	
	private static void menu() {
		System.out.println("Escull una opci�:/n");
		System.out.println("1. Get nom");
		System.out.println("2. Set nom");
		System.out.println("3. Get pare");
		System.out.println("4. Set pare");	
		System.out.println("5. Sortir");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Driver Categoria");
		Scanner in = new Scanner(System.in);
		System.out.print("Introdueix el nom de la categoria (String): ");
		String nom = in.nextLine();
		System.out.print("Introdueix el nom del pare (String) (si no te escriu Null): ");
		String pare = in.nextLine();
		categoria cat = new categoria(nom, pare);
		boolean sortir = false;
		
		while(!sortir){
			menu();
			
			switch (in.nextInt()) {
				case 1: 
					System.out.println(cat.getNom());
					break;
				
					
				case 2: 
					in.nextLine();
					System.out.print("Introdueix el nou Nom(String): ");
					cat.setNom(in.nextLine());
					break;
				
					
				case 3: 
					System.out.println(cat.getPare());
					break;
					
				case 4: 
					in.nextLine();
					System.out.println("Introdueix el nou Pare(String):");
					cat.setPare(in.nextLine());
					break; 
					
				case 5: 
					sortir = true;
					break;
				default: 
					System.out.println("Opcio no reconeguda");
			}			
		}
		in.close();
	}
}
