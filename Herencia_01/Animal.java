
package Herencia_01;

class Animal {
 
    String nombre;
    String raza;
 
    public void comer() {
        System.out.println(nombre + " esta comiendo");
    }
 
    public void dormir() {
        System.out.println(nombre + " esta durmiendo");
    }
    
    public void raza(){
        System.out.println(nombre + " es de raza: " + raza);
    }
}
