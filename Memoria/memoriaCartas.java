import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

/**
 Clase Carta
 Esta clase hereda de JButton (Herencia). 
 Cada objeto Carta sabe quién es, qué valor tiene y si está volteada.
 */
class Carta extends JButton {
    
    // Encapsulación del estado
    private int id; 
    private boolean volteada = false;
    private boolean encontrada = false;
    private String valorOculto;

    // Constructor de la carta
    public Carta(int id, String valorOculto) {
        this.id = id;
        this.valorOculto = valorOculto;
        
        // Configuramos el aspecto inicial (GUI)
        this.setText("¿?"); 
        this.setFont(new Font("Papyrus", Font.BOLD, 30));
        this.setBackground(Color.LIGHT_GRAY);
    }

    /**
     Método para cambiar el estado de la carta (Encapsulación).
     Controla la lógica visual y el estado lógico al mismo tiempo.
     */
    public void voltear() {
        volteada = !volteada; // Cambiamos el estado booleano
        
        if (volteada) {
            // Si se voltea hacia arriba, mostramos el símbolo y desactivamos el botón
            this.setText(valorOculto);
            this.setEnabled(false); 
            this.setBackground(Color.DARK_GRAY);
        } else {
            // Si se voltea hacia abajo, ocultamos el símbolo y reactivamos el botón
            this.setText("¿?");
            this.setEnabled(true);
            this.setBackground(Color.LIGHT_GRAY);
        }
    }

    // Métodos Getter para acceder a la información
    public int getId() { return id; }
    public boolean estaEncontrada() { return encontrada; }
    public void setEncontrada(boolean encontrada) { this.encontrada = encontrada; }
}

/**
 CLASE PRINCIPAL: memoriaCartas
 Uso de Clases Anónimas para responder a los clics del usuario.
 */
public class memoriaCartas extends JFrame {
    
    // Atributos de la interfaz gráfica (GUI)
    
    // JPanel: Contenedor/lienzo donde pondremos los botones
    private JPanel panelCartas; 
    
    // JLabel: Etiqueta de texto simple para mostrar información al usuario
    private JLabel labelTimer;  
    
    // Atributos de lógica de juego
    
    // Guardamos objetos de tipo 'Carta'.
    // Permite usar Collections.shuffle: Sirve para barajar los elementos de una lista.
    private ArrayList<Carta> listaCartas; 
    
    // null: Punteros de control. 
    // Nos sirven para recordar qué carta tocó el usuario primero y cuál después.
    private Carta primeraSeleccionada = null;
    private Carta segundaSeleccionada = null;
    
    // Variables para llevar la cuenta del progreso
    private int segundos = 0;
    private int parejasEncontradas = 0; // Cuando llegue a 8, el juego termina.
    private Timer timerDeJuego;

    /**
     CONSTRUCTOR
     */
    public memoriaCartas() {
        // Ttítulo que aparece en la barra superior.
        setTitle("Juego Macizo de Memoria - Versión: Durisima 6.7");
        
        // Dimensiones
        setSize(700, 600);
        
        // Indica que el usuario cerró la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // BorderLayout divide la ventana en 5 zonas: Norte, Sur, Este, Oeste y Centro.
        setLayout(new BorderLayout());

        // 1. CONFIGURACIÓN DEL TEMPORIZADOR (ZONA NORTE)

        labelTimer = new JLabel("Tiempo: 0 segundos", SwingConstants.CENTER);
        
        labelTimer.setFont(new Font("Papyrus", Font.PLAIN, 40));
        
        // El BorderFactory añade un margen para que el texto no esté pegado al borde
        labelTimer.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        
        // Agregamos el componente a la zona NORTE del BorderLayout
        add(labelTimer, BorderLayout.NORTH);


        // 2. CONFIGURACIÓN DEL PANEL DE CARTAS (ZONA CENTRAL)

        // Crea una rejilla de 4x4 con 10px 
        panelCartas = new JPanel(new GridLayout(4, 6, 10, 10));
        
        // Añadimos margen alrededor del panel de cartas
        panelCartas.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // El centro es la zona que se expande automáticamente al redimensionar
        add(panelCartas, BorderLayout.CENTER);

 
        // 3. CARGA DE LÓGICA

        prepararCartas();      // Crea los objetos y los mezcla
        iniciarContadorTiempo();
        
        // Centra la ventana automáticamente
        setLocationRelativeTo(null); 
        
        // Hace que la ventana sea visible (por defecto los JFrames son invisibles)
        setVisible(true);
    }

