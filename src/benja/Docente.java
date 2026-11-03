/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package benja;

/**
 *
 * @author Ceduc-Lab306-08
 */
public class Docente extends Persona {
    private String asignatura;
    
    public Docente(String nombre, String rut, String asignatura){
        super(nombre,rut);
        this.asignatura=asignatura;
    }
    @Override
    public String obtenerRol(){
        return "Docente";
    }
    @Override
    public void mostrarFicha(){
        super.mostrarFicha();
        System.out.println("Asignatura: "+asignatura);
    }
}

