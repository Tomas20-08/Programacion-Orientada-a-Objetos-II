
package Taller_POO_Ejercicio05;

// CLASE HIJA - HERENCIA
public class Carro extends Vehiculo {
 
    // ATRIBUTO 
    private int puertas;
 
    // CONSTRUCTOR
    public Carro(String marca, int velocidad, int puertas) {
        super(marca, velocidad);  
        this.puertas = puertas;
    }
 
    // GETTER y SETTER 
    public int  getPuertas(){
        return puertas;  
    }
    public void setPuertas(int puertas){
        this.puertas = puertas;
    }
 
    // MÉTODO
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Puertas: " + puertas);
    }
}

