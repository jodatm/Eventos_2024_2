package vista;

import controlador.ControladorCalculadora;

public interface CalculadoraInterfaz {
    public int getNumero1();
    public int getNumero2();
    public void mostrarResultado(String resultado);
    public void iniciar(ControladorCalculadora controlador);
}
