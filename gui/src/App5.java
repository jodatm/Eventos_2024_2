import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class App5 extends JFrame {

    Container contenedor;
    GridLayout layout;

    public App5(){
        contenedor = getContentPane();
        layout = new GridLayout(2,2);
        contenedor.setLayout(layout);

        JPanel panel1 = new JPanel();
        BorderLayout bg = new BorderLayout();
        panel1.setLayout(bg);

        JPasswordField contraseña = new JPasswordField(5);
        panel1.add(contraseña, BorderLayout.NORTH);

        JPasswordField contraseña2 = new JPasswordField(5);
        panel1.add(contraseña2, BorderLayout.CENTER);

        JTextField campo1 = new JTextField(5);
        panel1.add(campo1, BorderLayout.SOUTH);

        contenedor.add(panel1, BorderLayout.SOUTH);

        JButton boton2 = new JButton("Faltan 40 minutos!");
        contenedor.add(boton2, BorderLayout.NORTH);

        JButton boton3 = new JButton("Grande");
        contenedor.add(boton3, BorderLayout.CENTER);

        JButton boton4 = new JButton(":)");
        contenedor.add(boton4, BorderLayout.WEST);

        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        App5 app3 = new App5();
    }
}

