package prop.drivers;

import java.util.Scanner;

import prop.ctrldomini.ctrlDistribucions;
import prop.domini.assignacio;
import prop.domini.distribucio;
import prop.domini.llibre;
import prop.domini.nodo;

public class driverCtrlDistribucions {
	private static void menu() {
		System.out.println("Escull una opció:");
        System.out.println(" 1) Afegir Distribució ");
        System.out.println(" 2) Consulta Distribució ");
        System.out.println(" 3) Esborra Distribució ");
        System.out.println(" 4) Modifica Distribució ");

        System.out.println(" 5) Sortir ");
	}
	
	
	public static void main (String[] args) {
		
		System.out.println("Driver CtrlDistribucio");
		ctrlDistribucions ctrldis = new ctrlDistribucions();
		ctrldis.inicialitzarDistribucions();		
		System.out.println("Introdueix el número d'ubicacions que hi ha i el número de prestatges de la llibreria)");
		Scanner in = new Scanner(System.in);
		int numllibres = in.nextInt();
		distribucio dis = new distribucio(0, numllibres, in.nextInt());
		for(int i = 0; i < numllibres; ++i) {
			System.out.println("Introdueix les dades de la seguent ubicacio");
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
		llibre lli = new llibre(id, titol, autor, edi, any, cat);
		assignacio ass = new assignacio(lli, no);
		dis.afegirAssignacio(ass);
		
		}
		ctrldis.afegirDistribucio(dis);
		
		boolean surt = false;
		
		while(!surt){
			menu();
			in = new Scanner(System.in);
			
			switch (in.nextInt()) {
			
				case 1: 
					System.out.println("Introdueix  el número d'ubicacions que hi ha i el número de prestatges de la llibreria)");
					 numllibres = in.nextInt();
					dis = new distribucio(0, numllibres, in.nextInt());
				
					for(int i = 0; i < numllibres; ++i) {
						System.out.println("Introdueix les dades de la seguent ubicacio");
					System.out.println("Afegeix la ubicacio(x, y):");
					nodo no1 = new nodo(in.nextInt(), in.nextInt());
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
					llibre lli1 = new llibre(id, titol, autor, edi, any, cat);
					assignacio ass1 = new assignacio(lli1, no1);
					dis.afegirAssignacio(ass1);
					
					}
					ctrldis.afegirDistribucio(dis);
					
					break;
			
				case 2: 
					
					System.out.print("Introdueix el num de la distribucio:");
					ctrldis.consultarDistribucio(in.nextInt());
					
					
					
					break;	
					
					
				case 3:
					
					System.out.print("Introdueix el num de la distribucio a eliminar:");
					ctrldis.deleteDistribucio(in.nextInt());
					
					break;
				case 4: 
				
					System.out.print("Introdueix numero (int): ");
					int numero = in.nextInt();
					System.out.print("Introdueix isbn llibre1 (int): ");
					int isbn1 = in.nextInt();
					System.out.print("Introdueix isbn llibre2 (int): ");
					int isbn2 = in.nextInt();
					ctrldis.modificarDistribucio(numero, isbn1, isbn2);
					
					break;
				
					
	
					
				
					
				case 5: 
					surt = true;
					break;
			}			
		}
	       
	     
		in.close();
	
	}
	}
	

