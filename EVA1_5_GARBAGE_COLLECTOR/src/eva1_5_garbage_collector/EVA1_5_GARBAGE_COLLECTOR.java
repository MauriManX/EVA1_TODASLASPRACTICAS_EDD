/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_garbage_collector;

/**
 *
 * @author Mauricio
 */
public class EVA1_5_GARBAGE_COLLECTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Miclase obj = new Miclase();
        System.out.println(obj);
        //Eliminar el objeto
        obj = null;
        System.out.println(obj);
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
