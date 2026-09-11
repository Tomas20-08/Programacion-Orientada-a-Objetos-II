
package JOptionPane03;

public class Operacion {
    // Sin atributos / sin variables globales

    // Método para sumar los números
    public double sumar(double numero1, double numero2){
        double suma = numero1 + numero2;
        return suma;
    }

    // Método para restar los números
    public double restar(double numero1, double numero2){
        double resta = numero1 - numero2;
        return resta;
    }

    // Método para multiplicar los números
    public double multiplicar(double numero1, double numero2){
        double multiplicacion = numero1 * numero2;
        return multiplicacion;
    }

    // Método para dividir los números
    public double dividir(double numero1, double numero2){
        double division = numero1 / numero2;
        return division;
    }

    // Método mostrarRes con parámetros (versión alternativa)
    public void mostrarRes(double suma, double resta, double multiplicacion, double division){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}