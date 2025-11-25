/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Graforecursivo;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        GrafoRecursivo grafo = new GrafoRecursivo(4);
        
        
            grafo.insertarNodo('A');
            grafo.insertarNodo('B');
            grafo.insertarNodo('C');
            grafo.insertarNodo('D');
        
            grafo.conectar(0,1);
            grafo.conectar(0, 2);
            grafo.conectar(2,3);
            grafo.conectar(2,3);
            
            System.out.println("Recorrido depthfirst search (DFS) desde el nodo A");
            
            grafo.dfs(0);
            
            
            
            
    } 
    
}
