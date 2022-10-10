/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.accesodatos;

/**
 *
 * @author Alumnos Mañana
 */
public class implMongo implements IAccesoaDatos {

    @Override
    public void insertar() {
        System.out.println("Instertar desde Mongo");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mongo");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Mongo");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Mongo");
    }
    
}
