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
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

import filesManagment.ManejaArchivos;

public class App2 extends JFrame implements ActionListener{
    
    Container contenedor;
    JButton seleccionarDic, mostrarDic, insertar;
    JTextField campo1, campo2, campo3;

    public App2(){
        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        campo1 = new JTextField(10);
        contenedor.add(campo1);

        campo2 = new JTextField(10);
        contenedor.add(campo2);

        campo3 = new JTextField(10);
        contenedor.add(campo3);

        seleccionarDic = new JButton("Seleccionar Diccionario");
        seleccionarDic.addActionListener(this);
        contenedor.add(seleccionarDic);

        mostrarDic = new JButton("Mostrar Diccionario");
        mostrarDic.addActionListener(this);
        contenedor.add(mostrarDic);

        insertar = new JButton("Insertar traduccion");
        insertar.addActionListener(this);
        contenedor.add(insertar);

        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        App2 app = new App2();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==seleccionarDic){
            JFileChooser chooser = new JFileChooser();
            int opcion = chooser.showOpenDialog(contenedor);
            if(opcion==JFileChooser.APPROVE_OPTION){
                File archivoSeleccionado = chooser.getSelectedFile();
                System.out.println(archivoSeleccionado.getName());
            }
        }else if(e.getSource()==mostrarDic){
            ManejaArchivos manejador = new ManejaArchivos();
            manejador.mostrarDiccionario();
        }else if(e.getSource()==insertar){
            String palabraEspañol = campo1.getText();
            String palabraIngles = campo2.getText();
            String palabraFrances = campo3.getText();

            ManejaArchivos manejador = new ManejaArchivos();
            manejador.insertarPalabra(palabraEspañol,palabraIngles,palabraFrances);
            
        }
    }
}

