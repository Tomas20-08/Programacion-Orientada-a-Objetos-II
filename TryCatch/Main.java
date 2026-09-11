package TryCatch;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        double n1 = 0, n2 = 0;

        // Validación n1
        while (true) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite el número 1: ");
                n1 = Double.parseDouble(entrada);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor ingrese un número válido.");
            }
        }

        // Validación n2
        while (true) {
            try {
                String entrada = JOptionPane.showInputDialog("Digite el número 2: ");
                n2 = Double.parseDouble(entrada);
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor ingrese un número válido.");
            }
        }

        Operacion op = new Operacion();

        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        op.promedio(n1, n2);
        op.potencia(n1);

        op.mostrarRes();
    }
}