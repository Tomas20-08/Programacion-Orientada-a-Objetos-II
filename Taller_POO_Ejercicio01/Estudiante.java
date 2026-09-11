
package Taller_POO_Ejercicio01;

    public class Estudiante {
 
    // ATRIBUTOS
    private String nombre;
    private int    edad;
    private String carrera;
 
    // CONSTRUCTOR 
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre  = nombre;
        this.edad    = edad;
        this.carrera = carrera;
    }
 
    // GETTERS
    public String getNombre(){ 
        return nombre;  
    }
    public int getEdad(){
        return edad;    
    }
    public String getCarrera() { 
        return carrera; 
    }
 
    // SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    public void setEdad(int edad){
        this.edad = edad;    
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera; 
    }
 
    // METODO
    public void estudiar() {
        System.out.println(nombre + " esta estudiando " + carrera);
    }
}