//Reto (mezcla de ambos tipos)
//Crear una clase Impresora que tenga:
//Sobrecarga (estático)
//imprimir(String texto)
//imprimir(int numero)
//imprimir(String texto, int copias)
//Sobreescritura (dinámico)
//Crear: Clase base(Documento)

package Polimorfismo;

import java.util.ArrayList;
import java.util.List;

// Polimorfismo Estático
class Impresora {

    // Imprimir(String texto)
    void imprimir(String texto) {
        System.out.println("Imprimiendo: " + texto);
    }

    // Imprimir(int numero)
    void imprimir(int numero) {
        System.out.println("Imprimiendo número: " + numero);
    }

    // Imprimir(String texto, int copias)
    void imprimir(String texto, int copias) {
        for (int i = 1; i <= copias; i++) {
            System.out.println("Copia " + i + ": " + texto);
        }
    }
}

// Polimorfismo Dinámico
abstract class Documento {

    String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    abstract void imprimir();
}

// Documento WORD
class DocumentoWord extends Documento {

    public DocumentoWord(String titulo) {
        super(titulo);
    }

    @Override
    void imprimir() {
        System.out.println("[Word] Documento: " + titulo + ".docx");
    }
}

// Documento PDF
class DocumentoPDF extends Documento {

    public DocumentoPDF(String titulo) {
        super(titulo);
    }

    @Override
    void imprimir() {
        System.out.println("[PDF] Documento: " + titulo + ".pdf");
    }
}

// Main Class
public class Ejercicio09 {

    public static void main(String[] args) {
        
        // Sobrecarga(Estático)
        System.out.println("SOBRECARGA (Estatico)");
        Impresora impresora = new Impresora();

        impresora.imprimir("Taller 4 - Polimorfismos");
        impresora.imprimir(67);
        impresora.imprimir("Guia_4_POO", 4);

        // Sobreescritura (Dinamico)
        System.out.println();
        System.out.println("SOBREESCRITURA (Dinamico)");
        List<Documento> documentos = new ArrayList<>();
        documentos.add(new DocumentoWord("Taller 4 - Polimorfismos"));
        documentos.add(new DocumentoPDF("Guia_4_POO"));

        for (Documento d : documentos) {
            d.imprimir();
        }

    }
    
}



