
package Taller_POO_Ejercicio04;

public class CuentaBancaria {
 
    // ATRIBUTOS
    private String titular;
    private double saldo;
 
    // CONSTRUCTOR
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo   = (saldoInicial >= 0) ? saldoInicial : 0; 
    }
 
    // GETTERS
    public String getTitular(){
        return titular; 
    }
    public double getSaldo(){
        return saldo;   
    }
 
    // METODO 
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito: " + cantidad + " | Saldo: " + saldo);
        } else {
            System.out.println("Error: la cantidad debe ser positiva.");
        }
    }
 
    // METODO
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: cantidad inválida.");
        } else if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro: " + cantidad + " | Saldo: " + saldo);
        }
    }
}

