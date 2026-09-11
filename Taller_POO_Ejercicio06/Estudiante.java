
package Taller_POO_Ejercicio06;

// CLASE HIJA 1 - HERENCIA
public class Estudiante extends Persona {
 
    // ATRIBUTO
    private double notaFinal;
 
    // CONSTRUCTOR
    public Estudiante(String nombre, int edad, double notaFinal) {
        super(nombre, edad);
        this.notaFinal = notaFinal;
    }
 
    // GETTER y SETTER
    public double getNotaFinal(){ 
        return notaFinal;  
    }
    public void setNotaFinal(double nota){
        this.notaFinal = nota;
    }
 
    // METODO
    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); 
        System.out.println("Nota Final: " + notaFinal);
    }
}


