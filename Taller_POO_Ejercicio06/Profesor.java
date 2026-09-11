
package Taller_POO_Ejercicio06;

// CLASE HIJA 2 - HERENCIA
public class Profesor extends Persona {
 
    // ATRIBUTO
    private String materia;
 
    // CONSTRUCTOR
    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }
 
    // GETTER y SETTER
    public String getMateria(){
        return materia;  
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
 
    // METODO
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Materia: " + materia);
    }
}


