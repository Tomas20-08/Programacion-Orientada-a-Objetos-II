
//Crea una clase Animal con un método hacerSonido().
//Subclases: Perro, Gato, Vaca.
//Guarda distintos animales en un arreglo o lista y hazlos “hablar” usando el mismo método.

package Polimorfismo;

// Clase base
class Animal {
 
    // Método que será sobrescrito
    void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
 
// Clase Perro
class Perro extends Animal {
 
    @Override
    void hacerSonido() {
        System.out.println("El perro dice: ¡Guau!");
    }
}
 
// Clase Gato
class Gato extends Animal {
 
    @Override
    void hacerSonido() {
        System.out.println("El gato dice: ¡Miau!");
    }
}
 
// Clase Vaca
class Vaca extends Animal {
 
    @Override
    void hacerSonido() {
        System.out.println("La vaca dice: ¡Muuu!");
    }
}

public class Ejercicio03 {

    public static void main(String[] args) {
        
        // Arreglo de animales (polimorfismo)
        Animal[] animales = { new Perro(), new Gato(), new Vaca() };
 
        // Hacer "hablar" a cada animal con el mismo método
        for (Animal a : animales) {
            a.hacerSonido();
        }

    }
    
}
