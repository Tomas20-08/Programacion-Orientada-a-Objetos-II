
package Taller_POO_Ejercicio02;

// CLASE HIJA - HERENCIA
public class Empleado extends Persona {
 
    // ATRIBUTO
    private double salario;
 
    // CONSTRUCTOR
    public Empleado(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }
 
    // GETTER & SETTER
    public double getSalario(){ 
        return salario;  
    }
    public void   setSalario(double salario){ 
        this.salario = salario;
    }
 
    // METODO
    public void trabajar() {
        System.out.println(getNombre() + " trabaja. Salario: " + salario);
    }
}

