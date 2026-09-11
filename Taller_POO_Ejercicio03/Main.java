// EJERCICIO 3
// 1. ATRIBUTOS: no tiene atributos
// 2. METODOS: sumar(), restar()
// 3. PARAMETROS: sumar() y restar() reciben (int a, int b)
// 4. HERENCIA: no aplica
// 5. ENCAPSULAMIENTO: la lógica de las operaciones está dentro de cada método

package Taller_POO_Ejercicio03;

// CLASE MAIN
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.sumar(15, 7);
        calc.restar(20, 8);
    }
}

