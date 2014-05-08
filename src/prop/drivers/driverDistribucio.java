package prop.drivers;


import prop.domini.Distribucio;
import prop.domini.Llibre;
import prop.domini.nodo;
import prop.domini.Assignacio;

import java.util.*;

public class driverDistribucio {
	
	private static void menu() {
		  System.out.println("Escull una opció:");
          System.out.println(" 1) Afegir Assignació ");
          System.out.println(" 2) Mostrar Distribució ");
          System.out.println(" 3) Editar Assignacions ");
          System.out.println(" 4) Consulta Assignació ");
          System.out.println(" 5) getNum ");
          System.out.println(" 6) setNum ");
          System.out.println(" 7) Sortir ");
	}
	
	
		
	public static void main (String[] args) {
		System.out.println("Driver Distribucio");
		System.out.println("Introdueix un numero de distribució, el número d'ubicacions que hi ha i el número de prestatges de la llibreria)");
		Scanner in = new Scanner(System.in);
		Distribucio dis = new Distribucio(in.nextInt(), in.nextInt(), in.nextInt());
		System.out.println("Afegeix la ubicacio(x, y):");
		nodo no = new nodo(in.nextInt(), in.nextInt());
		
		System.out.print("Introdueix una ISBN(int): ");
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
		Llibre lli = new Llibre(id, titol, autor, edi, any, cat);
		Assignacio ass = new Assignacio(lli, no);
		dis.afegirAssignacio(ass);
		
		boolean surt = false;
		
		while(!surt){
			menu();
			in = new Scanner(System.in);
			
			switch (in.nextInt()) {
			
				case 1: 
				
					System.out.println("Introdueix la nova assignacio: ");
					System.out.println("Afegeix la ubicacio(x, y):");
					nodo no1 = new nodo(in.nextInt(), in.nextInt());
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
					Llibre lli1 = new Llibre(id, titol, autor, edi, any, cat);
					Assignacio ass1 = new Assignacio(lli1, no1);
					dis.afegirAssignacio(ass1);
					break;
			
				case 2: 
					dis.mostrarDistribucio();
					break;
				
					
				case 3: 
					System.out.println("edita assignacions");
					System.out.println("Afegeix la ubicacio(x, y):");
					nodo no2 = new nodo(in.nextInt(), in.nextInt());
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
					Llibre lli2 = new Llibre(id, titol, autor, edi, any, cat);
				
					Assignacio ass2 = new Assignacio(lli2, no2);
					System.out.println("Afegeix la ubicacio de la 2(x, y):");
					nodo no3 = new nodo(in.nextInt(), in.nextInt());
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
					Llibre lli3 = new Llibre(id, titol, autor, edi, any, cat);
					Assignacio ass3 = new Assignacio(lli3, no3);
					dis.afegirAssignacio(ass2);
					dis.afegirAssignacio(ass3);
					dis.editarAssignacions(ass2, ass3);
				
					break;
				
					
				case 4: 
					System.out.println("Introdueix el isbn del llibre:");
					Assignacio as = dis.consultarAssignacio(in.nextInt());
					System.out.println(as.getLlibre().getId());
					System.out.println(as.getLlibre().getTitol());
					System.out.println(as.getLlibre().getAutor());
					System.out.print(as.getNodo().getX() + " ");
					System.out.println(as.getNodo().getY());
					
					
					break;	
					
				case 5: 
					System.out.println(dis.getNum());
					break;
					
				case 6: 

					System.out.println("Introdueix el numero de distribucio:");
					dis.setNum(in.nextInt());;
					break; 
					
				case 7: 
					surt = true;
					break;
			}			
		}
	       
	     
		in.close();
	
	}
}
