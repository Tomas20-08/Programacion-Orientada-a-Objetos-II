
package Taller_POO_Ejercicio05;

// CLASE PADRE
public class Vehiculo {
 
    // ATRIBUTOS
    private String marca;
    private int    velocidad;
 
    // CONSTRUCTOR
    public Vehiculo(String marca, int velocidad) {
        this.marca     = marca;
        this.velocidad = velocidad;
    }
 
    // GETTERS y SETTERS
    public String getMarca(){ 
        return marca;      
    }
    public int    getVelocidad(){
        return velocidad;  
    }
    public void   setMarca(String marca){
        this.marca = marca;    
    }
    public void   setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }
 
    // METODO
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + " | Vel. máx: " + velocidad + " km/h");
    }
}

