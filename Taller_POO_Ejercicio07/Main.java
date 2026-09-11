// EJERCICIO 7
// 1. ATRIBUTOS: nombre, salario, bono, lenguaje
// 2. METODOS: calcularSalarioTotal(), mostrarInfo(), getters y setters
// 3. PARAMETROS: constructor Empleado recibe (nombre, salario), Gerente recibe (nombre, salario, bono), Desarrollador recibe (nombre, salario, lenguaje)
// 4. HERENCIA: Gerente y Desarrollador extienden de Empleado y sobrescriben calcularSalarioTotal()
// 5. ENCAPSULAMIENTO: todos los atributos son private, las clases hijas acceden solo mediante getters

package Taller_POO_Ejercicio07;

// CLASE MAIN
public class Main {
    public static void main(String[] args) {
        Gerente ger = new Gerente("Lina Urrutia", 5000000, 1500000);
        Desarrollador des = new Desarrollador("Sergio Mora", 4000000, "Java");
        ger.mostrarInfo();
        System.out.println();
        des.mostrarInfo();
    }
}

