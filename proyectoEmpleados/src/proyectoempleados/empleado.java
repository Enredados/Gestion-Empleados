/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoempleados;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author alang
 */
//Holaaaaaa
public class empleado {
    private String nombre; //25
    private String apellido; //25
    private String cedula; //10
    private String cargo; //15
    private int edad; //
    private double sueldo;
    
    public empleado(String nombre, String apellido, String cedula, int edad, String cargo, double sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    
    
    public void agregar() {
        String raiz = System.getProperty("user.dir");

        try {
            File arch = new File(raiz + "\\EMPLEADO.dat");
            RandomAccessFile rand = new RandomAccessFile(arch, "rw");
            darFormato();

            if (rand.length() == 0) {
                rand.writeChars(nombre);
                rand.writeChars(apellido);
                rand.writeChars(cedula);
                rand.writeInt(edad);
                rand.writeChars(cargo);
                rand.writeDouble(sueldo);
                rand.close();
            } else {
                rand.seek(rand.length());
                rand.writeChars(nombre);
                rand.writeChars(apellido);
                rand.writeChars(cedula);
                rand.writeInt(edad);
                rand.writeChars(cargo);
                rand.writeDouble(sueldo);
                rand.close();
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void darFormato() {
        // nombre con formato char de 25 (50 bytes)
        if(nombre.length() < 25){
           for(int i = nombre.length(); i < 25; i++){
                nombre +=" ";
            }
        }
        else {
            nombre = nombre.substring(0,25);
        }
        // apellido con formato char de 25 (50 bytes)
        if(apellido.length() < 25){
           for(int i = apellido.length(); i < 25; i++){
                apellido +=" ";
            }
        }
        else {
            apellido = apellido.substring(0,25);
        }
        // cédula con formato char de 10 (20 bytes)
        if(cedula.length() < 10){
           for(int i = cedula.length(); i < 10; i++){
                cedula +=" ";
            }
        }
        else {
            cedula = cedula.substring(0,10);
        }
        // cargo con formato char de 15 (30 bytes)
        if(cargo.length() < 15){
           for(int i = cargo.length(); i < 15; i++){
                cargo +=" ";
            }
        }
        else {
            cargo = cargo.substring(0,15);
        }
    }
}
