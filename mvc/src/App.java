import controlador.ControladorCalculadora;
import modelo.Calculadora;
import vista.CalculadoraGUI;
import vista.CalculadoraTerminal;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();
        //CalculadoraTerminal vista = new CalculadoraTerminal();
        CalculadoraGUI vista = new CalculadoraGUI();
        ControladorCalculadora controlador = new ControladorCalculadora(calculadora,vista);
        controlador.inicializacion();
    }
}
