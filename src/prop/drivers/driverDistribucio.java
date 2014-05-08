package prop.drivers;


import prop.domini.Distribucio;
import prop.domini.Llibre;
import prop.domini.nodo;
import prop.domini.Assignacio;

import java.util.*;

public class driverDistribucio {
	
	private static void menu() {
		  System.out.println("Escull una opci�:");
          System.out.println(" 1) Afegir Assignaci� ");
          System.out.println(" 2) Mostrar Distribuci� ");
          System.out.println(" 3) Editar Assignacions ");
          System.out.println(" 4) getNum /n");
          System.out.println(" 5) setNum /n");
          System.out.println(" 6) Sortir /n");
	}
	
	
		
	public static void main (String[] args) {
		System.out.println("Driver Distribucio");
		System.out.println("Introdueix un numero de distribuci�, el n�mero d'ubicacions que hi ha i el n�mero de prestatges de la llibreria)");
		Scanner in = new Scanner(System.in);
		Distribucio dis = new Distribucio(in.nextInt(), in.nextInt(), in.nextInt());
		System.out.println("Afegeix la ubicacio(x, y):");
		nodo no = new nodo(in.nextInt(), in.nextInt());
		System.out.println("Afegeix les dades del llibre(ISBN, Titol, Autor, Editorial, Any, Categoria :");
		Llibre lli = new Llibre(in.nextInt(), in.next(), in.next(), in.next(), in.nextInt(), in.next());
		Assignacio ass = new Assignacio(lli, no);
		dis.AfegirAssignacio(ass);
		
		boolean surt = false;
		
		while(!surt){
			menu();
			in = new Scanner(System.in);
			
			switch (in.nextInt()) {
			
				case 1: 
				
					System.out.println("Introdueix la nova assignacio: ");
					System.out.println("Afegeix la ubicacio(x, y):");
					nodo no1 = new nodo(in.nextInt(), in.nextInt());
					System.out.println("Afegeix les dades del llibre(ISBN, Titol, Autor, Editorial, Any, Categoria :");
					Llibre lli1 = new Llibre(in.nextInt(), in.next(), in.next(), in.next(), in.nextInt(), in.next());
					Assignacio ass1 = new Assignacio(lli1, no1);
					dis.AfegirAssignacio(ass1);
					break;
			
				case 2: 
					dis.mostrarDistribucio();
					break;
				
					
				case 3: 
					System.out.println("edita assignacions");
					System.out.println("Afegeix la ubicacio(x, y):");
					nodo no2 = new nodo(in.nextInt(), in.nextInt());
					System.out.println("Afegeix les dades del llibre(ISBN, Titol, Autor, Editorial, Any, Categoria :");
					Llibre lli2 = new Llibre(in.nextInt(), in.next(), in.next(), in.next(), in.nextInt(), in.next());
					Assignacio ass2 = new Assignacio(lli2, no2);
					System.out.println("Afegeix la ubicacio de la 2(x, y):");
					nodo no3 = new nodo(in.nextInt(), in.nextInt());
					System.out.println("Afegeix les dades del llibre 2(ISBN, Titol, Autor, Editorial, Any, Categoria :");

					Llibre lli3 = new Llibre(in.nextInt(), in.next(), in.next(), in.next(), in.nextInt(), in.next());
					Assignacio ass3 = new Assignacio(lli3, no3);
					dis.AfegirAssignacio(ass2);
					dis.AfegirAssignacio(ass3);
					dis.editarAssignacions(ass2, ass3);
				
					break;
				
					
				case 4: 
					System.out.println(dis.getNum());
					break;
					
				case 5: 

					System.out.println("Introdueix el numero de distribucio:");
					dis.setNum(in.nextInt());;
					break; 
					
				case 6: 
					surt = true;
					break;
			}			
		}
	       
	     
		in.close();
	
	}
}
