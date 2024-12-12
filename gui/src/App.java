import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class App extends JFrame implements ActionListener, ItemListener {
    public static void main(String[] args) throws Exception {
        App app = new App();
    }

    Container contenedor;
    JLabel etiqueta2, etiqueta1;
    JTextField campo1, campo2;
    JButton button1;
    JRadioButton radio1, radio2, radio3;
    JCheckBox check1, check2, check3;
    ButtonGroup grupo;
    JComboBox <String> combo;
    String listaColores [] = {"amarillo","azul","rojo"};

    public App(){
        super("Univalle");

        contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        
        etiqueta2 = new JLabel("???");
        etiqueta2.setFont(new Font("arial", Font.BOLD,60));
        contenedor.add(etiqueta2);
        etiqueta1 = new JLabel("Eventos univalle 2024-2");
        ImageIcon icono = new ImageIcon("auron2.jpg");
        //etiqueta1.setIcon(icono);
        //contenedor.add(etiqueta1);

        campo1 = new JTextField(10);
        campo1.addActionListener(this);
        contenedor.add(campo1);

        campo2 = new JPasswordField(10);
        contenedor.add(campo2);

        button1 = new JButton("Aceptar");
        //button1.setEnabled(false);
        button1.addActionListener(this);
        contenedor.add(button1);

        radio1 = new JRadioButton("Casado");
        radio1.addItemListener(this);
        contenedor.add(radio1);
        radio2 = new JRadioButton("Soltero");
        radio2.addItemListener(this);
        contenedor.add(radio2);
        radio3 = new JRadioButton("Casado pero se comporta como soltero");
        radio3.addItemListener(this);
        contenedor.add(radio3);

        grupo = new ButtonGroup();
        grupo.add(radio1);
        grupo.add(radio2);
        grupo.add(radio3);

        check1 = new JCheckBox("Vivienda");
        contenedor.add(check1);
        check2 = new JCheckBox("Jovenes");
        contenedor.add(check2);
        check3 = new JCheckBox("Viudez");
        contenedor.add(check3);

        
        combo = new JComboBox<String>(listaColores);
        contenedor.add(combo);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            //JOptionPane.showMessageDialog(null, "boton");
            
            JOptionPane.showMessageDialog(null,combo.getSelectedIndex());
        }else if(e.getSource() == campo1){
            JOptionPane.showMessageDialog(null, "campo");
        }
            
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange()==1){
            /*if(e.getSource()==radio1){
                JOptionPane.showMessageDialog(null, "Casado");
            }else if(e.getSource()==radio2){
                JOptionPane.showMessageDialog(null, "Soltero");
            }else{
                JOptionPane.showMessageDialog(null, "No se sabe");
            }*/
             
            //JButton botonS = (JButton) grupo.getSelection();
            //System.out.println(botonS.getText());
        }
        
    }
}
