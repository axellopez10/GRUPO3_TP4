/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo3_tp4;

import java.util.HashSet;

/**
 *
 * @author Adrian
 */
public class Alumno {
    
    protected int legajo;
    protected String apellido;
    protected String nombre;
    
     private HashSet<Materia> listamateria=new HashSet();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public boolean agregarmateria(Materia m){
        
        return listamateria.add(m);
             
    }
    
    public int cantidadMaterias(){
        
        return listamateria.size();
         
        
    }    

    @Override
    public String toString() {
        return + legajo +", " +  apellido + " ," + nombre ;
    }
    
    
    
    
}
