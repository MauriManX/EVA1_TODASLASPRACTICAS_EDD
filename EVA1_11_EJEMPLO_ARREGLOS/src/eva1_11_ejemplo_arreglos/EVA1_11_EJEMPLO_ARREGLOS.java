/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_ejemplo_arreglos;

import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class EVA1_11_EJEMPLO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Primero se pregunta el tamaño del grupo: 
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe el tamaño del grupo");
        int iTama = input.nextInt();
        
        int[] aiEdades = new int[iTama];//Daclaración de arreglo de tamaño iTama
        for(int i=0;i<aiEdades.length;i++){//Desde el pro,er elemento (0) al ultimo (n-1)
            System.out.println("Edad: ");
            aiEdades[i] = input.nextInt();
            
        }
        int iAcum = 0;
        for(int i=0;i<aiEdades.length;i++){
            System.out.print("[" + aiEdades[i] + "]"); 
            iAcum = iAcum+aiEdades[i];//iAcum += aiEdades[i];
        }
        double iProm = (double)iAcum / (double)aiEdades.length;
        System.out.println("Promedio "+iProm);
    }
    
}
