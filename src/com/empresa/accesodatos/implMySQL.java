/*
 Esta clase implementa las operaciones de acceso a datos con MySQL
 */
package com.empresa.accesodatos;

/**
 *
 * @author Alumnos Mañana
 */
public class implMySQL implements IAccesoaDatos{

    @Override
    public void insertar() {
        System.out.println("Insertando desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listando desde Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde Mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde Mysql");
    }
    
}
