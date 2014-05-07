package prop.drivers;


import prop.domini.Distribucio;

import java.util.*;

public class driverDistribucio {
	
	private static void menu() {
		  System.out.println("Escull una opció:");
          System.out.println(" 1) Afegir Assignació ");
          System.out.println(" 2) Mostrar Distribució ");
          System.out.println(" 3) Editar Assignacions ");
          System.out.println(" 4) getNum /n");
          System.out.println(" 5) setNum /n");
          System.out.println(" 6) Sortir /n");
	}
	
	
		
	public static void main (String[] args) {
		System.out.println("Driver Distribucio");
		System.out.println("Introdueix un numero de distribució, el número d'ubicacions que hi ha i el número de prestatges de la llibreria)");
		Scanner in = new Scanner(System.in);
		Distribucio dis = new Distribucio(in.nextInt(), in.nextInt(), in.nextInt());
		boolean surt = false;
		
		while(!surt){
			menu();
			in = new Scanner(System.in);
			
			switch (in.nextInt()) {
			
				case 1: 
					System.out.println("Introdueix la nova assignacio: ");
					//System.out.println(dis.AfegirAssignacio(in.nextInt()));
					break;
			
				case 2: 
					dis.mostrarDistribucio();
					break;
				
					
				case 3: 
					System.out.println("edita assignacions");
					//dis.editarAssignacions(in.nextInt());
					break;
				
					
				case 4: 
					System.out.println(dis.getNum());
					break;
					
				case 5: 
					System.out.println("Introdueix el numero de distribucio:");
					in = new Scanner(System.in);
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
