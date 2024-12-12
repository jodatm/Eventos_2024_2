import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class App3 extends JFrame implements ActionListener{

    Container contenedor;
    JTextField palabraValluno, palabraAntioqueño, palabraNueva;
    JButton botonTraducir, botonCosteño, botonAgregar;
    
    public App3() {
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        palabraValluno = new JTextField(10);
        contenedor.add(palabraValluno);

        palabraAntioqueño = new JTextField(20);
        palabraAntioqueño.setEditable(false);
        contenedor.add(palabraAntioqueño);

        botonTraducir = new JButton("Traducir Antioqueño");
        botonTraducir.addActionListener(this);
        contenedor.add(botonTraducir);

        botonCosteño = new JButton("Traducir Costeño");
        botonCosteño.addActionListener(this);
        contenedor.add(botonCosteño);

        palabraNueva = new JTextField(20);
        contenedor.add(palabraNueva);

        botonAgregar = new JButton("Agregar palabra");
        botonAgregar.addActionListener(this);
        contenedor.add(botonAgregar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ProcesamientoTexto process = new ProcesamientoTexto();
        if(e.getSource()==botonAgregar){
            String palabra = palabraNueva.getText();
            process.agregarPalabra(palabra);
        }
        else{
            String idioma = "";
            if(e.getSource()==botonTraducir){
                idioma = "antioqueño";
            }
            if(e.getSource()==botonCosteño){
                idioma = "costeño";
            }
            String valluno = palabraValluno.getText();
            
            palabraAntioqueño.setText(process.traduccion(valluno,idioma));
        }
            
    }

    public static void main(String[] args) {
        App3 app = new App3();
    }
    
}
