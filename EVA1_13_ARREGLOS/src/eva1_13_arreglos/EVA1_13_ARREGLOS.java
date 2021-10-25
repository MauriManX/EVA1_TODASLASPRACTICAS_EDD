/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_arreglos;

/**
 *
 * @author Mauricio
 */
public class EVA1_13_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] aiArreglo = new int[3];//12 bytes ---> 3 entero x 4 bytes
        System.out.println("Dirección de aiArreglo = " + aiArreglo);
        aiArreglo[0]=1000;
        aiArreglo[1]=2000;
        aiArreglo[2]=3000;
        //aiArreglo[3] = 3; // error: ArrayIndexOutofBound ---> Nos hemos pasado del limite del arreglo
        for (int i =0; i < aiArreglo.length;i++){
            System.out.println("Cuenta "+ i +" = $"+ aiArreglo[i]);
        }
//Se crea una nueva variable de tipo arreglo
        int[] aiCopia = aiArreglo;
        System.out.println("Dirección de aiCopia = "+ aiCopia);
        for (int i =0; i < aiCopia.length;i++){
            System.out.println("Cuenta "+ i +" = $"+ aiCopia[i]);
        }
        aiArreglo = new int[2];
        for (int i =0; i < aiArreglo.length;i++){
            System.out.println("Cuenta "+ i +" modificada = $"+ aiArreglo[i]);    
        }
        System.out.println("Dirección nueva de aiArreglo = " + aiArreglo);

        System.out.println("Dirección de aiCopia = "+ aiCopia);
        for (int i =0; i < aiCopia.length;i++){
            System.out.println("Cuenta "+ i +" = $"+ aiCopia[i]);
        }
    }
    
}
