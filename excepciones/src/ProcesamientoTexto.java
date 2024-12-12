import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.StringTokenizer;

public class ProcesamientoTexto {
    
    public String traduccion(String valluno, String idioma){
        File file = new File("files/modismos.txt");
        try {
            RandomAccessFile raf = new RandomAccessFile(file,"r");
            String linea = raf.readLine();
            while(linea!=null){
                StringTokenizer tokens = new StringTokenizer(linea,",");
                if(tokens.nextToken().equals(valluno)){
                    if(idioma.equals("antioqueño")){
                        return tokens.nextToken();
                    }else if(idioma.equals("costeño")){
                        tokens.nextToken();
                        return tokens.nextToken();
                    }
                    
                }
                linea = raf.readLine();
            }
            raf.close();
            return "No existe la traduccion";
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "No existe la traduccion";
    }

    public void agregarPalabra(String palabra){
        File file = new File("files/modismos.txt");
        try {
            RandomAccessFile f = new RandomAccessFile(file, "rw");
            f.seek(f.length());
        f.writeBytes("\n"+palabra);
            f.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
    }

}
