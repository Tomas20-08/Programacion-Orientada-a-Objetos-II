
package Taller_POO_Ejercicio07;

// CLASE HIJA 1 - HERENCIA
public class Gerente extends Empleado {
 
    // ATRIBUTO 
    private double bono;
 
    // CONSTRUCTOR 
    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario); 
        this.bono = bono;
    }
 
    // GETTER y SETTER
    public double getBono(){ 
        return bono; 
    }
    public void setBono(double bono){
        this.bono = bono;
    }
 
    // METODO
    @Override
    public double calcularSalarioTotal() {
        return getSalario() + bono;
    }
 
    public void mostrarInfo() {
        System.out.println("GERENTE");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Salario base: " + getSalario());
        System.out.println("Bono: " + bono);
        System.out.println("Salario total: " + calcularSalarioTotal());
    }
}

