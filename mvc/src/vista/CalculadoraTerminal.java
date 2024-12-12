package vista;

import java.util.Scanner;

import controlador.ControladorCalculadora;
import controlador.Operacion;

public class CalculadoraTerminal implements CalculadoraInterfaz {

    int numero1, numero2;

    @Override
    public int getNumero1() {
        return numero1;
    }

    @Override
    public int getNumero2() {
        return numero2;
    }

    @Override
    public void mostrarResultado(String resultado) {
        System.out.println("El resultado es " + resultado);    
    }

    @Override
    public void iniciar(ControladorCalculadora controlador) {
        System.out.println("Bienvenido a la aplicacion!");
        System.out.println("Si quieres sumar presiona 1");
        System.out.println("Si quieres restar presiona 2");
        System.out.println("Si quieres restar presiona 3");
        Scanner scanner = new Scanner(System.in);    
        String opcion = scanner.next();
        String operacion = "";
        switch(opcion){
            case "1": controlador.setOperacion(Operacion.SUMA);
            break;
            case "2": controlador.setOperacion(Operacion.RESTA);
            break;
            case "3": controlador.setOperacion(Operacion.MULTIPLICACION);
            break;
            default:
            System.out.println("Opcion invalida");
        }
        System.out.println("Dame el numero 1");
        numero1 = scanner.nextInt();
        System.out.println("Dame el numero 2");
        numero2 = scanner.nextInt();

        controlador.actionPerformed(null);
    }
    
    

}
