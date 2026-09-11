
package Taller_POO_Ejercicio02;

// CLASE PADRE
public class Persona {
 
    // ATRIBUTOS
    private String nombre;
    private int    edad;
 
    // CONSTRUCTOR
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad   = edad;
    }
 
    // GETTERS & SETTERS
    public String getNombre(){ 
        return nombre; 
    }
    public int    getEdad(){
        return edad;   
    }
    public void   setNombre(String nombre){
        this.nombre = nombre; 
    }
    public void   setEdad(int edad){
        this.edad = edad;   
    }
 
    // METODO
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}

