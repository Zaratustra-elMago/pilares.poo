/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package benja;

/**
 *
 * @author Ceduc-Lab306-08
 */
public class Administrativo extends Persona implements Auditable {
    private String departamento;
    
    public Administrativo(String nombre, String rut, String departamento){
        super(nombre,rut);
        this.departamento=departamento;
    }
    @Override
    public void mostrarFicha(){
        super.mostrarFicha();
        System.out.println("Departamento: "+departamento);
    }

    @Override
    public String obtenerRol(){
        return "Administrativo";
    }
    public void registrarAccion(String accion){
        return;
    }
}
