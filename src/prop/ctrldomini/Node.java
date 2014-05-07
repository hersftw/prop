package prop.ctrldomini;
import java.util.ArrayList;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author alex
 */
public class Node {
    Vector<Integer> teclasPendientes;
    int [] teclasAssignadas;
    double cost;
    int etapa = 0;
    
   
    public Node(Vector<Integer> teclasPendientes,int[] teclasAssignadas,double cost) {
        this.teclasPendientes = teclasPendientes;
        this.teclasAssignadas = teclasAssignadas;
        this.cost = cost;
        
    }
    public Node(Node b) {
        this.teclasPendientes = b.teclasPendientes;
        this.teclasAssignadas = b.teclasAssignadas;
        this.cost = b.cost;
    }
    public Vector<Integer> getTeclasPendientes(){
        Vector<Integer> aux = new Vector<Integer>(teclasPendientes.size());
        for(int i=0; i < teclasPendientes.size();++i) aux.add(teclasPendientes.get(i));
        return aux;
    }
    public int[] getTeclasAssginadas() {
        int[] aux = new int[teclasAssignadas.length];
        for(int i=0; i < teclasAssignadas.length;++i) {
            aux[i] = teclasAssignadas[i];
        }
        return aux;
    }
    public void modificarCost(int n) {
        cost = n;
    }
   
}
