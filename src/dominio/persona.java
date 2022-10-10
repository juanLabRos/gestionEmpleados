/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;

/**
 *
 * @author Alumnos Mañana
 */
public class persona implements Serializable  {
    private String nombre;
    private String apellido;
    private int id;
    public static int contador =0;

    public persona() {
        this.id = ++persona.contador;
    }
    

    public persona(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getId() {
        return id;
    }

    public static int getContador() {
        return contador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("persona{nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }
    

}
