/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_matriz;

/**
 *
 * @author Mauricio
 */
public class EVA1_15_MATRIZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear un arreglo de dos dimensiones 5 filas x 3 columnas (puros enteros)
        int iMatriz[][] = new int [5][3];
        //Acceder a un elemento:
        iMatriz[0][0] = 1000; //Primer posicion
        iMatriz[4][2] = 2000 ;//Ultima
        System.out.println("Tamaño del arreglo: "+iMatriz.length);
        
        //CICLO x Cada dimensión
        //Ciclos anidados (Ciclo dentro de otro ciclo)
        for(int i=0; i<iMatriz.length; i++){
            for(int j=0; j<3; j++){
                iMatriz[i][j] = 1000;
            }
        }
        for(int i=0; i<iMatriz.length; i++){//Filas iMatriz.length
            for(int j=0; j<3; j++){//Columnas
                System.out.print("[" + iMatriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
