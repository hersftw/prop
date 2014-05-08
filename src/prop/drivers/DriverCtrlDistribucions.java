package prop.drivers;

import java.util.Scanner;

import prop.ctrldomini.CtrlDistribucions;
import prop.domini.Assignacio;
import prop.domini.Distribucio;
import prop.domini.Llibre;
import prop.domini.Nodo;

public class DriverCtrlDistribucions {
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
		CtrlDistribucions ctrldis = new CtrlDistribucions();
		ctrldis.inicialitzarDistribucions();		
		System.out.println("Introdueix un numero de distribució, el número d'ubicacions que hi ha i el número de prestatges de la llibreria)");
		Scanner in = new Scanner(System.in);
		Distribucio dis = new Distribucio(in.nextInt(), in.nextInt(), in.nextInt());
		System.out.println("Afegeix la ubicacio(x, y):");
		Nodo no = new Nodo(in.nextInt(), in.nextInt());
		
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
		ctrldis.afegirDistribucio(dis);
		
		boolean surt = false;
		
		while(!surt){
			menu();
			in = new Scanner(System.in);
			
			switch (in.nextInt()) {
			
				case 1: 
					System.out.println("Introdueix un numero de distribució, el número d'ubicacions que hi ha i el número de prestatges de la llibreria)");
		
					dis = new Distribucio(in.nextInt(), in.nextInt(), in.nextInt());
					System.out.println("Introdueix el numero de la nova Distribució: ");
					
					System.out.println("Afegeix la ubicacio(x, y):");
					Nodo no1 = new Nodo(in.nextInt(), in.nextInt());
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
					/*System.out.println("edita assignacions");
					System.out.println("Afegeix la ubicacio(x, y):");
					Nodo no2 = new Nodo(in.nextInt(), in.nextInt());
					System.out.println("Afegeix les dades del llibre(ISBN, Titol, Autor, Editorial, Any, Categoria :");
					Llibre lli2 = new Llibre(in.nextInt(), in.next(), in.next(), in.next(), in.nextInt(), in.next());
					Assignacio ass2 = new Assignacio(lli2, no2);
					System.out.println("Afegeix la ubicacio de la 2(x, y):");
					Nodo no3 = new Nodo(in.nextInt(), in.nextInt());
					System.out.println("Afegeix les dades del llibre 2(ISBN, Titol, Autor, Editorial, Any, Categoria :");

					Llibre lli3 = new Llibre(in.nextInt(), in.next(), in.next(), in.next(), in.nextInt(), in.next());
					Assignacio ass3 = new Assignacio(lli3, no3);
					dis.afegirAssignacio(ass2);
					dis.afegirAssignacio(ass3);
					ctrldis.add(dis);
					dis.editarAssignacions(ass2, ass3);*/
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
	

