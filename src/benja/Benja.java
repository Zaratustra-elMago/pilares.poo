/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package benja;

/**
 *
 * @author Ceduc-Lab306-08
 */
public class Benja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona[] personas = {new Estudiante("Juan","21.234.776-2"), new Docente("Maikol","21.344.543-K","Matematicas"), new Administrativo("Ignacio","13.249.122-8","Limpieza")};
        
        for(Persona p:personas){
            p.mostrarFicha();
        }
    }
    
}
