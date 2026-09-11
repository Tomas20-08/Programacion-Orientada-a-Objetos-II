
package Taller_POO_Ejercicio06;

// CLASE PADRE
public class Persona {
 
    // ATRIBUTOS
    private String nombre;
    private int edad;
 
    // CONSTRUCTOR
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad   = edad;
    }
 
    // GETTERS y SETTERS
    public String getNombre(){ 
        return nombre; 
    }
    public int getEdad(){ 
        return edad; 
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;  
    }
 
    // METODO
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad);
    }
}


