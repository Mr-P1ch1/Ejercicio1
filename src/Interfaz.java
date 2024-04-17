import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz {
    private JPanel Interfaz;
    private JTextField datos; // Campo para ingresar la expresión
    private JButton validarButton;       // Botón para validar la expresión
    private JTextArea texto1;   // Área de texto para mostrar si la expresión es válida o no
    private JTextArea texto2;   // Área de texto para mostrar el número de elementos de apertura
    private JTextArea texto3;   // Área de texto para mostrar el número de elementos de cierre
    private JLabel Titulo;

    public Interfaz() {
        validarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Formula formula = new Formula();
                formula.ingresarExpresion(datos.getText());
                texto1.setText(formula.validarExpresion() ? "Expresión válida" : "Expresión inválida");
                texto2.setText("Número de elementos de apertura: " + formula.contarElementosApertura());
                texto3.setText("Número de elementos de cierre: " + formula.contarElementosCierre());

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Interfaz");
        frame.setContentPane(new Interfaz().Interfaz);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}



