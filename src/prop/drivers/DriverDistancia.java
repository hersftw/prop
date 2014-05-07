package prop.drivers;

import prop.domini.Distancia;

import java.util.*;



public class DriverDistancia {
	
	private static void menu() {
		System.out.println("Escull una opció:/n");
		System.out.println("1. Get Numero de files");
		System.out.println("2. Set Numero de files");
		System.out.println("3. Get Numero de columnes");
		System.out.println("4. Set Numero de columnes");
		System.out.println("5. Get Numero de posicions");
		System.out.println("6. Set Numero posicions");
		System.out.println("7. Set Distancia");
		System.out.println("8. Get Distancia");
		System.out.println("9. Sortir");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Driver Distancia");
		System.out.println("Introdueix un Numero de files (int), un numero de columnes (int) i un numero de posicions (int)");
		Scanner in = new Scanner(System.in);
		Distancia dist = new Distancia(in.nextInt(), in.nextInt(), in.nextInt());
		boolean sortir = false;
		
		while(!sortir){
			menu();
			in = new Scanner(System.in);
			
			switch (in.nextInt()) {
			
				case 1: 
					System.out.println(dist.getNumeroFilas());
					break;
				
					
				case 2: 
					System.out.println("Introdueix el nou Numero de Files (int):");
					in = new Scanner(System.in);
					dist.setNumeroFilas(in.nextInt());
					break;
				
					
				case 3: 
					System.out.println(dist.getNumeroColumnas());
					break;
					
				case 4: 
					System.out.println("Introdueix el nou numero de columnes:");
					in = new Scanner(System.in);
					dist.setNumeroColumnas(in.nextInt());
					break; 
					
				case 5: 
					System.out.println(dist.getNumeroPosiciones());
					break;
					
				case 6: 
					System.out.println("Introdueix el nou numero de posicions:");
					in = new Scanner(System.in);
					dist.setNumeroPosiciones(in.nextInt());
					break; 
					
				case 7: 
					System.out.println("Introdueix les dues posicions (int) i la distania entre elles(int):");
					in = new Scanner(System.in);
					dist.setDistanciaMatriz(in.nextInt(),in.nextInt(), in.nextInt());
					break; 
				
				case 8: 
					System.out.println("Introdueix les dues posicions (int):");
					System.out.println(dist.getDistanciaMatriz(in.nextInt(), in.nextInt()));
					break;
				case 9: 
					sortir = true;
					break;
			}			
		}
	}
}
