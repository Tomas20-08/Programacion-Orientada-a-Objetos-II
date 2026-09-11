
package JOptionPane01;

public class Operacion {
    // Atributos (variables globales, fuera de un método)
    int suma;
    int resta;
    int multiplicacion;
    int division;

    // Método para sumar los números
    public void sumar(int numero1, int numero2){
        suma = numero1 + numero2;
    }

    // Método para restar los números
    public void restar(int numero1, int numero2){
        resta = numero1 - numero2;
    }

    // Método para multiplicar los números
    public void multiplicar(int numero1, int numero2){
        multiplicacion = numero1 * numero2;
    }

    // Método para dividir los números
    public void dividir(int numero1, int numero2){
        division = numero1 / numero2;
    }

    // Método sin parámetros
    public void mostrarRes(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}
