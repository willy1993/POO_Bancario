/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author PC-1
 */
public abstract class Persona {
    private int id;
    private String cedula;
    private String nombre;
    private String apellido;

    public Persona() {
    }

    
    public Persona(int id) {
        this.id = id;
    }

    
    public void mostrar() {
        System.out.println(String.format("El Titular De La Cuenta -->%s",id));        
        System.out.println(String.format("Nombre Es.- %s, %s   #C.I.-, %s", nombre,apellido,cedula));
    }
    
    //public abstract void saludar();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona(int id, String cedula, String nombre, String apellido) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    

    
    
}
