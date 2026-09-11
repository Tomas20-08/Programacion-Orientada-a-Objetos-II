
package JOptionPane03;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el número 1: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el número 2: "));

        Operacion op = new Operacion();

        // Opción A: guardar en variables y pasar a mostrarRes
        double suma         = op.sumar(n1, n2);
        double resta        = op.restar(n1, n2);
        double multiplicacion = op.multiplicar(n1, n2);
        double division     = op.dividir(n1, n2);
        op.mostrarRes(suma, resta, multiplicacion, division);

    }
}
