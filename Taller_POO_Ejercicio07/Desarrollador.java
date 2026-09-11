
package Taller_POO_Ejercicio07;

// CLASE HIJA 2 - HERENCIA
public class Desarrollador extends Empleado {
 
    // ATRIBUTO
    private String lenguaje;
 
    // CONSTRUCTOR
    public Desarrollador(String nombre, double salario, String lenguaje) {
        super(nombre, salario);
        this.lenguaje = lenguaje;
    }
 
    // GETTER y SETTER
    public String getLenguaje(){
        return lenguaje;  
    }
    public void setLenguaje(String lenguaje){ 
        this.lenguaje = lenguaje;
    }
 
    // METODO
    @Override
    public double calcularSalarioTotal() {
        return getSalario() * 1.10;
    }
 
    public void mostrarInfo() {
        System.out.println("DESARROLLADOR");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Lenguaje: " + lenguaje);
        System.out.println("Salario base: " + getSalario());
        System.out.println("Salario total: " + calcularSalarioTotal());
    }
}

