import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class App2 extends JFrame implements MouseListener, KeyListener{
    
    boolean entroGUI = false;
    boolean presionoZ = false;
    int x1,x2,y1,y2 = -1;

    public App2(){
        addMouseListener(this);
        addKeyListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }

    public void paint(Graphics g){
        if(entroGUI){
            g.setColor(Color.RED);
            g.fillRect(0, 0, 400, 400);
        }
        else{
            g.setColor(Color.GRAY);
            g.fillRect(0, 0, 400, 400);
        }
        if(x1!=-1&&y1!=-1&&x2!=-1&&y2!=-1){
            g.setColor(Color.WHITE);
            g.drawLine(x1, y1, x2, y2);
            x1= -1;
            y1= -1;
            x2= -1;
            y2=  -1;
        }
        if(presionoZ){
            int x_r = (int) (Math.random() * 200);
            int y_r = (int) (Math.random() * 200);
            g.setColor(Color.MAGENTA);
            g.drawOval(x_r, y_r, 50, 50);
        }
        

        g.setColor(Color.BLACK);
        g.fillRect(50, 50, 100, 200);
        g.drawOval(200, 200, 45, 45);
        g.setColor(Color.BLUE);
        g.fillOval(275, 275, 50, 50);
        g.setColor(Color.RED);
        g.drawString("Hola", 300, 50);
    }

    public static void main(String[] args) {
        App2 app = new App2();    
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        JOptionPane.showMessageDialog(null,e.getButton());
        x1 = e.getX();
        y1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        entroGUI = !entroGUI;
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        entroGUI = !entroGUI;
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_Z){
            presionoZ = true;
            repaint();
        }
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
