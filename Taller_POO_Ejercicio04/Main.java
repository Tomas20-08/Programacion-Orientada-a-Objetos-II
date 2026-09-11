// EJERCICIO 4
// 1. ATRIBUTOS: titular, saldo
// 2. METODOS: depositar(), retirar(), getTitular(), getSaldo()
// 3. PARAMETROS: constructor recibe (titular, saldoInicial), depositar() y retirar() reciben (double cantidad)
// 4. HERENCIA: no aplica
// 5. ENCAPSULAMIENTO: los atributos son private y solo se pueden modificar con los métodos depositar y retirar que incluyen validaciones

package Taller_POO_Ejercicio04;

// CLASE MAIN
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Maria Paula Gonzalez", 300000);
        cuenta.depositar(200000);         
        cuenta.retirar(100000);             
        cuenta.retirar(900000);          
        cuenta.retirar(-50);              
    }
}

