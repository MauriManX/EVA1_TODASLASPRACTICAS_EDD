/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_copia_arreglos;

/**
 *
 * @author Mauricio
 */
public class EVA1_14_COPIA_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aiArreglo = new int[3];
        System.out.println("Dirección de aiArreglo = " + aiArreglo);
        aiArreglo[0] = 1000;
        aiArreglo[1] = 2000;
        aiArreglo[2] = 3000;
        
        for (int i =0; i < aiArreglo.length;i++){
            System.out.println("Cuenta "+ i +" = $"+ aiArreglo[i]);
    }
    //Quiero una copua de los datos del arreglo
    /*int[] aiCopia = aiArreglo;
    aiCopia[0]=99999999;
    
        for (int i =0; i < aiArreglo.length;i++){
            System.out.println("Cuenta "+ i +" = $"+ aiArreglo[i]);
    }*/
    int[] aiCopia = new int[3];
    System.out.println("Dirección de aiArreglo = " + aiCopia);
    for(int i=0; i<aiArreglo.length; i++){
        aiCopia[i] = aiArreglo[i];
    }
    aiCopia[0]=999999;
    for (int i =0; i < aiArreglo.length;i++){
            System.out.println("Cuenta "+ i +" = $"+ aiArreglo[i]);
    }
    for (int i =0; i < aiCopia.length;i++){
            System.out.println("Cuenta "+ i +" = $"+ aiCopia[i]);
    }
}
}
