import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.util.concurrent.Flow;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import filesManagment.ManejaArchivos;

public class App extends JFrame implements ActionListener{
    
    Container contenedor;
    JButton traducirIngles,traducirFrances;
    JTextField campo1, campo2;

    public App(){
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        campo1 = new JTextField(10);
        contenedor.add(campo1);

        campo2 = new JTextField(10);
        campo2.setEditable(false);
        contenedor.add(campo2);

        traducirIngles = new JButton("Traducir Ingles");
        traducirIngles.addActionListener(this);
        contenedor.add(traducirIngles);

        traducirFrances = new JButton("Traducir Frances");
        traducirFrances.addActionListener(this);
        contenedor.add(traducirFrances);

        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        App app = new App();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String palabraSpanish = campo1.getText();    

        String idioma = "";
        if(e.getSource()==traducirIngles){
            idioma = "ingles";
        }if(e.getSource()==traducirFrances){
            idioma = "frances";
        }

        ManejaArchivos manejaArchivos = new ManejaArchivos();
        String palabraIngles = manejaArchivos.buscarTraduccion(palabraSpanish,idioma);
        campo2.setText(palabraIngles);
    }
}
