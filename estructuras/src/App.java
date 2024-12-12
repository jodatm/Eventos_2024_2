import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack <Integer>pila = new Stack<Integer>();
        pila.push(5);
        pila.push(6);
        pila.push(7);
        //System.out.println(pila.pop());
        //System.out.println(pila.peek());

        Queue <Double>cola = new LinkedList<Double>();
        cola.add(2.3);
        cola.add(2.4);
        cola.add(2.5);
        System.out.println(cola.poll());

        Set <Integer>conjunto = new HashSet<Integer>();
        conjunto.add(4);
        conjunto.add(3);
        conjunto.add(4);
        for(Integer i :conjunto){
            System.out.println(i);
        }

        /*HashMap<String, ArrayList<String>> hmap = new HashMap<String,ArrayList<String>>();
        ArrayList<String>nombresC = new ArrayList<String>();
        nombresC.add("camila");
        nombresC.add("casio");
        nombresC.add("camabunga");
        hmap.put("c", nombresC );*/
        HashMap<String, HashMap<String, ArrayList<String>>> hmap = new HashMap<String, HashMap<String, ArrayList<String>>>();
        
        HashMap<String, ArrayList<String>> hmap2 = new HashMap<String, ArrayList<String>>();
        
        ArrayList<String>nombresCA = new ArrayList<String>();
        nombresCA.add("camila");
        nombresCA.add("casio");
        nombresCA.add("casasa");
        hmap2.put("ca", nombresCA );

        ArrayList<String>nombresCE = new ArrayList<String>();
        nombresCE.add("ceride");
        nombresCE.add("cecilia");
        nombresCE.add("cemamo");
        hmap2.put("ce", nombresCE );

        hmap.put("c", hmap2);
 

        String nombre = "ceride";
        System.out.println();
        for(String nombreI : hmap.get(nombre.charAt(0)+"").get(Character.toString(nombre.charAt(0)) +Character.toString(nombre.charAt(1))+"")){
            if(nombreI.equals(nombre)){
                System.out.println(nombre + " si esta en el hash");
            }
        }
        
    }
}
