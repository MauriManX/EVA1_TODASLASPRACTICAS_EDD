/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_cubo;

/**
 *
 * @author Mauricio
 */
public class EVA1_19_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Arreglo tridimencional
        int[][][]aiCubo = new int [3][4][2];
        //Cuantos enteros son?
        //24 enteros 3x4x2
        for (int i=0; i<aiCubo.length;i++){
            for (int j=0; j<aiCubo[i].length;j++){
                for (int k = 0; k<aiCubo[i][j].length; k++){
                    aiCubo[i][j][k]=100;
                }
            }
        }
    }
    
}
