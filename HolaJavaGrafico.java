import java.awt.*;
import java.awt.event.*;

public class HolaJavaGrafico {
    // Constantes para el tamaño de la ventana
    private static final int WIDTH = 600;
    private static final int HEIGHT = 800;

    private Frame frame;
    private Label label;
    private TextField textField;
    private Button button;

    public HolaJavaGrafico() {
        // Crear y configurar la ventana
        frame = new Frame("Hola Java Grafico");
        frame.setSize(WIDTH, HEIGHT);
        frame.setLayout(new FlowLayout()); // Usar FlowLayout para organizar los componentes

        // Crear y añadir componentes
        label = new Label("Escribe algo:");
        textField = new TextField(20);
        button = new Button("Mostrar");

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        // Añadir manejo de eventos para el botón
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                if (!text.isEmpty()) {
                    label.setText("Has escrito: " + text);
                } else {
                    label.setText("Escribe algo:");
                }
            }
        });

        // Añadir manejo de eventos para cerrar la ventana
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase para mostrar la ventana
        new HolaJavaGrafico();
    }
}
