//1 clase padre
//2 atributos
//2 métodos
//2 clases hijas
//Cada hija con 1 atributo nuevo y 1 método nuevo
//Crear un objeto de cada clase hija

package Herencia;

public class Ejemplo02_Herencia {

    public static void main(String[] args) {
        
        // Crear objeto de la clase hija 1
        Perro1 perro1 = new Perro1();
        perro1.nombre = "Rocky";
        perro1.raza = "Huskey";
        perro1.ladrar = false;
        
        // Crear objeto de la clase hija 2
        Perro2 perro2 = new Perro2();
        perro2.nombre = "Duncan";
        perro2.raza = "Labrador Retiever";
        perro2.edad = 7;
 
        // Métodos heredados a clase Hija 1
        perro1.comer();
        perro1.dormir();
        perro1.raza();
        System.out.println("----------------------");
        
        // Métodos heredados a clase Hija 2
        perro2.comer();
        perro2.dormir();
        perro2.raza();
        System.out.println("----------------------");
 
        // Método propio de la clase hija 1
        perro1.ladrar();
        System.out.println("----------------------");
        
        // Método propio de la clase hija 2
        perro2.edad();
        System.out.println("----------------------");
    }
    
}

// Clase padre
class Animal {
 
    String nombre;
    String raza;
 
    public void comer() {
        System.out.println(nombre + " esta comiendo");
    }
 
    public void dormir() {
        System.out.println(nombre + " esta durmiendo");
    }
    
    public void raza(){
        System.out.println(nombre + " es de raza: " + raza);
    }
}

// Clase hija 1
class Perro1 extends Animal {
 
    boolean ladrar;
    
    public void ladrar() {
        
        if(ladrar == true){
            String ladro = " esta ladrando";
            
            System.out.println(nombre + ladro);
        } else {
            String ladro = " no esta ladrando";
            
            System.out.println(nombre + ladro);
        }
        
    }
}

// Clase hija 2
class Perro2 extends Animal {
 
    int edad;
    
    public void edad() {
        System.out.println(nombre + " tiene " + edad + " anios");
    }
}
