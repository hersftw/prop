/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prop.domini;

/**
 *
 * @author gabriel
 */
public class Distancia {
    
//  Atributos 
    private int matrizDistancias[][];
    private int numeroFilas;
    private int numeroColumnas;
    private int numeroPosiciones;
//  Metodos    

    /** Creadora por defecto de distancia
     *
     */
        public Distancia() {}
    
    /**
     * distancia.   Creadora de la matriz de distancias con nF filas y nC columnas
     * @param nF:   numero de filas de la matriz
     * @param nC:   numero de columnas de la matriz
     * @param nP:   numero de posiciones de la matriz
     */
    public Distancia(int nF, int nC, int nP){
		matrizDistancias = new int[nP][nP];
        setNumeroFilas(nF);
        setNumeroColumnas(nC);
        setNumeroPosiciones(nP);
    }
    
    
    /**
     * setNumeroFilas.  Asigna el numero de filas de la matriz
     * @param nF        numero de filas de la matriz
     */
    public void setNumeroFilas(int nF) {
	if (nF < 0) {
            throw new IllegalArgumentException("Error al asignar las filas: numeroFilas < 0");
        }
        numeroFilas = nF;
    }
    
    
    /**
     * getNumeroFilas.	Obtiene el numero de filas de la matriz
     * @return:		Devuelve el numero de filas de la matriz
     */
    public int getNumeroFilas() {
        return numeroFilas;
    }
    
    
        /**
     * setNumeroColumnas.   Asigna el numero de columnas de la matriz
     * @param nC            numero de columnas de la matriz
     */
    public void setNumeroColumnas(int nC) {
	if (nC < 0) {
            throw new IllegalArgumentException("Error al asignar las columnas: numeroColumnas < 0");
        }
        numeroColumnas = nC;
    }
    
    
    /**
     * getNumeroColumnas.   Obtiene el numero de columnas de la matriz
     * @return:             Devuelve el numero de columnas de la matriz
     */
    public int getNumeroColumnas() {
        return numeroColumnas;
    }
    
    
    /**
     * setNumeroPosiciones. Asigna el numero de posiciones de la matriz
     * @param nP            numero de posiciones de la matriz
     */
    public void setNumeroPosiciones(int nP) {
	if (nP < 0 || nP > getNumeroFilas()*getNumeroColumnas()) {
            throw new IllegalArgumentException("Error al asignar las posiciones: numeroPosiciones < 0 || numeroPosiciones > numeroFilas*numeroColumnas");
        }
        numeroPosiciones = nP;
    }
    
    
    /**
     * getNumeroPosiciones. Obtiene el numero de posiciones de la matriz
     * @return		    Devuelve el numero de posiciones de la matriz
     */
    public int getNumeroPosiciones() {
        return numeroPosiciones;
    }
    
    /**
     * setDistanciaMatriz.  Asigna una distancia entre dos posiciones a la matriz de distancias
     * @param posicionA:    posicion A de la matriz
     * @param posicionB:    posicion B de la matriz
     * @param distancia:    distancia entre las posiciones
     */
    public void setDistanciaMatriz(int posicionA, int posicionB, int distancia) {
	if (posicionA < 0) {
            throw new IllegalArgumentException("Error al asignar la posicionA: posicionA < 0");
        }
	if (posicionA > (getNumeroPosiciones() - 1)) {
            throw new IllegalArgumentException("Error al asignar la posicionA: posicionA > numeroPosiciones");
        }
        if (posicionB < 0) {
            throw new IllegalArgumentException("Error al asignar la posicionB: posicionB < 0");
        }
	if (posicionB > (getNumeroPosiciones() - 1)) {
            throw new IllegalArgumentException("Error al asignar la posicionB: posicionB > numeroPosiciones");
        }
	if (distancia < 0) {
            throw new IllegalArgumentException("Error al asignar la distancia: distancia < 0");
        }
        matrizDistancias[posicionA][posicionB] = distancia;
	matrizDistancias[posicionB][posicionA] = distancia;
    }
    
    /**
     * getDistanciaMatriz.  Obtiene la distancia entre dos posiciones de la matriz de distancias
     * @param posicionA:    posicion A de la matriz
     * @param posicionB:    posicion B de la matriz
     * @return		    Devielve la distancia entre dos posiciones de la matriz de distancias
     */
    public int getDistanciaMatriz(int posicionA, int posicionB) {
	return matrizDistancias[posicionA][posicionB];
    }

}
