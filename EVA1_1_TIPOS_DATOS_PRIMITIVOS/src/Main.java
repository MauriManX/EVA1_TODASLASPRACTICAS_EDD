/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mauricio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iVal = Integer.MAX_VALUE;
        System.out.println("Valor más grande: "+ iVal);
        iVal += 1;//overflow
        System.out.println("Valor más grande + 1: "+ iVal);
        iVal =Integer.MIN_VALUE;
        System.out.println("Valor más pequeño "+ iVal);
        
        
        //Las variables dentro de for son temporales, y durarán l0 que el bloque de codigo
        for (int i = 0; i <10; i++){
            System.out.println("Hola mundo sjhakdhkahd Numero:" + i);
        }
        System.out.println(i + "te necesito, ¿donde estas?");
    }
    
}
