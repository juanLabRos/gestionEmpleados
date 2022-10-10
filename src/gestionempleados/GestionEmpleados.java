/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionempleados;
import com.empresa.accesodatos.IAccesoaDatos;
import com.empresa.accesodatos.implMongo;
import com.empresa.accesodatos.implMySQL;
import dominio.persona;
/**
 *
 * @author Alumnos Mañana
 */
public class GestionEmpleados {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        persona prs1 = new persona("Juan", "Ros");
        persona prs2 = new persona("Pepe", "Villuela");
        System.out.println("pers1= "+prs1);
        System.out.println("pers2= "+prs2);
        
        System.out.println(" "+persona.contador);
        
         //Instanción de la interfaz con la implementación de mySql
    IAccesoaDatos datoMySQL = new implMySQL();
     //Instanción de la interfaz con la implementación de MongoDB
    IAccesoaDatos datoMongo = new implMongo();
    
    datoMySQL.listar();
    datoMongo.listar();
    
    
    }
    
   
    
    public static void imprimirDatos(IAccesoaDatos datos){
     datos.listar();
        
    }
}



    
    

