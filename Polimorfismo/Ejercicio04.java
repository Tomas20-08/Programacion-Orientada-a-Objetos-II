
//Crea una clase Empleado con un método calcularSalario().
//Subclases: EmpleadoFijo y EmpleadoPorHoras.
//Usa una lista de empleados para mostrar distintos cálculos de salario con el mismo método.

package Polimorfismo;

import java.util.ArrayList;
import java.util.List;
 
// Clase abstracta
abstract class Empleado {
 
    String nombre;
 
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
 
    // Método abstracto
    abstract double calcularSalario();
}
 
// Clase EmpleadoFijo
class EmpleadoFijo extends Empleado {
 
    double salarioMensual;
 
    public EmpleadoFijo(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }
 
    @Override
    double calcularSalario() {
        return salarioMensual;
    }
}
 
// Clase EmpleadoPorHoras
class EmpleadoPorHoras extends Empleado {
 
    double horasTrabajadas;
    double valorHora;
 
    public EmpleadoPorHoras(String nombre, double horasTrabajadas, double valorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }
 
    @Override
    double calcularSalario() {
        return horasTrabajadas * valorHora;
    }
}

public class Ejercicio04 {

    public static void main(String[] args) {
        
                // Lista de empleados (polimorfismo)
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoFijo("Carlos", 3500000));
        empleados.add(new EmpleadoPorHoras("Laura", 120, 25000));
        empleados.add(new EmpleadoFijo("Andrés", 4200000));
        empleados.add(new EmpleadoPorHoras("Sofía", 80, 30000));
 
        // Mostrar salario de cada empleado con el mismo método
        for (Empleado e : empleados) {
            System.out.println("Salario de " + e.nombre + ": $" + e.calcularSalario());
        }

    }
    
}
