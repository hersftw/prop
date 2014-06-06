package prop.ctrldomini;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Vector;
import java.util.Random;

/**
 *
 * @author alejandro.del.amo.gonzalez
 */
public class branchBoundCota {
    
    private PriorityQueue<node> nodes; //Cua de prioritat ordenada de forma ascendent
    private int mida;                 // mida de la solucio
    private double[][] estadistica;      // matriu de flux
    private double[][] distancia;        // matriu de distancia
    public  node mejorSolucion;       // Node amb la millor solucio 
    double  mejorCost;                // Millor cost fins al moment
    GLB cota;
    
    /**
     * Constructora per defecte
     * @param mida mida de la solucio
     */
    public branchBoundCota(int mida) {
        mejorCost = Integer.MAX_VALUE;
        double coste = 0;
        int h[] = new int [mida];
        Vector<Integer> v  = new Vector<Integer> ();
        mejorSolucion = new node(v,h,coste);
        nodes = new PriorityQueue<node> (1,new nodeComparador());
        nodes.add(mejorSolucion);
        cota = new GLB();
    }
    
    /**
     * Constructora de la clase BranchBound
     * @param estadistica Matriu de fluxe o de similitud 
     * @param distancia Matriu de distancia 
     */
    public branchBoundCota(double[][] estadistica, double[][] distancia) {
        this.mida = estadistica.length;
        this.distancia = distancia;
        this.estadistica = estadistica;
        cota = new GLB();
        mejorCost = Integer.MAX_VALUE;  // Millor cost = infinit
        double coste = 0;
        int h[] = new int [mida];
        Vector<Integer> v = new Vector<Integer> (estadistica[0].length);
        mejorSolucion = new node (v,h,0);
        anadirPendientes();
        nodes = new PriorityQueue<> (1,new nodeComparador());
        nodes.add(mejorSolucion);
        greedy();
        solve();
    }
    
    /**
     * Omple el vector de assignacions pendents
     */
    public void anadirPendientes(){
        for(int i=0; i < estadistica.length; ++i) {
            mejorSolucion.teclasPendientes.add(i);
            
        }
    }

    /**
     * Calcula el cost de el vector de assignacion de un possible solució
     * @param b Vector de assignacion de un node
     * @param n Posició de la assignacio realitzada
     * @param cost Cost de haber fet una assignacio
     * @return Retorna el cost total del node 
     */
    public double calcularCost(int [] b, int n,double cost) {
        for(int i=0; i < n;++i) {
            cost += estadistica[b[i]][b[n]]*distancia[i][n];
            cost += estadistica[b[n]][b[i]]*distancia[n][i];
        }
        return cost;
    }

    /**
     * Metode que calcula la primera branca del Branch & Bound
     */
    public void greedy2() {
       mejorCost = 0;
       Vector<Integer> p = new Vector<Integer> ();
       int s[] = new int [mida];
       for(int i=0; i < mida; ++i) {
           s[i] = i;
           System.out.println("Valor de la i :"+ s[i]+" posicion  "+i);
       }
       for(int i=0; i < mida; ++i) {
           for(int j=0; j < mida; ++j) {
               mejorCost += estadistica[i][j]* distancia[s[i]][s[j]];
           }
       }
       mejorSolucion = new node(p,s,mejorCost);
       System.out.println("El mejor coste es :"+ mejorCost);
    }

    /** 
     *  Metode que calcula de forma aleatoria una possible solució i el seu cost
     */
    public void greedy() {
        double costeParcial = 0;
        for(int j =0; j < 3; ++j) {
            costeParcial=0;
            Vector<Integer> p = new Vector<Integer> ();
            for(int i=0; i< mida;++i) {
                p.add(i);
            }
            int s[] = new int [mida];
            int i=0;
            while(!p.isEmpty()) {
                Random randomGenerator = new Random();
                int n = randomGenerator.nextInt(p.size());
                s[i] = p.get(n);
                p.remove(n);
                ++i;
            }
            for(int n=0; n < mida; ++n){
                for(int m=0; m < mida;++m) {
                    costeParcial += estadistica[n][m]* distancia[s[n]][s[m]];
                }
            }
            if(costeParcial < mejorCost) {
                mejorCost = costeParcial;
                mejorSolucion = new node(p,s,mejorCost);
            }
        }
        
        
        
        
    }
    
    /**
     * Metode per comprobar si una possible solucio 
     * @param a Cost de una solucio
     * @return true, si es una possible solucio i false, si no ho es
     */
    public boolean esMejor(double a) {
        if(a <= mejorCost) return true;
        else return false; 
    }
        
    /**
     * Metode principal de BranchBound
     */
    public void solve()  {
        node a = nodes.peek();
        while(!nodes.isEmpty()){
            node b = nodes.poll();                          // Saca un node 
            Vector<Integer> v1 = b.getTeclasPendientes();    
            if(esMejor(b.cost)) {
                if(v1.isEmpty()) {
                    mejorSolucion = b;
                    mejorCost = b.cost;
                }          
                else {
                    for(int i=0; i < v1.size(); ++i) {
                            int aux [] = b.getTeclasAssginadas();  // Copia las assignaciones realizadas del padre
                            Vector<Integer> h1 = new Vector<Integer>();
                            for(int m = 0; m < v1.size();++m) h1.add(v1.get(m));  //Copia las assignaciones pendientes del padre
                            h1.remove(i);
                            int pos = mida-v1.size();
		            aux[pos] = v1.get(i);
                            double x = calcularCost(aux,pos,b.cost); // Calcula el coste del nodo     
                            node c = new node(h1,aux,x);                          
                            if(esMejor(c.cost)) {
                                if(v1.isEmpty()) {
                                    mejorSolucion = b;
                                    mejorCost = b.cost;
                                }          
                                else nodes.add(c);
                                    
                            }                               
                    }
                }

            }
        }
  
    }
    
    /**
     *
     * @param a
     * @return
     */
    public boolean esSolucion(ArrayList<Integer> a) {
        System.out.println ("Sale");
        return (a.size() == (estadistica.length-1));   
    }   
}