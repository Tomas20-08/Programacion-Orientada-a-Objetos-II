
package JOptionPane02;

import javax.swing.JOptionPane;

public class Operacion {
    // Atributos
    double suma;
    double resta;
    double multiplicacion;
    double division;
    double promedio;
    double potencia;
   
    
    // Método para sumar los números
    public void sumar(double numero1, double numero2){
        suma = numero1 + numero2;
    }

    // Método para restar los números
    public void restar(double numero1, double numero2){
        resta = numero1 - numero2;
    }

    // Método para multiplicar los números
    public void multiplicar(double numero1, double numero2){
        multiplicacion = numero1 * numero2;
    }

    // Método para dividir los números
    public void dividir(double numero1, double numero2){
        division = numero1 / numero2;
    }
    
    //Método para promediar los numeros
    public void promedio(double numero1, double numero2){
        promedio = (numero1 + numero2)/2;
    }
    
    //Método para potenciar los numeros
    public void potencia(double numero1){
        potencia = Math.pow(10, numero1);
    }
    
    //Método para mostrar resultados (Consola y JOptionPane)
    public void mostrarRes(){
            System.out.println("La suma es: " + suma);
            System.out.println("La resta es: " + resta);
            System.out.println("La multiplicacion es: " + multiplicacion);
            System.out.println("La division es: " + division);
            System.out.println("El promeido es: " + promedio);
            System.out.println("La potencia es: " + potencia);
        
        JOptionPane.showMessageDialog(null, " La suma es: " + suma );
        JOptionPane.showMessageDialog(null, " La resta es: " + resta );
        JOptionPane.showMessageDialog(null, " La multiplicacion es: " + multiplicacion );
        JOptionPane.showMessageDialog(null, " La division es: " + division );
        JOptionPane.showMessageDialog(null, " El promeido es: " + promedio );
        JOptionPane.showMessageDialog(null, " La potencia es: " + potencia);
    }
}
