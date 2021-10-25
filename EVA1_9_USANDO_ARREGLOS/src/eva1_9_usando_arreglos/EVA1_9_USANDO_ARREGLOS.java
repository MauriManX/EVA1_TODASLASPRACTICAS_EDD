/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_usando_arreglos;

/**
 *
 * @author Mauricio
 */
public class EVA1_9_USANDO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1. Un arreglo de enteros
        int[] aiDatos = new int[10];
        //2. Llenarlo con valores
        //Arreglo: Estructura de acceso aleatorio
        //Acceso a los valores:
        for(int i = 0;i<10;i++){
            //Casting ---> Se convierten doubles en enteros
        aiDatos[i] = (int)(Math.random()*100); // Random ---> Valores ente 0.0 y 1.0 * 100 (Valores entre 0 y 100)
        
    }
        //3. Imprimir los valores
        for(int i = 0;i<10;i++){
            System.out.print("["+aiDatos[i]+"]");
    }
    }
    
}
