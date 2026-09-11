// EJERCICIO 1
// 1. ATRIBUTOS: nombre, edad y carrera
// 2. METODOS: estudiar(), getNombre(), setNombre(), getEdad(), setEdad(), getCarrera(), setCarrera()
// 3. PARAMETROS: constructor recibe (String nombre, int edad, String carrera). Los setters reciben su valor correspondiente. estudiar() no recibe parámetros.
// 4. HERENCIA: no aplica
// 5. ENCAPSULAMIENTO: todos los atributos están private y solo se accede mediante getters y setters

package Taller_POO_Ejercicio01;

// CLASE MAIN
public class Main {
    public static void main(String[] args) {
        Estudiante est = new Estudiante("Tomas Leon", 17, "Ingenieria de Software");
        est.estudiar();
        System.out.println("Nombre : " + est.getNombre());
        System.out.println("Edad   : " + est.getEdad());
        System.out.println("Carrera: " + est.getCarrera());
    }
}

