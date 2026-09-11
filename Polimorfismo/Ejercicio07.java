
package Polimorfismo;

//Clase Login
class Login{
    //Metodo 1: usuario + contraseña
    void iniciarSesion(String usuario, String Contraseña){
        System.out.println("Inicio de sesion con Usuario: " + usuario);
    }
    
    //Metodo 2: correo + contraseña
    void iniciarSesion(String correo, String Contraseña, boolean esCorreo){
        System.out.println("Inicio de sesion con Correo: " + correo);
    }
    
    //Metodo 2: correo + contraseña
    void iniciarSesion(long celular){
        System.out.println("Inicio de sesion con Celular: " + celular);
    }
    
}

public class Ejercicio07 {

    public static void main(String[] args) {
        
        //Crear Objeto de la clase Login
        Login login = new Login();
        
        //Llamado a los diferentes metodos (sobrecarga)
        login.iniciarSesion("juan", "1234"); //Usuario
        login.iniciarSesion("juan@gmail.com","1234", true); //Correo 
        login.iniciarSesion(3001234567L); //Celular
    }
    
}

// Explicación del Codigo
// El codigo anterio utiliza el Polimorfismo Estático el cual se utiliza cuando hay varios metodos dentro de la clase
// "Login" que se llaman igual, pero reciben parametros diferentes, en este caso hay 3 metodos llamados iniciarSesion.
// Desde la clase principla (Main) se crea el objeto de la clase Login y luego es utilizado para enviar los datos a los 
// Metodos, el sistama al leer los tipo de datos ingresados y al estos concordar con alguno de los metodos los ejecuata.
// En este caso: El Metodo 1 tiene 2 datos String "Usuario" & "Contraseña", mientras que el Metodo 2 de igual manera tiene 
// 2 datos String y Un dato Boleano "Correo" , "Contraseña" & "esCorreo". Por ultimo el Metodo 3 posee un dato Long "Celular"
// y estos datos concuerdan con los datos enviados desde el main, haciendo que se ejecuten y den la respuesta que esta dentro
// de cada metodo dependiendo de los paramentro enviados.

//Clase Login

    //Metodo 1: usuario + contraseña
        //System.out.println("Inicio de sesion con Usuario: " + usuario);
    
    //Metodo 2: correo + contraseña
        //System.out.println("Inicio de sesion con Correo: " + correo);
    
    //Metodo 2: correo + contraseña
        //System.out.println("Inicio de sesion con Celular: " + celular);
