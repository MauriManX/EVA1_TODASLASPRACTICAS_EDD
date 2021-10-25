/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_pasoxval_pasoxref;

/**
 *
 * @author Mauricio
 */
public class EVA1_6_PASOXVAL_PASOXREF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valOrig = 5;
        System.out.println("ValOrig en el main = " + valOrig);
        incrementa(valOrig);
        System.out.println("ValOrig despues de llamar a incrementa = " + valOrig);
        
        System.out.println("Variable despues de usar incrementa 2.0");
        valOrig = incrementa2(valOrig);
        System.out.println("Nuevo valor = "+valOrig+"\nFIN");
        
        //Ahora se demuestra paso por referencia
        Prueba objPrueba = new Prueba();
        System.out.println("Valor de la X: " + objPrueba.x);
        System.out.println("Objeto en main= "+objPrueba);
        incrementaObj(objPrueba);
        System.out.println("Valor de la X despues de incrementar = "+objPrueba.x);
    }
    //Paso por valor ----> Pasamos una copia del valor de una variable (Variables locales primitivas)
    public static void incrementa(int val){
        val++;// incrementa en uno val = val + 1 val+=1
        System.out.println("Valor en incrementa = "+val);
    }
    public static int incrementa2 (int val){
        val++;
        return val;
    }
    //Paso por referencia -----> Pasamos la dirección en la memoria del objeto (Objeto)
    
    public static void incrementaObj(Prueba val){
        
        System.out.println("Objeto en incrementaObj= "+ val);
        val.x++;
    }
}

class Prueba{
    public int x = 10;
}
