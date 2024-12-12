package vista;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controlador.ControladorCalculadora;

public class CalculadoraGUI extends JFrame implements CalculadoraInterfaz{

    Container contenedor;
    JTextField numero1, numero2;
    public static JButton sumar, restar, multiplicacion;

    public CalculadoraGUI() {
        contenedor = getContentPane();
        FlowLayout flowLayout = new FlowLayout();
        contenedor.setLayout(flowLayout);
        numero1 = new JTextField(10);
        contenedor.add(numero1);

        numero2 = new JTextField(10);
        contenedor.add(numero2);

        sumar = new JButton("+");
        sumar.addActionListener(null);
        contenedor.add(sumar);

        restar = new JButton("-");
        contenedor.add(restar);

        multiplicacion = new JButton("X");
        contenedor.add(multiplicacion);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
    }

    @Override
    public int getNumero1() {
        return Integer.parseInt(numero1.getText());
    }

    @Override
    public int getNumero2() {
        return Integer.parseInt(numero2.getText());
    }

    @Override
    public void mostrarResultado(String resultado) {
        JOptionPane.showMessageDialog(null, resultado);    
    }

    @Override
    public void iniciar(ControladorCalculadora controlador) {
        sumar.addActionListener(controlador);
        restar.addActionListener(controlador);
        multiplicacion.addActionListener(controlador);
        setVisible(true);    
    }
    
}
