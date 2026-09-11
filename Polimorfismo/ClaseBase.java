
package Polimorfismo;

// Clase base (normal, no abstracta)
class Figura {
 
    // Método que será sobrescrito
    double calcularArea() {
        return 0;
    }
}
 
// Clase Circulo
class Circulo extends Figura {
 
    double radio;
 
    public Circulo(double radio) {
        this.radio = radio;
    }
 
    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}
 
// Clase Rectangulo
class Rectangulo extends Figura {
 
    double base;
    double altura;
 
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
 
    @Override
    double calcularArea() {
        return base * altura;
    }
}
 
// Clase Triangulo
class Triangulo extends Figura {
 
    double base;
    double altura;
 
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
 
    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }
}

public class ClaseBase {
    
    public static void main(String[] args) {
        
         
        // Polimorfismo
        Figura f1 = new Circulo(5);
        Figura f2 = new Rectangulo(4, 6);
        Figura f3 = new Triangulo(3, 8);
 
        System.out.println("Área del círculo: " + f1.calcularArea());
        System.out.println("Área del rectángulo: " + f2.calcularArea());
        System.out.println("Área del triángulo: " + f3.calcularArea());

    }
    
}
