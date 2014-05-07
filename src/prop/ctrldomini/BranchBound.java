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
public class BranchBound {
    private PriorityQueue<Node> nodes;
    private int mida;
    private int[][] estadistica;
    private int[][] distancia;
    public  Node mejorSolucion;
    private Node solucionParcial;
    public double  mejorCost;
    
    public BranchBound(int mida) {
        mejorCost = Integer.MAX_VALUE;
        double coste = 0;
        int h[] = new int [mida];
        Vector<Integer> v  = new Vector<Integer> ();
        mejorSolucion = new Node(v,h,coste);
        nodes = new PriorityQueue<Node> (1,new NodeComparador());
        nodes.add(mejorSolucion);
    }
    
    public BranchBound(int[][] estadistica, int[][] distancia) {
        this.mida = estadistica.length;
        this.distancia = distancia;
        this.estadistica = estadistica;
        mejorCost = Integer.MAX_VALUE;
        double coste = 0;
        int h[] = new int [mida];
        Vector<Integer> v = new Vector<Integer> (estadistica[0].length);
        mejorSolucion = new Node (v,h,0);
        anadirPendientes();
        System.out.println ("Mida teclas Pendientes"+ mejorSolucion.teclasPendientes.size());
        nodes = new PriorityQueue<> (1,new NodeComparador());
        nodes.add(mejorSolucion);
        greedy2();
        solve();

        
    }
    
    public void anadirPendientes(){
        for(int i=0; i < estadistica.length; ++i) {
            mejorSolucion.teclasPendientes.add(i);
            
        }
    }
    public double calcularCost(int [] b, int n,double cost) {
        for(int i=0; i < n;++i) {
            cost += estadistica[b[i]][b[n]]*distancia[i][n];
            cost += estadistica[b[n]][b[i]]*distancia[n][i];
        }
        return cost;
    }
    public void greedy() {
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
       mejorSolucion = new Node(p,s,mejorCost);
       System.out.println("El mejor coste es :"+ mejorCost);
    }
    public void greedy2() {
        double costeParcial = 0;
        for(int j =0; j < 3; ++j) {
            costeParcial=0;
            Vector<Integer> p = new Vector<Integer> ();
            for(int i=0; i< mida;++i) {
                p.add(i);
                System.out.print("Pendientes "+p.get(i));
            }
            System.out.println ("");
            int s[] = new int [mida];
            int i=0;
            while(!p.isEmpty()) {
                Random randomGenerator = new Random();
                int n = randomGenerator.nextInt(p.size());
                System.out.print ("Valor random"+n);
                System.out.print(" Valor de en el vector "+ n);
                s[i] = p.get(n);
                System.out.println ("");
                System.out.println("Valor de s[i]"+s[i]);
                p.remove(n);
                ++i;
            }
            System.out.println ("");
            for(int n=0; n < mida; ++n){
                for(int m=0; m < mida;++m) {
                    costeParcial += estadistica[n][m]* distancia[s[n]][s[m]];
                }
            }
            if(costeParcial < mejorCost) {
                System.out.println("CosteParcial "+costeParcial);
                mejorCost = costeParcial;
                mejorSolucion = new Node(p,s,mejorCost);
            }
        }
        
        
        
        
    }
    
    
    public boolean esMejor(double a) {
        System.out.println ("Entro esMejor");
        if(a <= mejorCost) return true;
        else return false; 
    }
        
    public void solve()  {
        Node a = nodes.peek();
        while(!nodes.isEmpty()){
            Node b = nodes.poll();
            System.out.println("Teclas asignadas");
            for (int k = 0; k < b.teclasAssignadas.length; k++) {
                 System.out.print(b.teclasAssignadas[k] + " ");
            }
            System.out.println("");
            System.out.println("Coste del nodo : "+ b.cost);
            Vector<Integer> v1 = b.getTeclasPendientes();
            if(esMejor(b.cost)) {
                if(v1.isEmpty()) {
                    System.out.print("ES UNA SOLUCION : ");
                    for (int i = 0; i < b.teclasAssignadas.length; i++) {
                    System.out.print(b.teclasAssignadas[i] + " ");
                    }
                    System.out.println("");
                    mejorSolucion = b;
                    mejorCost = b.cost;
                }          
                else {
                    System.out.println ("Else");
                    for(int i=0; i < v1.size(); ++i) {
                            int aux [] = b.getTeclasAssginadas();
                            System.out.println("Teclas asignadas del padre:");
                            for (int k = 0; k < aux.length; k++) {
                                  System.out.print( aux[k] + " ");
                            }
                            System.out.println("");
                            System.out.println("  Numero de teclas asignadas "+ aux.length);
                            System.out.println("Teclas Pendientes del padre : ");
                            for (int k = 0; k < v1.size(); k++) {
                                  System.out.print( v1.get(k) + " ");
                            }
                            System.out.println("");
                            System.out.println(" Numero de teclas Pendientes "+ v1.size());
                            
                            aux[mida-v1.size()] = v1.get(i);
                            System.out.println ("La tecla asignada es: "+ v1.get(i));
                            System.out.println("Teclas asignadas: " );
                            for (int k = 0; k < aux.length; k++) {
                                  System.out.print(aux[k] + " ");
                            }
                            System.out.println("");
                            Vector<Integer> h1 = new Vector<Integer>();
                            for(int m = 0; m < v1.size();++m) h1.add(v1.get(m));
                            h1.remove(i);
                            System.out.println("Teclas pendientes: ");
                            for (int m = 0; m < h1.size(); m++) {
                                  System.out.print(h1.get(m)+ " ");
                            }
                            System.out.println("");
                            System.out.println ("Calculo coste");
                            int pos = mida-v1.size();
                            double x = calcularCost(aux,pos,b.cost);
                            System.out.println ("El coste es: "+ x);
                            Node c = new Node(h1,aux,x);                          
                            if(esMejor(c.cost)) {
                                if(v1.isEmpty()) {
                                     System.out.print("ES UNA SOLUCION : ");
                                    for (int k = 0; k < b.teclasAssignadas.length; k++) {
                                         System.out.print(b.teclasAssignadas[k] + " ");
                                    }
                                    System.out.println("");
                                    mejorSolucion = b;
                                    mejorCost = b.cost;
                                }          
                                else {
                                    nodes.add(c);
                                    System.out.println("lo vuelvo a poner, Coste nodo : "+ c.cost+" Coste mejor "+mejorCost);
                            }   }
                            
                //            for (int k = 0; k < b.teclasAssignadas.size(); k++) {
               //                  System.out.print(b.teclasAssignadas.get(k) + " ");
               //             }
               //             System.out.println("");
                     
                    }
                }

            }
        }
  
    }
    


    public boolean esSolucion(ArrayList<Integer> a) {
        System.out.println ("Sale");
        return (a.size() == (estadistica.length-1));
        
    }

    


    
}
    
    
    
    
    
    
    

