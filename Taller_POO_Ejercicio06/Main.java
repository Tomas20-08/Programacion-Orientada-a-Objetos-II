// EJERCICIO 6
// 1. ATRIBUTOS: nombre, edad, notaFinal, materia
// 2. METODOS: mostrarDatos(), getters y setters
// 3. PARAMETROS: constructor Persona recibe (nombre, edad), Estudiante recibe (nombre, edad, notaFinal), Profesor recibe (nombre, edad, materia)
// 4. HERENCIA: Estudiante y Profesor extienden de Persona usando super()
// 5. ENCAPSULAMIENTO: todos los atributos son private y se accede solo con getters y setters

package Taller_POO_Ejercicio06;

// CLASE MAIN
public class Main {
    public static void main(String[] args) {
        Estudiante est = new Estudiante("Julian Santiago", 18, 4.5);
        Profesor pro = new Profesor("Monica Parra", 28, "Programación Orientada a Objetos");
        est.mostrarDatos();
        System.out.println();
        pro.mostrarDatos();
    }
}

