package TryCatch;

import javax.swing.JOptionPane;

public class Operacion {
    double suma;
    double resta;
    double multiplicacion;
    double division;
    double promedio;
    double potencia;
    String mensajeDivision;

    public void sumar(double numero1, double numero2) {
        suma = numero1 + numero2;
    }

    public void restar(double numero1, double numero2) {
        resta = numero1 - numero2;
    }

    public void multiplicar(double numero1, double numero2) {
        multiplicacion = numero1 * numero2;
    }

    public void dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            mensajeDivision = "N/A";
            JOptionPane.showMessageDialog(null, "Advertencia: el número 2 es 0. La división no está definida.");
        } else {
            division = numero1 / numero2;
            mensajeDivision = null;
        }
    }

    public void promedio(double numero1, double numero2) {
        promedio = (numero1 + numero2) / 2;
    }

    public void potencia(double numero1) {
        potencia = Math.pow(10, numero1);
    }

    public void mostrarRes() {
        // Consola
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + (mensajeDivision != null ? mensajeDivision : division));
        System.out.println("El promedio es: " + promedio);
        System.out.println("La potencia es: " + potencia);

        // Ventanas
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
        JOptionPane.showMessageDialog(null, "La resta es: " + resta);
        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multiplicacion);
        JOptionPane.showMessageDialog(null, "La division es: " + (mensajeDivision != null ? mensajeDivision : division));
        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
        JOptionPane.showMessageDialog(null, "La potencia es: " + potencia);
    }
}