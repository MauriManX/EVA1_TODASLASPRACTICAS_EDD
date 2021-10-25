/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_23_numeros_primos;

import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class EVA1_23_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Introduce un número: ");
        int iVal = input.nextInt();
        boolean esPrimo = true;
        
        for (int i=2; i<iVal; i++){
            //Division: iVal / i ---> Division exacta, no es primp
            //Modulo ---> Calcula el residuo de una division
            //En java, modulo es % ---> num1 % num2
            //7 % 5 = 2 division con residuo diferente a cero
            //15%3 = 0 Division exacta
            int iMod = iVal%i;
            if (iMod ==0){//Modula = 0, no es primo, hay que terminar
                esPrimo = false;
                break;//Detiene permanentemente el for
                      //Continue; //Detiene la iteración actual
            }
            //Si la division es exacta ---> Terminamos. no es primo
            //Si terminamos el for sin dividir exactamente: es primo
        }
        //Imprimir si es primo o no lo es
        if(esPrimo)
            System.out.println("El numero es primo");
        else
            System.out.println("No es primo");
    }
    
    
}