    /**
     MÉTODO: prepararCartas
     Encargado de la instanciación de objetos y la aleatoriedad
     */
    private void prepararCartas() {
        // Inicializamos la lista de objetos tipo Carta
        listaCartas = new ArrayList<Carta>();
        
        // Símbolos de las cartas
        String[] simbolos = {"#", "@", "$", "&", "|", "∑", "π", "*", "%", "/", "~","°"};

        // BUCLE: Creamos 24 objetos 'Carta'. 
        // El bucle corre 8 veces, pero en cada vuelta añade 2 cartas con el mismo ID y símbolo
        for (int i = 0; i < simbolos.length; i++) {
            listaCartas.add(new Carta(i, simbolos[i]));
            listaCartas.add(new Carta(i, simbolos[i]));
        }

        // ALGORITMO DE MEZCLA: Desordena los objetos dentro del ArrayList
        Collections.shuffle(listaCartas);

        // BUCLE DE GUI: Recorre la lista ya mezclada para poner las cartas en pantalla
        for (int i = 0; i < listaCartas.size(); i++) {
            // Obtenemos la carta de la posición 'i'
            // 'final' es necesario para que la Clase Anónima de abajo pueda usar esta variable
            final Carta c = listaCartas.get(i);
            
            // ASIGNACIÓN DE EVENTO 
            // 'addActionListener' espera un objeto que sepa reaccionar a un clic.
            // Creamos una "Clase Anónima" (new ActionListener()) que implementa el método actionPerformed.
            c.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Cuando el usuario haga clic en esta carta específica, llamamos a la lógica.
                    manejarClicCarta(c);
                }
            });
            
            // Metemos el botón (carta) dentro del panel de la rejilla
            panelCartas.add(c);
        }
    }

    /**
     MÉTODO: iniciarContadorTiempo
     Maneja el segundero del juego usando un hilo independiente
     */
    private void iniciarContadorTiempo() {
        // Creamos un Timer de Swing: 
        // Parámetro 1: 1000 milisegundos (1 segundo)
        // Parámetro 2: La acción que se ejecutará cada vez que pase ese segundo
        timerDeJuego = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundos++; // Incrementamos el contador
                // Actualizamos el texto de la etiqueta en la interfaz
                labelTimer.setText("Tiempo: " + segundos + " segundos");
            }
        });
        
        // Arrancamos el cronómetro
        timerDeJuego.start();
    }

    /**
     MÉTODO: manejarClicCarta
     */
    private void manejarClicCarta(Carta carta) {
        // Si el usuario hace varios clics y ya hay 2 cartas dadas vuelta, no hacemos nada hasta que el programa termine de comparar las anteriores.
        if (primeraSeleccionada != null && segundaSeleccionada != null) {
            return;
        }

        // Llamamos al método interno de la clase Carta (Encapsulación)
        carta.voltear(); 

        // LÓGICA DE SELECCIÓN:
        if (primeraSeleccionada == null) {
            // Si la variable está vacía, significa que es la primera carta del par que toca
            primeraSeleccionada = carta;
        } else {
            // Si ya había una, esta es la segunda
            segundaSeleccionada = carta;
            // Mandamos a comparar los IDs para ver si son iguales
            verificarPareja();
        }
    }

    /**
     MÉTODO: verificarPareja
     */
    private void verificarPareja() {
        // Comparamos el ID de los dos objetos seleccionados
        if (primeraSeleccionada.getId() == segundaSeleccionada.getId()) {
            
            // CASO ÉXITO: Los IDs coinciden
            // Marcamos ambos objetos como 'encontrados' para que no se puedan volver a tocar
            primeraSeleccionada.setEncontrada(true);
            segundaSeleccionada.setEncontrada(true);
            
            // Vaciamos los punteros de control para que el usuario pueda elegir un nuevo par
            primeraSeleccionada = null;
            segundaSeleccionada = null;
            
            parejasEncontradas++; // Sumamos un punto

            // Si llegamos a 8, el tablero está lleno y el juego acaba.
            if (parejasEncontradas == 12) {
                timerDeJuego.stop(); // Detenemos el reloj
                // Mostramos un cuadro de diálogo emergente con el resultado.
                JOptionPane.showMessageDialog(this, "¡OSTIA CHAVAL, QUE HAS GANADO JIJIJIJA! Completado en " + segundos + "s");
            }
        } else {
            // CASO ERROR: No son iguales.
            // Usamos un Timer "delay" de 800ms. 
            // El usuario ve la carta que falló antes de ocultarla.
            Timer delay = new Timer(800, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Volvemos a ocultar ambas cartas.
                    primeraSeleccionada.voltear();
                    segundaSeleccionada.voltear();
                    
                    // Reseteamos las variables de control.
                    primeraSeleccionada = null;
                    segundaSeleccionada = null;
                }
            });
            // El delay solo debe dispararse UNA VEZ, no repetirse cada 800ms.
            delay.setRepeats(false); 
            delay.start();
        }
    }

    public static void main(String[] args) {
        // SwingUtilities.invokeLater:
        // Es una buena práctica de GUI. Asegura que la ventana se cree en el hilo correcto (Event Dispatch Thread) para evitar errores visuales o crasheos
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Instanciamos el objeto, lo que dispara el constructor y crea el juego.
                new memoriaCartas();
            }
        });
    }
}