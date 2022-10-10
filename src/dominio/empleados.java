/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Objects;

/**
 *
 * @author Alumnos Mañana
 */
public class empleados extends persona {
    private String empleado;
    private int segSocial;

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public int getSegSocial() {
        return segSocial;
    }

    public void setSegSocial(int segSocial) {
        this.segSocial = segSocial;
    }

    public empleados(String empleado, int segSocial, String nombre, String apellido) {
        super(nombre, apellido);
        this.empleado = empleado;
        this.segSocial = segSocial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("empleados{empleado=").append(empleado);
        sb.append(", segSocial=").append(segSocial);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.empleado);
        hash = 97 * hash + this.segSocial;
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        final empleados other = (empleados) obj;
        if (this.segSocial != other.segSocial) {
            return false;
        }
        if (!Objects.equals(this.empleado, other.empleado)) {
            return false;
        }
        return true;
    }
    
 
}
