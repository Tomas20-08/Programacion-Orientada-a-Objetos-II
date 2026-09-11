
package JOptionPane01;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el número 1: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el número 2: "));

        // Crear objeto clase Operacion
        Operacion op = new Operacion();

        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);

        // No requiere argumento, el método no tiene parámetros
        op.mostrarRes();
    }
}