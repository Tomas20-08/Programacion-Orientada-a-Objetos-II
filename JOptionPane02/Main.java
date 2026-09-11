
package JOptionPane02;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        double n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el número 1: "));
        double n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el número 2: "));
     
        // Crear objeto
        Operacion op = new Operacion();

        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        op.promedio(n1,n2);
        op.potencia(n1);
        
        op.mostrarRes();
    }
}