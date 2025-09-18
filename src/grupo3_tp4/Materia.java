/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo3_tp4;

/**
 *
 * @author Adrian
 */
public class Materia {
    
    protected int idMateria;
    protected String nombre;
    protected int año;

    public Materia(int idMateria, String nombre, int año) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.idMateria;
        return hash;
    }

    @Override
public boolean equals(Object obj) {
   
    if (this == obj) {
        return true;
    }

    
    if (obj == null) {
        return false;
    }

    
    if (!(obj instanceof Materia)) {
        return false;
    }

    
    Materia otra = (Materia) obj;

    // Comparo por idMateria 
    return this.idMateria == otra.idMateria;
}

    @Override
    public String toString() {
        return + idMateria +" ,"+ nombre + ","+ año;
    }


    
    
}
