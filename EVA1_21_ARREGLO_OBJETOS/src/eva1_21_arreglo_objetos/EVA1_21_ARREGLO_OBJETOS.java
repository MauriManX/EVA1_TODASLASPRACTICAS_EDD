/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_21_arreglo_objetos;

import java.util.Scanner;

/**
 *
 * @author Mauricio
 */
public class EVA1_21_ARREGLO_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Persona[] aPersonas = new Persona[10];//Arreglo tamaño 10 que almacena objetos de tipo persona
        //Para usar un objeto primero se debe crear. Si no se crea no existe.
        for (int i = 0; i<aPersonas.length; i++){
            aPersonas[i] = new Persona();//Se crea un objeto "Persona" en la posicion i
            System.out.println("Introduce el nombre al humano numero "+i);
            aPersonas[i].setNombre(input.nextLine());
        }
        for (int i = 0; i< aPersonas.length; i++){
            System.out.println("Nombre:" + aPersonas[i].getNombre());
        }
        
    }
    
}

class Persona{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}