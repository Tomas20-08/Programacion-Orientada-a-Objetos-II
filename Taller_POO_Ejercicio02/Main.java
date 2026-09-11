// EJERCICIO 2
// 1. ATRIBUTOS: nombre, edad, salario
// 2. METODOS: saludar(), trabajar(), getters y setters de todos los atributos
// 3. PARAMETROS: constructor Persona recibe (nombre, edad), constructor Empleado recibe (nombre, edad, salario), setSalario recibe (double salario)
// 4. HERENCIA: Empleado extiende de Persona usando super()
// 5. ENCAPSULAMIENTO: todos los atributos son private y se accede solo mediante getters y setters

package Taller_POO_Ejercicio02;

// CLASE MAIN
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Thomas Sair", 19, 2000000);
        
        //METODO CLASE PERSONA
        emp.saludar(); 
        
        //METODO CLASE EMPLEADO
        emp.trabajar(); 
    }
}

