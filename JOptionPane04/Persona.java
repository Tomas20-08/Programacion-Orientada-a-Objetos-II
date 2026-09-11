
package JOptionPane04;

public class Persona {
    // Atributos
    String nombre;
    int edad;

    // Método constructor (mismo nombre que la clase, sin void)
    public Persona(String nombre, int edad){
        // Uso de this para diferenciar atributo del parámetro
        this.nombre = nombre;
        this.edad   = edad;
    }

    // Métodos
    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: "   + edad);
    }
}