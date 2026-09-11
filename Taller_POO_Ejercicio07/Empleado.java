
package Taller_POO_Ejercicio07;

// CLASE PADRE
public class Empleado {
 
    // ATRIBUTOS 
    private String nombre;
    private double salario;
 
    // CONSTRUCTOR
    public Empleado(String nombre, double salario) {
        this.nombre  = nombre;
        this.salario = salario;
    }
 
    // GETTERS y SETTERS
    public String getNombre(){ 
        return nombre;   
    }
    public double getSalario(){ 
        return salario;  
    }
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    public void setSalario(double salario) { 
        this.salario = salario;
    }
 
    // METODO 
    public double calcularSalarioTotal() {
        return salario;
    }
}

