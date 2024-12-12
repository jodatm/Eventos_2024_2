package filesManagment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ManejaArchivos {
    
    public String buscarTraduccion(String palabra, String idioma){
        String palabraTraducida = "No hay traducción";

        File archivo = new File("files/diccionario.txt");
        
        try {
            RandomAccessFile buffer = new RandomAccessFile(archivo,"r");
            String linea = buffer.readLine();
            while(linea!=null){
                StringTokenizer tokens = new StringTokenizer(linea,",");
                if(palabra.equals(tokens.nextToken())){
                    if(idioma.equals("ingles")){
                        palabraTraducida = tokens.nextToken();
                    }else if(idioma.equals("frances")){
                        tokens.nextToken();
                        palabraTraducida = tokens.nextToken();
                    }
                    
                }
                linea = buffer.readLine();
            }
            buffer.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        
        return palabraTraducida;
    }

    public void mostrarDiccionario(){
        File archivo = new File("files/diccionario.txt");
        
        try {
            RandomAccessFile buffer = new RandomAccessFile(archivo,"r");
            String linea = buffer.readLine();
            DefaultTableModel modelo = new DefaultTableModel();
            JTable tabla = new JTable(modelo);
            JScrollPane scroll = new JScrollPane(tabla);
            modelo.addColumn("Palabra español");
            modelo.addColumn("Palabra ingles");
            modelo.addColumn("Palabra frances");
            while(linea!=null){
                StringTokenizer tokens = new StringTokenizer(linea,",");
                Object fila [] = new Object[3];
                fila[0] = tokens.nextToken();
                fila[1] = tokens.nextToken();
                fila[2] = tokens.nextToken();
                modelo.addRow(fila);
                linea = buffer.readLine();
            }
            JOptionPane.showMessageDialog(null, scroll);
            buffer.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void insertarPalabra(String palabraEspañol, String palabraIngles,
    String palabraFraces){
        File file = new File("files/diccionario.txt");
        try {
            RandomAccessFile buffer = new RandomAccessFile(file, "rw");
            buffer.seek(file.length());
            buffer.writeUTF("\n"+palabraEspañol+","+palabraIngles+","+palabraFraces);
            buffer.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
