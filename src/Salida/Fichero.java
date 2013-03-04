/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Salida;
import java.io.*;
/**
 *
 * @author 64131
 */
public class Fichero {
    
    private
    String ID_CLIENTE;
    String DNI;
    String NOMBRE;
    String APELLIDOS;
    String CALLE;
    int NUMERO;
    int COD_POSTAL;
    String POBLACION;
    String PROVINCIA;
    int TELEFONO;
    
    public Fichero(String ID_CLIENTE,String DNI,String NOMBRE,String APELLIDOS,String CALLE,int NUMERO,int COD_POSTAL,String POBLACION,String PROVINCIA,int TELEFONO){
      
    ID_CLIENTE = ID_CLIENTE;
    DNI = DNI;
    NOMBRE = NOMBRE;
    APELLIDOS = APELLIDOS;
    CALLE = CALLE ;
    NUMERO = NUMERO;
    COD_POSTAL = COD_POSTAL;
    POBLACION = POBLACION;
    PROVINCIA = PROVINCIA;
    TELEFONO = TELEFONO;
    }
    
    public String get_ID_CLIENTE(){
    return ID_CLIENTE;
    }
     public String get_DNI(){
    return DNI;
    }
      public String get_NOMBRE(){
    return NOMBRE;
    }
       public int get_NUMERO(){
    return NUMERO;
    }
        public String get_CALLE(){
    return CALLE;
    }
         public int get_COD_POSTAL(){
    return COD_POSTAL;
    }
          public String get_POBLACION(){
    return POBLACION;
    }
           public String get_PROVINCIA(){
    return ID_CLIENTE;
    }
            public int get_TELEFONO(){
    return TELEFONO;
    }
    
}
