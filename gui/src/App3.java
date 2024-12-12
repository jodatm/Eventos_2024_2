import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App3 extends JFrame {

    Container contenedor;
    BorderLayout layout;

    public App3(){
        contenedor = getContentPane();
        layout = new BorderLayout(20,20);
        contenedor.setLayout(layout);

        JButton boton1 = new JButton("ya casi es el almuerzo!");
        contenedor.add(boton1, BorderLayout.SOUTH);

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
        App3 app3 = new App3();
    }
}
