/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package benja;

/**
 *
 * @author Ceduc-Lab306-08
 */
public class Estudiante extends Persona implements Auditable{
    private double promedio;
    
    public Estudiante(String nombre, String rut){
        super(nombre, rut);
        this.promedio=1;
    }
    @Override
    public String obtenerRol(){
        return "Estudiante";
    }
    public void mostrarFicha(){
        super.mostrarFicha();
        System.out.println("Promedio: "+promedio);
    }
    public void registrarAccion(String accion){
        return;
    }
}
