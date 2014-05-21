package prop.drivers;

import prop.domini.llibre;

import java.util.*;




public class driverLlibre {
	
	private static void menu() {
		System.out.println("Escull una opció:/n");
		System.out.println("1. Get id");
		System.out.println("2. Set id");
		System.out.println("3. Get titol");
		System.out.println("4. Set titol");
		System.out.println("5. Get autor");
		System.out.println("6. Set autor");
		System.out.println("7. Get editorial");
		System.out.println("8. Set editorial");
		System.out.println("9. Get any");
		System.out.println("10. Set any");
		System.out.println("11. Get categoria");
		System.out.println("12. Set categoria");
		System.out.println("13. Sortir");
		
	}
	public static void main(String[] args) {
		
		System.out.println("Driver Llibre");
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
		
		llibre book = new llibre(id, titol, autor, edi, any, cat);
		boolean sortir = false;
		while (!sortir){
			menu();
			
			switch (in.nextInt()) {
			
				case 1: 
					System.out.println(book.getId());
					break;
				
					
				case 2: 
					System.out.print("Introdueix el nou ISBN(int): ");
					book.setId(in.nextInt());
					break;
				
					
				case 3: 
					System.out.println(book.getTitol());
					break;
					
				case 4: 
					in.nextLine();
					System.out.print("Introdueix el nou Titol(String): ");
					book.setTitol(in.nextLine());
					break;
					
				
				case 5: 
					System.out.println(book.getAutor());
					break;
					
				case 6: 
					in.nextLine();
					System.out.print("Introdueix el nou Autor(String): ");
					book.setAutor(in.nextLine());
					break;
				
				case 7: 
					System.out.println(book.getEditorial());
					break;
					
				case 8: 
					in.nextLine();
					System.out.print("Introdueix la nova Editorial(String): ");
					book.setEditorial(in.nextLine());
					break;
					
				case 9: 
					System.out.println(book.getAny());
					break;
					
				case 10: 
					System.out.print("Introdueix el nou Any (int): ");
					book.setAny(in.nextInt());
					break;
					
				case 11: 
					System.out.println(book.getCategoria());
					break;
					
				case 12: 
					in.nextLine();
					System.out.print("Introdueix la nova Categria (String): ");
					book.setCategoria(in.nextLine());
					break;
				case 13: 
					sortir = true;
					break;
				default: 
					System.out.println("Opcio no reconeguda");
			}
		}
		in.close();
	}
}
