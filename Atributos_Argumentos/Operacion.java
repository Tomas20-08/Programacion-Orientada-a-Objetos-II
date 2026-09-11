package Atributos_Argumentos;
 
public class Operacion {
    //Atributos
    int suma;
    int resta;
    int multiplicacion;
    int division;
    //Metodo para sumar ambis numeros
    public void sumar (int n1, int n2){
        suma = n1 + n2;
    }
    //Metodo para sumar ambis numeros
    public void restar (int n1, int n2){
        resta = n1 - n2;
    }
    //Metodo para sumar ambis numeros
    public void multiplicar (int n1, int n2){
        multiplicacion = n1 * n2;
    }
    //Metodo para sumar ambis numeros
    public void dividir (int n1, int n2){
        division = n1 / n2;
    }
    public void mostrarResultados(){
            System.out.println("La Suma es: " + suma);
            System.out.println("La Resta es: " + resta);
            System.out.println("La Multiplicacion es: " + multiplicacion);
            System.out.println("La Divsion es: " + division);
        }
}