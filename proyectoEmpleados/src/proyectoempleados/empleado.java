/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoempleados;

/**
 *
 * @author alang
 */
//Holaaaaaa
public class empleado {
    private String nombre;
    private String codigo;
    private int sueldo;
    
    public empleado(String nombre, int sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerCodigo(){
        return codigo;
    }
    
    public int obtenerSueldo(){
        return sueldo;
    }
    
    public void setearCodigo(String codigo){
        this.codigo = codigo;
    }
    
}
