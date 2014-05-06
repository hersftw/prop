package prop.drivers;

import prop.domini.Llibre;

import java.util.*;
import java.io.*;


public class DriverLlibre {
	
	private static void menu() {
		System.out.println("Escull una opció:/n");
		System.out.println("1. Get id");
		System.out.println("2. Set id");
		System.out.println("3. Get titol");
		System.out.println("4. Set titol)");
		System.out.println("5. Get autor");
		System.out.println("6. Set autor");
		System.out.println("7. Get editorial");
		System.out.println("8. Set editorial");
		System.out.println("9. Get any");
		System.out.println("10. Set any");
		System.out.println("11. Get categoria");
		System.out.println("12. Set categoria");
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Driver Llibre");
		System.out.println("Introdueix una id(int), un titol(String), un autor(String), una editorial (String), un any (int) i un categoria (String)");
		Llibre book = new Llibre(in.nextInt(), in.next(), in.next(), in.next(), in.nextInt(), in.next());
		
		menu();
		in = new Scanner(System.in);
		
		switch (in.nextInt()) {
		
			case 1: 
				System.out.println(book.getId());
				break;
			
				
			case 2: 
				System.out.println("Introdueix el nou id(int):");
				in = new Scanner(System.in);
				book.setId(in.nextInt());
				break;
			
				
			case 3: 
				System.out.println(book.getTitol());
				break;
				
			case 4: 
				System.out.println("Introdueix el nou Titol(String):");
				in = new Scanner(System.in);
				book.setTitol(in.next());
				break;
				
			
			case 5: 
				System.out.println(book.getAutor());
				break;
				
			case 6: 
				System.out.println("Introdueix el nou Autor(String):");
				in = new Scanner(System.in);
				book.setAutor(in.next());
				break;
			
			case 7: 
				System.out.println(book.getEditorial());
				break;
				
			case 8: 
				System.out.println("Introdueix la nova Editorial(String):");
				in = new Scanner(System.in);
				book.setEditorial(in.next());
				break;
				
			case 9: 
				System.out.println(book.getAny());
				break;
				
			case 10: 
				System.out.println("Introdueix el nou Any (int):");
				in = new Scanner(System.in);
				book.setAny(in.nextInt());
				break;
				
			case 11: 
				System.out.println(book.getCategoria());
				break;
				
			case 12: 
				System.out.println("Introdueix la nova Categria (String):");
				in = new Scanner(System.in);
				book.setCategoria(in.next());
				break;
		}
	}
}
