package modelo;

public class Calculadora{
    private int numero1, numero2,resultado;

    public Calculadora(){

    }

    

    public int getNumero1() {
        return numero1;
    }



    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }



    public int getNumero2() {
        return numero2;
    }



    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }



    public int getResultado() {
        return resultado;
    }



    public void setResultado(int resultado) {
        this.resultado = resultado;
    }



    public int sumar(){
        resultado = numero1 + numero2;
        return resultado;
    }
    public int resta(){
        resultado = numero1 - numero2;
        return resultado;
    }

    public int multiplicacion(){
        resultado = numero1 * numero2;
        return resultado;
    }
}