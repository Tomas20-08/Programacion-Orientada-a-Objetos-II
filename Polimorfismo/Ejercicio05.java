
//Clase abstracta Personaje con método atacar().
//Subclases: Guerrero, Mago, Arquero, cada una con su propio ataque.
//Usa un arreglo de personajes para simular un turno de batalla.

package Polimorfismo;

// Clase abstracta
abstract class Personaje {
 
    String nombre;
 
    public Personaje(String nombre) {
        this.nombre = nombre;
    }
 
    // Método abstracto
    abstract void atacar();
}
 
// Clase Guerrero
class Guerrero extends Personaje {
 
    public Guerrero(String nombre) {
        super(nombre);
    }
 
    @Override
    void atacar() {
        System.out.println(nombre + " (Guerrero) ataca con su espada: ¡SLASH!");
    }
}
 
// Clase Mago
class Mago extends Personaje {
 
    public Mago(String nombre) {
        super(nombre);
    }
 
    @Override
    void atacar() {
        System.out.println(nombre + " (Mago) lanza una bola de fuego: ¡BOOM!");
    }
}
 
// Clase Arquero
class Arquero extends Personaje {
 
    public Arquero(String nombre) {
        super(nombre);
    }
 
    @Override
    void atacar() {
        System.out.println(nombre + " (Arquero) dispara una flecha: ¡SWOOSH!");
    }
}

public class Ejercicio05 {

    public static void main(String[] args) {
        
                // Arreglo de personajes (polimorfismo)
        Personaje[] personajes = {
            new Guerrero("Ragnar"),
            new Mago("Merlín"),
            new Arquero("Legolas")
        };
 
        System.out.println("=== TURNO DE BATALLA ===");
 
        // Simular turno: cada personaje ataca con el mismo método
        for (Personaje p : personajes) {
            p.atacar();
        }

    }
    
}

