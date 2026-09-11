
//Define una clase Vehiculo con un método acelerar().
//Crea subclases Carro, Moto y Bicicleta que sobreescriban este método.
//Haz que un método reciba un Vehiculo y llame a acelerar() para mostrar polimorfismo en acción.

package Polimorfismo;

// Clase base
class Vehiculo {
 
    // Método que será sobrescrito
    void acelerar() {
        System.out.println("El vehículo acelera.");
    }
}
 
// Clase Carro
class Carro extends Vehiculo {
 
    @Override
    void acelerar() {
        System.out.println("El carro acelera pisando el acelerador.");
    }
}
 
// Clase Moto
class Moto extends Vehiculo {
 
    @Override
    void acelerar() {
        System.out.println("La moto acelera girando el manubrio.");
    }
}
 
// Clase Bicicleta
class Bicicleta extends Vehiculo {
 
    @Override
    void acelerar() {
        System.out.println("La bicicleta acelera pedaleando más rápido.");
    }
}

public class Ejercicio02 {
        
    // Método que recibe un Vehiculo y llama a acelerar()
    static void hacerAcelerar(Vehiculo v) {
        v.acelerar();
    }
 
    public static void main(String[] args) {
 
        // Polimorfismo
        Vehiculo v1 = new Carro();
        Vehiculo v2 = new Moto();
        Vehiculo v3 = new Bicicleta();
 
        hacerAcelerar(v1);
        hacerAcelerar(v2);
        hacerAcelerar(v3);

    }
    
}