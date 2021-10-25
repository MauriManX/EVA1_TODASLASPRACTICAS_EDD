/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_promedios;

import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class EVA1_18_PROMEDIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[][]aiGrupos;
        //Se pregunta al usuario los grupos
        System.out.println("¿Cuantos grupos son?");
        int iNoGrupos = input.nextInt();
        
        //Los grupos se representan mediante filas
        aiGrupos = new int[iNoGrupos][];
        for(int i = 0; i < aiGrupos.length; i++){
            System.out.println("¿Para el grupo "+i+" ¿Cuántos estudiantes son?");
            int iNoEstu = input.nextInt();
            aiGrupos[i] = new int[iNoEstu];
        }
            
        //Se preguntan las edades
        for(int i = 0; i< aiGrupos.length; i++){//Primer dimension filas-grupos{
            for (int j = 0; j < aiGrupos[i].length; j++){// segunda dimension, para cada grupo ciantos alumnos
                System.out.print("[]");//Print (Imprime en la misma linea)
            }
            System.out.println(""); //Println (Imprime y despues hace salto de linea
        }
    }
    
}
