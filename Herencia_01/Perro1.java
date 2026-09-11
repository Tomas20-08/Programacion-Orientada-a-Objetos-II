
package Herencia_01;

// Clase hija 1
class Perro1 extends Animal {
 
    boolean ladrar;
    
    public void ladrar() {
        
        if(ladrar == true){
            String ladro = " esta ladrando";
            
            System.out.println(nombre + ladro);
        } else {
            String ladro = " no esta ladrando";
            
            System.out.println(nombre + ladro);
        }
        
    }
}
