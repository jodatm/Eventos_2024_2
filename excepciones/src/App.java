import java.util.InputMismatchException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

public class App implements ActionListener{
    public static void main(String[] args) throws Exception {
        Scanner scanner  = new Scanner(System.in);
        try{
            int creditos = scanner.nextInt();
            if(creditos < 0){
                throw new CreditosException("No creditos negativos");
            }
            if(creditos >= 9){
                throw new CreditosException("No puede pasar de 9");
            }
            double a = 1/0;
        }catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null,"NO hagas divisones por 0");
        }catch(InputMismatchException ex){
            JOptionPane.showMessageDialog(null,"Son digitos! 0,1,2");
        }catch(CreditosException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"algo sucedio");
        }
        System.out.println("Hello, World!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        division(5,0);    
        leerCreditos();
        try{
            leerArchivos();
        }catch(IOException ex){
        
        }
        
    }

    public int division(int a, int b) throws ArithmeticException {
        return a/b;
    }
    public void leerCreditos() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextInt());
    }

    public void leerArchivos() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextInt());
    }
}
