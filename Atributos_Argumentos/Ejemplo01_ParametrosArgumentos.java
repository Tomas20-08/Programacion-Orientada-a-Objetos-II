package Atributos_Argumentos;
 
import javax.swing.JOptionPane;
 
public class Ejemplo01_ParametrosArgumentos {
 
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero Entero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un Numero Entero: "));
        Operacion op = new Operacion();
        op.sumar(n1,n2);
        op.restar(n1,n2);
        op.multiplicar(n1,n2);
        op.dividir(n1,n2);
        op.mostrarResultados();
 
    }
}