package controlador;

import modelo.Calculadora;
import vista.CalculadoraGUI;
import vista.CalculadoraInterfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorCalculadora implements ActionListener{

    Calculadora calculadora;
    CalculadoraInterfaz vista;
    Operacion operacion;

    public ControladorCalculadora(Calculadora calculadora, CalculadoraInterfaz vista) {
        this.calculadora = calculadora;
        this.vista = vista;
    }

    public Operacion getOperacion() {
        return operacion;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    public void inicializacion(){
        vista.iniciar(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e!=null){
            if(e.getSource()==CalculadoraGUI.sumar){
                setOperacion(Operacion.SUMA);
            }
            if(e.getSource()==CalculadoraGUI.restar){
                setOperacion(Operacion.RESTA);
            }
            if(e.getSource()==CalculadoraGUI.multiplicacion){
                setOperacion(Operacion.MULTIPLICACION);
            }
        }
        int numero1 = vista.getNumero1();
        int numero2 = vista.getNumero2();
        calculadora.setNumero1(numero1);
        calculadora.setNumero2(numero2);
        int resultado=0;
        switch(operacion){
            case SUMA:
                resultado = calculadora.sumar();
                break;
            case RESTA:
                resultado = calculadora.resta();
                break;
            case MULTIPLICACION: 
            resultado = calculadora.multiplicacion();
            break;
        }
        vista.mostrarResultado(resultado+"");
    }
    
}
