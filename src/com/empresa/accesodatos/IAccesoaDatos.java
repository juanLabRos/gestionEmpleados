/*
 * Interfaz de acceso a datos con un conjunto de operaciones comunes
 */
package com.empresa.accesodatos;

/**
 *
 * @author Alumnos Mañana
 */
public interface IAccesoaDatos {
    
    int MAX_REGISTRO = 10;
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
