import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //JOptionPane.showMessageDialog(null,Constantes.autor);
        ArrayList <Estudiante<String,Integer>> estudiantes = new ArrayList <Estudiante<String,Integer>>();
        Programa ingenieriaDeSistemas = new Programa("Ingenieria de sistemas",estudiantes);
        Estudiante <String,String> estudiante1 = new Estudiante<String,String>("Susana",
        "1234", ingenieriaDeSistemas, "123", "1230");

        Estudiante <Integer,Integer> estudiante2 = new Estudiante<Integer,Integer>("Andres",
        "4567", ingenieriaDeSistemas, 3, 34);

        /*Estudiante <Double> estudiante3 = new Estudiante<Double>("Andrea",
        "5678", ingenieriaDeSistemas, 3.5);

        Estudiante <Byte> estudiante4 = new Estudiante<Byte>("Rafael",
        "5678", ingenieriaDeSistemas, (byte)2);*/

        /*for(Estudiante estudiante: estudiantes) {
            System.out.println(estudiante);
        }*/
        System.out.println(Arrays.toString(ingenieriaDeSistemas.getEstudiantes().toArray()));
        /*ingenieriaDeSistemas.setEstudiantes(estudiantes);
        System.out.println(
            estudiante1.getPrograma().getEstudiantes().get(0).getPrograma().getEstudiantes().get(1));
        */
    }

}
