// EJERCICIO 5
// 1. ATRIBUTOS: marca, velocidad, puertas
// 2. METODOS: mostrarInfo(), getters y setters
// 3. PARAMETROS: constructor Vehiculo recibe (marca, velocidad), constructor Carro recibe (marca, velocidad, puertas)
// 4. HERENCIA: Carro extiende de Vehiculo y usa super()
// 5. ENCAPSULAMIENTO: todos los atributos son private, la clase hija accede a los del padre solo con getters

package Taller_POO_Ejercicio05;

// CLASE MAIN
public class Main {
    public static void main(String[] args) {
        Carro car = new Carro("El Porsche 911 GT3", 300, 2);
        car.mostrarInfo();
    }
}

