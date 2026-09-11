
//Crea una clase Calculadora que tenga:

//Un método sumar(int a, int b)
//Un método sumar(double a, double b)
//Un método sumar(int a, int b, int c)
//En el main:

//Llama a cada método
//Muestra los resultados



package Polimorfismo;

//Clase Base
class Calculadora{
    
    // Método que será sobrescrito
    
    // Método 1: dos enteros
    int Sumar(int a, int b) {
        return a + b;
    }
 
    // Método 2: dos decimales
    double Sumar(double a, double b) {
        return a + b;
    }
 
    // Método 3: tres enteros
    int Sumar(int a, int b, int c) {
        return a + b + c;
    }
}
    

public class Ejercicio06 {

    public static void main(String[] args) {
        
        Calculadora calcular = new Calculadora();
 
        System.out.println("Sumar    dos enteros (6 + 7): " + calcular.Sumar(6, 7));
        System.out.println("Sumar dos decimales (6.7 + 1.3): " + calcular.Sumar(6.7, 1.3));
        System.out.println("Sumar tres enteros (13 + 67 + 69): " + calcular.Sumar(13, 67, 69));

    }
    
}


