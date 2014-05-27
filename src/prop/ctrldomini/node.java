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
public class node {
    Vector<Integer> teclasPendientes; // Vector de assignaciones pendientes de la solucion
    int [] teclasAssignadas;          // Vector de assignaciones realizadas de la solucion
    double cost;                      // Coste de la solucion
    
   
    /**
     * Constructora completa 
     * @param teclasPendientes Vector de assignaciones pendientes 
     * @param teclasAssignadas Vector de assignaciones realizadas
     * @param cost Coste de la solucion
     */
    public node(Vector<Integer> teclasPendientes,int[] teclasAssignadas,double cost) {
        this.teclasPendientes = teclasPendientes;
        this.teclasAssignadas = teclasAssignadas;
        this.cost = cost;
        
    }
    /**
     * Metodo que hace una copia del node que se pasa por parametro
     * @param b Node que queremos copiar
     */
    public node(node b) {
        this.teclasPendientes = b.teclasPendientes;
        this.teclasAssignadas = b.teclasAssignadas;
        this.cost = b.cost;
    }
    /**
     * Metodo que devuelve un vector de las teclas pendientes de assignar
     * @return vector con las teclas pendientes de realizar
     */
    public Vector<Integer> getTeclasPendientes(){
        Vector<Integer> aux = new Vector<Integer>(teclasPendientes.size());
        for(int i=0; i < teclasPendientes.size();++i) aux.add(teclasPendientes.get(i));
        return aux;
    }
    /**
     * Metodo que devuelve un vector de las teclas assignadas 
     * @return un vector de las teclas assignadas 
     */
    public int[] getTeclasAssginadas() {
        int[] aux = new int[teclasAssignadas.length];
        for(int i=0; i < teclasAssignadas.length;++i) {
            aux[i] = teclasAssignadas[i];
        }
        return aux;
    }
    /**
     * Metodo para cambiar el coste del node por el valor del parametro
     * @param n Valor del coste
     */
    public void modificarCost(int n) {
        cost = n;
    }
   
}
