package prop.drivers;

import prop.domini.Categoria;

import java.util.*;



public class DriverCategoria {
	
	private static void menu() {
		System.out.println("Escull una opció:/n");
		System.out.println("1. Get nom");
		System.out.println("2. Set nom");
		System.out.println("3. Get pare");
		System.out.println("4. Set pare");	
		System.out.println("5. Sortir");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Driver Categoria");
		System.out.println("Introdueix un nom (String) i el nom del pare (String) (si no te escriu Null)");
		Scanner in = new Scanner(System.in);
		Categoria cat = new Categoria(in.next(), in.next());
		boolean sortir = false;
		
		while(!sortir){
			menu();
			
			switch (in.nextInt()) {
			
				case 1: 
					System.out.println(cat.getNom());
					break;
				
					
				case 2: 
					System.out.println("Introdueix el nou Nom(String):");
					cat.setNom(in.next());
					break;
				
					
				case 3: 
					System.out.println(cat.getPare());
					break;
					
				case 4: 
					System.out.println("Introdueix el nou Pare(String):");
					cat.setPare(in.next());;
					break; 
					
				case 5: 
					sortir = true;
					break;
			}			
		}
		in.close();
	}
}
