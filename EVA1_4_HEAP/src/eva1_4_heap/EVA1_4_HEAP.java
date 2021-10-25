/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_heap;

/**
 *
 * @author Mauricio
 */
public class EVA1_4_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Miclase obj = new Miclase();
        System.out.println(obj);
        
        Miclase obj2 = new Miclase();
        System.out.println(obj2);
        
        EVA1_4_HEAP objHeap = new EVA1_4_HEAP();
        System.out.println(objHeap);
        
        //Lo unico que se está imprimiendo es la referencia al objeto en Heap. El objeto se guarda en Heap, pero la referencia se guarda en stack 
    }
    
}

class Miclase{//Es un nuevo tipo de dato ----->Tipo de dato abstracto
    String mensaje;    
    public Miclase(){
        mensaje="Hola mundo";
    }
    //getter / setter
    public String getMensaje(){
        return mensaje;
    }
    
    public void setMensaje(String mensaje){
        this.mensaje = mensaje;
    }
    
}