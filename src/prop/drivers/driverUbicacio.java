package prop.drivers;

import java.io.IOException;
import java.util.Scanner;

import prop.domini.Nodo;

public class driverUbicacio {
	public static void main(String[] args) throws IOException {
		
		System.out.print("Introdueix les coordenades x i y del node:");
	    Scanner in= new Scanner(System.in);
	    int x = in.nextInt();
	    int y = in.nextInt();
	    in.close();
	    Nodo n = new Nodo(x, y);
	    if (n.getX() != x) System.out.print("Error GetX");
	    if (n.getY() != y) System.out.print("Error GetY");
	    
	}
}
